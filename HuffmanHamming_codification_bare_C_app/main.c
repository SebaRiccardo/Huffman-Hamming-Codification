#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <stdbool.h>
#include <string.h>
#include <math.h>
#include <time.h>

#define NRO_DE_LETRAS 256

#define LEFT 'L'
#define RIGHT 'R'

#define CODE_SIZE 256

#define TYPED_ALLOC(type)(type *)malloc(sizeof(type))
#define BYTE_SIZE 8


static int cantidadBytesLeidos=0;
static int cardinalidadArregloChar=0;

typedef struct tree_node_s {
    float frecuencia;
    char caracter;
    char Hcode[CODE_SIZE];
    struct tree_node_s *hijo_izquierdo;
    struct tree_node_s *hijo_derecho;
}tree_nodo_t;

tree_nodo_t *arr[NRO_DE_LETRAS], *letras;

static int bitsSobrantes=0;
static int tamanioHuffman=0;

void imprimeBinario2(unsigned char m[],int indice){

     unsigned int contador=128;

     contador =128;
      while(contador>0){

       if(m[indice]&contador){
           printf("1");
        }else{
           printf("0");
        }
       contador=contador >>1;
      }
      printf(" ");
      printf("\n");
   }
/// CARTELES PARA MOSTRAR ARBOLES
void mostrarABB(tree_nodo_t *A){
    printf("******************************************\n");
    printf("                 PADRE                    \n");
    printf("__________________________________________\n");
    printf("letra %c ",A->caracter);
    printf("freciencia %.3f\t",A->frecuencia);
    printf("codigo:%s\n",A->Hcode);

    if(A->hijo_derecho!=NULL){
      printf("__________________________________________\n");
      printf("             HIJO DERECHA                 \n");
      printf("__________________________________________\n");
      printf("letra %c ",A->hijo_derecho->caracter);
      printf("freciencia %.3f\t",A->hijo_derecho->frecuencia);
      printf("codigo:%s\n",A->hijo_derecho->Hcode);
    }
    else{
      printf("__________________________________________\n");
      printf("La rama DERECHA esta vacia\n");
      printf("__________________________________________\n");
    }
    if(A->hijo_izquierdo!=NULL){
      printf("__________________________________________\n");
      printf("              HIJO IZQUIERDA              \n");
      printf("__________________________________________\n");
      printf("letra %c ",A->hijo_izquierdo->caracter);
      printf("freciencia %.3f\t",A->hijo_izquierdo->frecuencia);
      printf("codigo:%s\n",A->hijo_izquierdo->Hcode);
    }
    else{
      printf("__________________________________________\n");
      printf("La rama IZQUIERDA esta vacia\n");
      printf("__________________________________________\n");
    }
     system("pause");
 }

void mostrarRecursuvo(tree_nodo_t *A){

     if(A!=NULL){
        mostrarABB(A);
        mostrarRecursuvo(A->hijo_izquierdo);
        mostrarRecursuvo(A->hijo_derecho);
     }

 }

float transformarArregloACaracteres(int arregloEnInt[]){

   float exponente = 7.0;
   float sumaValores =0.0;
   int limiteSupp=7;
   int limiteInf=0;

      exponente = 7.0;

      for(int j=limiteInf;j<=limiteSupp;j++){
        if(arregloEnInt[j]==1){
          sumaValores= sumaValores+(powf(2.0,exponente));
          exponente--;
        }else{
          exponente--;
        }
      }
    return sumaValores;
 }

void printTree(tree_nodo_t *node) {

    if( node != NULL ){
         printf("%c Frecuencia: %.10f    - Codificacion: %s\n",node->caracter,node->frecuencia,node->Hcode);
         printTree(node->hijo_izquierdo);
         printTree(node->hijo_derecho);

    }
}

void calcularFrecuencias(unsigned int frecuencias[],char dir[]){
    FILE *entrada;
    entrada=fopen(dir,"rb");
    int posicion;
    while(!feof(entrada)){
        cantidadBytesLeidos++;
        posicion=(int)getc(entrada);
        frecuencias[posicion]=frecuencias[posicion]+1;
    }
    fclose(entrada);
    printf("Cantidad de bytes leidos: %d\n",cantidadBytesLeidos-1);
}

///En las posiciones 0 estan las frecuencias y en las 1 queda el numero del char en la tabla ascii
void organizarArreglo(unsigned int frecuencias[],unsigned int frecuenciasOrdenado[2][NRO_DE_LETRAS], unsigned int *cantidadDeCharsEncontrados){
     *cantidadDeCharsEncontrados=0;
     int aux=0;
     for(int i=0;i<NRO_DE_LETRAS;i++){
        if(frecuencias[i]!=0){
            frecuenciasOrdenado[1][aux]=i;
            frecuenciasOrdenado[0][aux]=frecuencias[i];
            aux=aux+1;
        }
     }
     *cantidadDeCharsEncontrados=aux;
     int j;
     unsigned int aux2;
     unsigned int aux1;
     for(int i=1; i<aux; i++){
        j = i;
        aux1 = frecuenciasOrdenado[0][i];
        aux2 = frecuenciasOrdenado[1][i];
     while(j>0 && aux1<frecuenciasOrdenado[0][j-1]){
        frecuenciasOrdenado[0][j] = frecuenciasOrdenado[0][j-1];
        frecuenciasOrdenado[1][j] = frecuenciasOrdenado[1][j-1];
        j=j-1;
     }
     frecuenciasOrdenado[0][j] = aux1;
     frecuenciasOrdenado[1][j] = aux2;
     }
     cardinalidadArregloChar=*cantidadDeCharsEncontrados;
     printf("cantidad de caracteres distintos leidos %d\n",*cantidadDeCharsEncontrados);
}

void copiarAlArbol(unsigned int frecuencias[2][256],tree_nodo_t **nodos, unsigned int cantidad){

    for(int i=0;i<cantidad;i++){
         nodos[i] = TYPED_ALLOC(tree_nodo_t);
         nodos[i]->caracter =frecuencias[1][i];
         nodos[i]->frecuencia=frecuencias[0][i];
         nodos[i]->hijo_derecho=NULL;
         nodos[i]->hijo_izquierdo=NULL;
    }
}

void ordenarArregloDeNodos(tree_nodo_t **arr,unsigned int *cantidadTotal){
      int j=1;
      tree_nodo_t *temp;
      temp= TYPED_ALLOC(tree_nodo_t);
      /*
      * Corre todas las celdas para que la celda null quede al final
      * en arr[ini] siempre voy a tener un null porque de las dos celdas que uso afuera de la funcion es la que borro
      */
      for(int ini=1;ini<*cantidadTotal;ini++){
        arr[ini]=arr[ini+1];  ///skip nulls
      }
      /*
       Al ultimo lo voy dejando en null
      */
      arr[*cantidadTotal - 1]=NULL;
      *cantidadTotal= *cantidadTotal-1;

      if(*cantidadTotal>2){
        for(int i=0;i<*cantidadTotal;i++){
          j=i+1;
          while(j<*cantidadTotal-1){
             if(arr[j]!=NULL && arr[j]->frecuencia < arr[i]->frecuencia ){

               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
             } else {
                j++;
             }
          }
        }
      }else{
         if(arr[1]->frecuencia<arr[0]->frecuencia){
            temp=arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
         }
      }
}

void codificacionDelArbol(tree_nodo_t *node,char direccion,short nivel,char* code){
   int n;
   if(node!=NULL){
      if ((n = strlen(code)) < nivel) {
            if (direccion == RIGHT) {
                strcat(code, "1");
            } else {
                if (direccion == LEFT) {
                    strcat(code, "0");
                }
            }
        } else {
            if (n >= nivel) {
                code[n - (n - nivel) - 1] = 0;
                if (direccion == RIGHT) {
                    strcat(code, "1");
                } else {
                    if (direccion == LEFT) {
                        strcat(code, "0");
                    }
                }
            }
        }
      strcpy(node->Hcode,code);
      codificacionDelArbol(node->hijo_izquierdo,LEFT,nivel+1,code);
      codificacionDelArbol(node->hijo_derecho,RIGHT,nivel+1,code);
   }else{
     code="";
   }

}

void recorrerArbolRecursivo(char caracterLeido,tree_nodo_t *l,FILE *salida,unsigned char mascara_1[],unsigned char mascara_0[],unsigned char byte[],int *restantes){

   if(l!=NULL){

     if(l->caracter!= caracterLeido){
         recorrerArbolRecursivo(caracterLeido,l->hijo_izquierdo,salida,mascara_1,mascara_0,byte,restantes);
         recorrerArbolRecursivo(caracterLeido,l->hijo_derecho,salida,mascara_1,mascara_0,byte,restantes);
     }else{

       int i=0;
       while(i<strlen(l->Hcode)){
         if(l->Hcode[i]=='1'){
             /// con a mascara 10000000 hacer or con el char donde voy guardar.
             byte[0]=  mascara_1[0]| byte[0];
         }else{
             byte[0]=  mascara_0[0]| byte[0];
         }
         mascara_1[0]=mascara_1[0]>>1;
         i++;
         *restantes= *restantes-1;

         if(*restantes==0){
             /// cuando completa un char entero lo guarda en el archivo de salida.
             fputc(byte[0],salida);
             byte[0]=0;
             *restantes=8;
             mascara_1[0]=128;
         }
       }
     }
   }
}

void codificacion(char *dirInput,char *dirOutPut){

     FILE *entrada,*salida;

     entrada=fopen(dirInput,"r");
     salida=fopen(dirOutPut,"a");
     int res=8;
     int caracter;
     int *restantes;
     unsigned char mascara_1[1];
     unsigned char mascara_0[1];
     unsigned char mascara_128;
     unsigned char caracterAguardar[1];
     mascara_0[0]=0;
     mascara_1[0]=128;
     mascara_128=128;
     restantes=&res;
     caracterAguardar[0]=0;

    if(entrada!=NULL){
      while(!feof(entrada)){
        ///obtiene un caracter y recorre el arbol de forma recursiva
        caracter=(int)getc(entrada);
        recorrerArbolRecursivo(caracter,letras,salida,mascara_1,mascara_0,caracterAguardar,restantes);
      }
      if(*restantes==8){
         puts("se completo el byte con el ultimo char");
      }else{

         bitsSobrantes=8-*restantes;
         /*
         * shifteo la mascara segun la cantidad de bits que sobraron
         */
         int y=0;
         while(y<8-*restantes){
            mascara_128=mascara_128>>1;
            y++;
         }
         /*
         * agrego unos(1) para completar el byte incompleto
         */
         for(int j=0;j<*restantes;j++){
            caracterAguardar[0]= caracterAguardar[0] | mascara_128;
            mascara_128=mascara_128>>1;
         }
         fputc(caracterAguardar[0],salida);
      }
    }else{
     puts("no se pudo abrir el archivo de info");
    }

    fclose(entrada);
    fclose(salida);
}

void copiarArchivos(char *ar1,char *ar2){


 FILE *file1 , *file2;
    int data1 =0;

    file1 = fopen ( ar1, "rb" );
    file2 = fopen ( ar2 , "w" );

    while ((data1 = fgetc ( file1 )) != EOF){
        fputc ( data1, file2 );
    }
    rewind(file1);
    rewind(file2);
    fclose ( file1 );
    fclose ( file2 );


}

void decodificar(char *dirInput,char *dirOutPut){


       FILE *entrada,*salida;

       entrada=fopen(dirInput,"rb");
       salida=fopen(dirOutPut,"a");
       int contador=0,contadorTamArchivo=0;
       int caracter,stop=1;
       tree_nodo_t *temp;
       temp = TYPED_ALLOC(tree_nodo_t);
       unsigned char mascara_128=128;
       caracter=(int)getc(entrada);
       contadorTamArchivo++;
       int flag = 0;

       while(!feof(entrada)){

         temp = letras;

            while(temp->hijo_derecho!=NULL && temp->hijo_izquierdo!=NULL){
               flag =0;
               if(mascara_128 & caracter){
                 temp=temp->hijo_derecho;
               }else{
                 temp=temp->hijo_izquierdo;
               }

               mascara_128=mascara_128>>1;
               contador++;

               if(contador==8){
                 contador=0;
                 caracter=(int)getc(entrada);
                 contadorTamArchivo++;
                 mascara_128=128;

                 if(temp->hijo_derecho==NULL && temp->hijo_izquierdo==NULL){
                   fputc(temp->caracter,salida);
                   flag=1;
                   temp = letras;
                 }
                 /*
                 * ultimo byte del archivo con huffman
                 */
                 if(contadorTamArchivo==tamanioHuffman){
                     int cuentaSobra=0;

                     while(cuentaSobra<bitsSobrantes){
                        while(temp->hijo_derecho!=NULL && temp->hijo_izquierdo!=NULL){

                            if(mascara_128 & caracter){
                                temp=temp->hijo_derecho;
                            }else{
                                temp=temp->hijo_izquierdo;
                            }

                            mascara_128=mascara_128>>1;
                            cuentaSobra++;
                        }
                        fputc(temp->caracter,salida);
                        temp = letras;
                     }
                     stop=0; // es un flag para quen escriba dos veces el ultimo char
                 }
               }
           }

            if(flag==0 && stop==1){
               fputc(temp->caracter,salida);
            }
      }
      fclose(entrada);
      fclose(salida);
      puts("Descompacto con exito");

}

void GuardarArbolEnArchivo(){
    int i=0;
    FILE *fp;
	if((fp=fopen("arbol.str","w"))==NULL){
        printf("ERROR: no se pudo abrir el archivo\n");
    }
    else{
         // Guarda las variables globales

        fwrite(&cardinalidadArregloChar,sizeof(int),1,fp);
        fwrite(&bitsSobrantes,sizeof(int),1,fp);
        fwrite(&cantidadBytesLeidos,sizeof(int),1,fp);


		for(i=0;i<cardinalidadArregloChar;i++){

            fwrite(arr[i],sizeof(tree_nodo_t),1,fp);
		}
		printf("La Carga se ha Realizado con Exito!\n\n");
	}
	fclose(fp);

}

void CargarArbolEnRAM(){

    FILE *fp;
    tree_nodo_t nuevoarr[NRO_DE_LETRAS];

	if((fp=fopen("arbol.str","r"))==NULL){
        printf("ERROR: no se pudo abrir el archivo\n");
    }else{
        // Carga las variables globales
        fread(&cardinalidadArregloChar,sizeof(int),1,fp);
        fread(&bitsSobrantes,sizeof(int),1,fp);
        fread(&cantidadBytesLeidos,sizeof(int),1,fp);

		for(int i=0;i<cardinalidadArregloChar;i++){
            arr[i]=TYPED_ALLOC(tree_nodo_t);
            fread(arr[i],sizeof(tree_nodo_t),1,fp);
		}
	}

	fclose(fp);

}

void armarArbol(){

  CargarArbolEnRAM();

  int cantidadDeCharsEncontrados=0;
  cantidadDeCharsEncontrados=cardinalidadArregloChar;
  tree_nodo_t *arbol;
  tree_nodo_t *temp;


  do{
       temp = TYPED_ALLOC(tree_nodo_t);
       arbol = TYPED_ALLOC(tree_nodo_t);
       arbol->frecuencia= arr[0]->frecuencia + arr[1]->frecuencia;
       arbol->hijo_izquierdo=arr[0];
       arbol->caracter = '*';
       temp->frecuencia= arr[1]->frecuencia;
       temp->hijo_izquierdo=arr[1]->hijo_izquierdo;
       temp->hijo_derecho=arr[1]->hijo_derecho;
       temp->caracter=arr[1]->caracter;
       arbol->hijo_derecho=temp;
       arr[0]=arbol;
       arr[1]=NULL;
       ordenarArregloDeNodos(arr,&cantidadDeCharsEncontrados);


    }while(2<cantidadDeCharsEncontrados);

      letras= TYPED_ALLOC(tree_nodo_t);
      letras->hijo_derecho=arr[1];
      letras->hijo_izquierdo=arr[0];
      letras->caracter = '+';
}

void compactar(char *informacion,char *archivoCompactado){

   unsigned int frecuencias[256];
   unsigned int frecuenciasOrdenadas[2][256];
   unsigned int cantidadDeCharsEncontrados;
   char HuffmanCode[CODE_SIZE];
   tree_nodo_t *arbol;
   FILE *input;
   input=fopen(informacion,"rb");

   if(input!=NULL){

     fclose(input);

    for(int i=0;i<NRO_DE_LETRAS;i++){
        frecuencias[i]=0;
    }
    calcularFrecuencias(frecuencias,informacion);
    organizarArreglo(frecuencias,frecuenciasOrdenadas,&cantidadDeCharsEncontrados);
    copiarAlArbol(frecuenciasOrdenadas,arr,cantidadDeCharsEncontrados);


    for(int x=0;x<cantidadDeCharsEncontrados;x++){  // calcula las frecuencias
       arr[x]->frecuencia=arr[x]->frecuencia/(cantidadBytesLeidos-1);
    }

    GuardarArbolEnArchivo(); // guardo el arreglo de nodos en un archivo srt

    do{
       tree_nodo_t *temp;

       temp = TYPED_ALLOC(tree_nodo_t);
       arbol = TYPED_ALLOC(tree_nodo_t);

       arbol->frecuencia= arr[0]->frecuencia + arr[1]->frecuencia;
       arbol->hijo_izquierdo=arr[0];
       arbol->caracter = '*';
       temp->frecuencia= arr[1]->frecuencia;
       temp->hijo_izquierdo=arr[1]->hijo_izquierdo;
       temp->hijo_derecho=arr[1]->hijo_derecho;
       temp->caracter=arr[1]->caracter;
       arbol->hijo_derecho=temp;
       arr[0]=arbol;
       arr[1]=NULL;
       ordenarArregloDeNodos(arr,&cantidadDeCharsEncontrados);

    }while(2<cantidadDeCharsEncontrados);

     letras= TYPED_ALLOC(tree_nodo_t);
     letras->hijo_derecho=arr[1];
     letras->hijo_izquierdo=arr[0];

     letras->caracter = '+';

     strcpy(HuffmanCode,"");
     /// A esta altura e arbol quedo creado pero no codificado con sus respecivos codigo de huffman

     codificacionDelArbol(letras,0,0,HuffmanCode);

    // printTree(letras);

     codificacion(informacion,archivoCompactado);
     puts("\nCodificado con exito\n");
   }else{
      printf("no se pudo abrir el archivo con la informacion ");
   }
}

void mostrarArchivo(char* dir){

 FILE *entrada;
 char caracter;
 entrada=fopen(dir,"r");
 if(entrada){
 puts("\n\tInicio del archivo!\n");
 while(!feof(entrada)){
    caracter= getc(entrada);
    printf("%c",caracter);
 }
  puts("\n------------------------------Fin del archivo---------------------------------\n");
  fclose(entrada);
 }else{
  puts("\nel archivo no se pudo abrir\n");
 }
}

void estadisticas(char* original,char* compactado,char* descompactado){
  FILE *in1,*in2,*in3;
  in1=fopen(original,"r");
  in2=fopen(compactado,"r");
  in3=fopen(descompactado,"r");
  if(in1 && in2){

   fseek(in1,0L,SEEK_END);
   fseek(in2,0L,SEEK_END);
   fseek(in3,0L,SEEK_END);
   printf("ORIGINAL:     %ld Bytes\n",ftell(in1));
   printf("COMPACTADO:   %ld Bytes\n",ftell(in2));
   printf("DESCOPACTADO: %ld Bytes\n",ftell(in3));
  fclose(in1);
  fclose(in2);
  fclose(in3);
  }
}

void tamaioArchivo(char* dir,char* tipo){
     FILE *in1;
     in1=fopen(dir,tipo);
     fseek(in1,0L,SEEK_END);

     tamanioHuffman=ftell(in1);

     rewind(in1);
     fclose(in1);

}


int main(int argc, char *argv[]){


 int opcion=0;
 if(argc==4){

  opcion= *argv[3]-48;
  switch(opcion){

   case 1:
    compactar(argv[1],argv[2]);
   break;

   case 2:
    armarArbol();
    tamaioArchivo(argv[1],"rb");
    decodificar(argv[1],argv[2]);
    break;
  }

 }else{
     if(argc==5){
        opcion= *argv[4]-48;
       if(opcion==1){
        estadisticas(argv[1],argv[2],argv[3]);
       }
     }else{
       puts("faltan argumentos");
     }

 }
  return 0;
 }


