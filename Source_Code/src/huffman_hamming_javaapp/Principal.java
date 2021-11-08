
package huffman_hamming_javaapp;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Principal extends javax.swing.JFrame {
         
         private  String huffmanFileName ="";
         private  String informationFile="";
         private  int running=0;
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.AreaDeTexto1.setEditable(false);
        this.PanelBotonesHamming.setVisible(false);
        this.PanelBotonesHuffman.setVisible(false);
        this.checkOK1.setVisible(false);
        
        
        
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaDeTexto2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaDeTexto1 = new javax.swing.JTextArea();
        fondo = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        PanelBotonesHamming = new javax.swing.JPanel();
        Proteger = new javax.swing.JLabel();
        tamanioDeBLoque = new javax.swing.JLabel();
        introducirErrores = new javax.swing.JLabel();
        Desproteger = new javax.swing.JLabel();
        BotonProteger = new javax.swing.JButton();
        desproteger = new javax.swing.JButton();
        BotonIntrucirErrores = new javax.swing.JButton();
        jCheckBoxCorreccion = new javax.swing.JCheckBox();
        jComboBoxTipoBloque = new javax.swing.JComboBox<>();
        HUFFMAN = new javax.swing.JLabel();
        HAMMING = new javax.swing.JLabel();
        archivocompactadoLabel = new javax.swing.JLabel();
        huffmanToogle = new javax.swing.JToggleButton();
        hammingToogle = new javax.swing.JToggleButton();
        PanelBotonesHuffman = new javax.swing.JPanel();
        descompactar = new javax.swing.JLabel();
        estadisticas = new javax.swing.JLabel();
        compactar = new javax.swing.JLabel();
        verArchivos = new javax.swing.JLabel();
        BotonVerArchivos = new javax.swing.JButton();
        BotonEstadisticas = new javax.swing.JButton();
        BotonCompactar = new javax.swing.JButton();
        BotonDescompactar = new javax.swing.JButton();
        borrartextolabel = new javax.swing.JLabel();
        BotonBorrar = new javax.swing.JButton();
        checkOK1 = new javax.swing.JLabel();
        checkNOT1 = new javax.swing.JLabel();
        BotonBusquedaInfoFile1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        jMenuItemAbriArchivo = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        MenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1408, 890));
        setResizable(false);
        setSize(new java.awt.Dimension(1408, 890));
        getContentPane().setLayout(null);

        PanelPrincipal.setBackground(new java.awt.Color(204, 255, 204));
        PanelPrincipal.setLayout(null);

        AreaDeTexto2.setEditable(false);
        AreaDeTexto2.setBackground(new java.awt.Color(144, 218, 254));
        AreaDeTexto2.setColumns(20);
        AreaDeTexto2.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        AreaDeTexto2.setLineWrap(true);
        AreaDeTexto2.setRows(7);
        AreaDeTexto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AreaDeTexto2.setMaximumSize(new java.awt.Dimension(220, 85));
        jScrollPane2.setViewportView(AreaDeTexto2);

        PanelPrincipal.add(jScrollPane2);
        jScrollPane2.setBounds(0, 440, 1220, 390);

        AreaDeTexto1.setEditable(false);
        AreaDeTexto1.setBackground(new java.awt.Color(144, 218, 254));
        AreaDeTexto1.setColumns(20);
        AreaDeTexto1.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        AreaDeTexto1.setLineWrap(true);
        AreaDeTexto1.setRows(7);
        AreaDeTexto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AreaDeTexto1.setMaximumSize(new java.awt.Dimension(220, 85));
        AreaDeTexto1.setMinimumSize(new java.awt.Dimension(220, 85));
        jScrollPane3.setViewportView(AreaDeTexto1);

        PanelPrincipal.add(jScrollPane3);
        jScrollPane3.setBounds(0, 10, 1220, 420);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        PanelPrincipal.add(fondo);
        fondo.setBounds(-30, 0, 1300, 1000);

        getContentPane().add(PanelPrincipal);
        PanelPrincipal.setBounds(180, 0, 1230, 870);

        sidePanel.setBackground(new java.awt.Color(0, 140, 232));
        sidePanel.setLayout(null);

        PanelBotonesHamming.setOpaque(false);
        PanelBotonesHamming.setLayout(null);

        Proteger.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        Proteger.setText("Proteger");
        PanelBotonesHamming.add(Proteger);
        Proteger.setBounds(10, 90, 100, 30);

        tamanioDeBLoque.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        tamanioDeBLoque.setText("Tamaño de bloque");
        PanelBotonesHamming.add(tamanioDeBLoque);
        tamanioDeBLoque.setBounds(10, 0, 150, 30);

        introducirErrores.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        introducirErrores.setText("Introducir errores");
        PanelBotonesHamming.add(introducirErrores);
        introducirErrores.setBounds(10, 140, 160, 30);

        Desproteger.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        Desproteger.setText("Desproteger");
        PanelBotonesHamming.add(Desproteger);
        Desproteger.setBounds(10, 180, 100, 50);

        BotonProteger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonProteger.setText("Proteger");
        BotonProteger.setBorderPainted(false);
        BotonProteger.setContentAreaFilled(false);
        BotonProteger.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonProteger.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonProteger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProtegerActionPerformed(evt);
            }
        });
        PanelBotonesHamming.add(BotonProteger);
        BotonProteger.setBounds(0, 80, 180, 50);

        desproteger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        desproteger.setText("Proteger");
        desproteger.setBorderPainted(false);
        desproteger.setContentAreaFilled(false);
        desproteger.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        desproteger.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        desproteger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desprotegerActionPerformed(evt);
            }
        });
        PanelBotonesHamming.add(desproteger);
        desproteger.setBounds(0, 130, 180, 50);

        BotonIntrucirErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonIntrucirErrores.setText("Proteger");
        BotonIntrucirErrores.setBorderPainted(false);
        BotonIntrucirErrores.setContentAreaFilled(false);
        BotonIntrucirErrores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonIntrucirErrores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonIntrucirErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIntrucirErroresActionPerformed(evt);
            }
        });
        PanelBotonesHamming.add(BotonIntrucirErrores);
        BotonIntrucirErrores.setBounds(0, 180, 180, 50);

        jCheckBoxCorreccion.setFont(new java.awt.Font("Noto Sans Mono", 0, 13)); // NOI18N
        jCheckBoxCorreccion.setText("Sin corregir");
        jCheckBoxCorreccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCorreccionActionPerformed(evt);
            }
        });
        PanelBotonesHamming.add(jCheckBoxCorreccion);
        jCheckBoxCorreccion.setBounds(0, 240, 130, 27);

        jComboBoxTipoBloque.setBackground(new java.awt.Color(0, 156, 255));
        jComboBoxTipoBloque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "256 bit", "1024 bit", "2048 bit", "4096 bit" }));
        jComboBoxTipoBloque.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelBotonesHamming.add(jComboBoxTipoBloque);
        jComboBoxTipoBloque.setBounds(10, 30, 160, 40);

        sidePanel.add(PanelBotonesHamming);
        PanelBotonesHamming.setBounds(0, 180, 180, 270);

        HUFFMAN.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        HUFFMAN.setText("Huffman");
        sidePanel.add(HUFFMAN);
        HUFFMAN.setBounds(50, 120, 80, 50);

        HAMMING.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        HAMMING.setText("Hamming");
        sidePanel.add(HAMMING);
        HAMMING.setBounds(50, 60, 80, 60);

        archivocompactadoLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        archivocompactadoLabel.setText("Abrir archivo");
        sidePanel.add(archivocompactadoLabel);
        archivocompactadoLabel.setBounds(50, 10, 110, 40);

        huffmanToogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        huffmanToogle.setBorderPainted(false);
        huffmanToogle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonRollOVer.jpg"))); // NOI18N
        huffmanToogle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        huffmanToogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huffmanToogleActionPerformed(evt);
            }
        });
        sidePanel.add(huffmanToogle);
        huffmanToogle.setBounds(0, 115, 180, 55);

        hammingToogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        hammingToogle.setBorderPainted(false);
        hammingToogle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonRollOVer.jpg"))); // NOI18N
        hammingToogle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        hammingToogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hammingToogleActionPerformed(evt);
            }
        });
        sidePanel.add(hammingToogle);
        hammingToogle.setBounds(0, 60, 180, 55);

        PanelBotonesHuffman.setLayout(null);

        descompactar.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        descompactar.setText("Descompactar");
        PanelBotonesHuffman.add(descompactar);
        descompactar.setBounds(10, 50, 130, 50);

        estadisticas.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        estadisticas.setText("Estadisticas");
        PanelBotonesHuffman.add(estadisticas);
        estadisticas.setBounds(10, 150, 160, 50);

        compactar.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        compactar.setText("Compactar");
        PanelBotonesHuffman.add(compactar);
        compactar.setBounds(10, 10, 150, 30);

        verArchivos.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        verArchivos.setText("Ver archivos");
        PanelBotonesHuffman.add(verArchivos);
        verArchivos.setBounds(10, 100, 130, 50);

        BotonVerArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonVerArchivos.setBorderPainted(false);
        BotonVerArchivos.setContentAreaFilled(false);
        BotonVerArchivos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonVerArchivos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonVerArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerArchivosActionPerformed(evt);
            }
        });
        PanelBotonesHuffman.add(BotonVerArchivos);
        BotonVerArchivos.setBounds(0, 100, 180, 50);

        BotonEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonEstadisticas.setBorderPainted(false);
        BotonEstadisticas.setContentAreaFilled(false);
        BotonEstadisticas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonEstadisticas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadisticasActionPerformed(evt);
            }
        });
        PanelBotonesHuffman.add(BotonEstadisticas);
        BotonEstadisticas.setBounds(0, 150, 180, 50);

        BotonCompactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonCompactar.setBorderPainted(false);
        BotonCompactar.setContentAreaFilled(false);
        BotonCompactar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonCompactar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonCompactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCompactarActionPerformed(evt);
            }
        });
        PanelBotonesHuffman.add(BotonCompactar);
        BotonCompactar.setBounds(0, 0, 180, 50);

        BotonDescompactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windowsblue_1.jpg"))); // NOI18N
        BotonDescompactar.setBorderPainted(false);
        BotonDescompactar.setContentAreaFilled(false);
        BotonDescompactar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonDescompactar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonDescompactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDescompactarActionPerformed(evt);
            }
        });
        PanelBotonesHuffman.add(BotonDescompactar);
        BotonDescompactar.setBounds(0, 50, 180, 50);

        sidePanel.add(PanelBotonesHuffman);
        PanelBotonesHuffman.setBounds(0, 450, 180, 200);

        borrartextolabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        borrartextolabel.setText("  Borrar texto");
        sidePanel.add(borrartextolabel);
        borrartextolabel.setBounds(20, 700, 150, 40);

        BotonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonRollOVer.jpg"))); // NOI18N
        BotonBorrar.setBorderPainted(false);
        BotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonBorrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        sidePanel.add(BotonBorrar);
        BotonBorrar.setBounds(0, 700, 180, 40);

        checkOK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icons/2_32.png"))); // NOI18N
        checkOK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOK1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkOK1MouseEntered(evt);
            }
        });
        sidePanel.add(checkOK1);
        checkOK1.setBounds(10, 10, 30, 40);

        checkNOT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Icons/8_32.png"))); // NOI18N
        sidePanel.add(checkNOT1);
        checkNOT1.setBounds(10, 10, 40, 40);

        BotonBusquedaInfoFile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonRollOVer.jpg"))); // NOI18N
        BotonBusquedaInfoFile1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotonBusquedaInfoFile1.setBorderPainted(false);
        BotonBusquedaInfoFile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBusquedaInfoFile1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonPressed.jpg"))); // NOI18N
        BotonBusquedaInfoFile1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/botonselected.jpg"))); // NOI18N
        BotonBusquedaInfoFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaInfoFile1ActionPerformed(evt);
            }
        });
        sidePanel.add(BotonBusquedaInfoFile1);
        BotonBusquedaInfoFile1.setBounds(50, 10, 110, 40);

        getContentPane().add(sidePanel);
        sidePanel.setBounds(0, 0, 180, 870);

        jMenuBar1.setBackground(new java.awt.Color(58, 141, 206));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(38, 157, 197));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Noto Sans Mono", 0, 14)); // NOI18N
        jMenuBar1.setOpaque(false);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(96, 30));

        MenuArchivo.setText("Archivo");

        jMenuItemAbriArchivo.setText("Abrir archivo");
        jMenuItemAbriArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbriArchivoActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItemAbriArchivo);

        jMenuBar1.add(MenuArchivo);

        MenuAyuda.setText("Ayuda");

        MenuItemAcerca.setText("Acerca.");
        MenuAyuda.add(MenuItemAcerca);

        jMenuBar1.add(MenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    // FUNCIONES HUFFMAN CODE
    public void Descompactar() throws IOException{
        
        String formato=".+\\.(HUF$)";
        Pattern p = Pattern.compile(formato);
        Matcher m = p.matcher(informationFile);
        ProcessBuilder pb;
        Process proceso;
        BufferedReader br;
        
        if(m.find()){
           
           this.buscarArchivo(2,0);  
           
           if(!this.huffmanFileName.equals("")){ 
           
             String linea="";   
             String dir= System.getProperty("user.dir");
             String command[]={dir+"/./Huffman",informationFile,huffmanFileName+".DUF","2"};
           
             pb = new ProcessBuilder(command);
             proceso = pb.start();
             br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            
             while((linea=br.readLine())!=null){         
              this.AreaDeTexto1.append(linea+"\n");         
             }
            
             this.checkNOT1.setVisible(true);
             this.checkOK1.setVisible(false);
            
             this.informationFile="";
             this.huffmanFileName="";
           }else{
             JOptionPane.showMessageDialog(rootPane,"Falta ruta donde se guardara el archivo descompactado"); 
           }
        }else{
             JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo con la informacion en formato (.HUF)"); 
             this.informationFile="";
             this.checkNOT1.setVisible(true);
             this.checkOK1.setVisible(false);
         }
   }
    
    public void Compactar() throws IOException{
         
         String linea=""; 
         String dir= System.getProperty("user.dir");
         ProcessBuilder pb;
         BufferedReader br;
         Process proceso;
         int flag =0;
         
        if(!informationFile.equals("")){
             this.buscarArchivo(2,0);  
                   
           if(!huffmanFileName.equals("") && !informationFile.equals(huffmanFileName)){ 
                     
              this.AreaDeTexto1.append("COMPACTANDO CON HUFFMAN...\n");   
                      
              String command[]={dir+"/./Huffman",informationFile,huffmanFileName+".HUF","1"};      
              
              pb = new ProcessBuilder(command); 
              
              proceso = pb.start();      
              
              br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                  
              while((linea=br.readLine())!=null){         
                this.AreaDeTexto1.append(linea+"\n");         
              }
            
              try{
               int exitValue = proceso.waitFor();
               System.out.println("\nCódigo de salida: "+ exitValue);
              } catch (InterruptedException e) {
                e.printStackTrace(System.err);
              }

              this.checkNOT1.setVisible(true);
              this.checkOK1.setVisible(false);

              this.informationFile="";
              this.huffmanFileName="";  
        
           }else{
               if(informationFile.equals(huffmanFileName)){
                 JOptionPane.showMessageDialog(rootPane,"La ruta no valida(mismo destino)");         
               }else{
                 JOptionPane.showMessageDialog(rootPane,"Falta ruta donde se guardara el archivo compactado");
               }     
           } 
        }else{
             JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo con la informacion"); 
            
             this.informationFile="";
             this.checkNOT1.setVisible(true);
             this.checkOK1.setVisible(false);
             
         }
         
    }
    
    public void VerArchivos() throws FileNotFoundException, IOException{
       
     String rutaArchivo1="",rutaArchivo2="";
     
     boolean iguales =false;
     String linea,linea2="";
     
     
     rutaArchivo1=buscarArchivo(1,1);
     rutaArchivo2=buscarArchivo(1,3);
        
     if(!rutaArchivo1.equals("") && !rutaArchivo2.equals("")){
    
        this.AreaDeTexto1.setText("");
        
        File infoFile1 = new File(rutaArchivo1);
        File infoFile2 = new File(rutaArchivo2);
      
        
        FileReader fr = new FileReader (infoFile1);
        BufferedReader br = new BufferedReader(fr);
        
        FileReader fr2 = new FileReader (infoFile2);
        BufferedReader br2 = new BufferedReader(fr2);
        
        
           linea = br.readLine();
           linea2 = br2.readLine();
        
               while ((linea!=null) && (linea2!=null)) {
                      System.out.print("entro al while\n");
                      this.AreaDeTexto1.append(linea);
                      this.AreaDeTexto2.append(linea2); 
                  
                  if(!linea.equals(linea2)){
                       iguales = false;
                  }else{
                       iguales=true;
                  }
                      linea = br.readLine();
                      linea2 = br2.readLine();
               } 
               System.out.print("salio\n");
        
        
            if ((iguales) && (linea==null) && (linea2==null))
                this.AreaDeTexto1.append("\n Los ficheros son iguales");
            else
                this.AreaDeTexto1.append("\n Los ficheros son diferentes");  
               
               
      
         this.checkNOT1.setVisible(true);
         this.checkOK1.setVisible(false);
         this.informationFile="";
       }else{
         JOptionPane.showMessageDialog(rootPane,"seleccione los archivos que desea visualizar");
         
       } 
     
    }
    
    public void VerEstadisticas() throws FileNotFoundException, IOException{
     
        
     if(!informationFile.equals("")){   
       
       
       String formato=".+\\.(HUF$)";
       String formato2=".+\\.(DUF$)";
       String rutaArchivo1="",rutaArchivo2="",rutaArchivo3="";
       Pattern p = Pattern.compile(formato);
       Pattern p2 = Pattern.compile(formato2);
       JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo compactado y finalmente \n"
                                               + "el archivo descompactado");
       
       rutaArchivo2=buscarArchivo(1,2); // abre los jfile chossers
       rutaArchivo3=buscarArchivo(1,3);
       
       Matcher m = p.matcher(rutaArchivo2);
       Matcher m2 = p2.matcher(rutaArchivo3); 
  
       if(m.find()){
          if(m2.find()){
    
            String linea="";   
            String dir= System.getProperty("user.dir");
            String command[]={dir+"/./Huffman",informationFile,rutaArchivo2,rutaArchivo3,"1"};
     
            ProcessBuilder pb = new ProcessBuilder(command);
            Process proceso = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            
            this.AreaDeTexto1.append("\nTamaños de los archivos\n");
            while((linea=br.readLine())!=null){         
              this.AreaDeTexto1.append(linea+"\n");         
            }
            
            this.checkNOT1.setVisible(true);
            this.checkOK1.setVisible(false);
            this.informationFile="";
          }else{
            JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo con formato (.DUF)");
          }
       }else{
         JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo con formato (.HUF)");   
       }   
     }else{
       JOptionPane.showMessageDialog(rootPane,"Seleccione el archivo con la informacion"); 
     }     
    }
    
    private String buscarArchivo(int opt,int tipo){
      
        JFileChooser fc = new JFileChooser();
        File ruteDefaultOpen;
        int creada=0;
        String rutaArchivo="";
        
            ruteDefaultOpen = new File(System.getProperty("user.home"));
            fc.setCurrentDirectory(ruteDefaultOpen);
            
            switch(tipo){
            
                case 0:
                    fc.setDialogTitle("Archivo");
                break;
                
                 case 1:
                    fc.setDialogTitle("Archivo Original");
                break;
                 case 2:
                    fc.setDialogTitle("Archivo Compactado");
                break;
                 case 3:
                    fc.setDialogTitle("Archivo Descompactado");
                break;
            }
                
            
            if(opt==1){
                creada = fc.showDialog(null,"Seleccionar");
            }else{
                creada = fc.showDialog(null,"Guardar");
            }
            
            
            if(creada==JFileChooser.APPROVE_OPTION){
                File ruta = fc.getSelectedFile();
                switch(opt){ // segun la opcion le asigna el nombre a un solo archivo 
                    case 1:
                        this.informationFile= ruta.toString();
                        rutaArchivo=ruta.toString();
                        
                        this.checkOK1.setVisible(true);
                        this.checkNOT1.setVisible(false);
                        
                    break;
                    
                    case 2:
                        this.huffmanFileName= ruta.toString();
                                            
                    break;   
                }    
            }
      return rutaArchivo;
    }
    
    private void Borrar(){    
     this.AreaDeTexto1.setText("");
     this.AreaDeTexto2.setText("");
    }
    
    private void BotonCompactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCompactarActionPerformed
  
              try {    
                 Compactar();
              }catch(IOException ex){
                System.out.print(ex);
              }       
    }//GEN-LAST:event_BotonCompactarActionPerformed
     
    // FUNCIONES HAMMING CODE
    private void proteger() throws IOException{  // test proteger 256
    
           if(!this.informationFile.equals("")){
               String tipoDeBloque="";
               
               String dir= System.getProperty("user.dir");
               ProcessBuilder pb;
               Process p;
               tipoDeBloque=  (String) this.jComboBoxTipoBloque.getSelectedItem();
               
               switch(tipoDeBloque){
                   case "256 bit":
                    
                     String command1[]= {dir+"/./hamming2punto0",this.informationFile ,"1","1"};
                    
                     this.AreaDeTexto1.append("Protegiendo archivo con hamming: tipo de bloque 256 bit\n");
                     pb = new ProcessBuilder(command1);
                     p=  pb.start();
                     
                     this.AreaDeTexto1.append("El archivo ha sido protegido con formato(.HA1)\n");
                     
                       
                     
                   break;
                   
                   case "1024 bit":
                     String command2[]= {dir+"/./hamming2punto0",this.informationFile ,"1","2"};
                     this.AreaDeTexto1.append("Protegiendo archivo con hamming: tipo de bloque 1024 bit\n");
                     pb = new ProcessBuilder(command2);
                     pb.start();
                     this.AreaDeTexto1.append("El archivo ha sido protegido con formato(.HA2)\n");
                     
                       
                       
                   break;
                   
                   case "2048 bit":
                     String command3[]= {dir+"/./hamming2punto0",this.informationFile ,"1","3"};
                     this.AreaDeTexto1.append("Protegiendo archivo con hamming: tipo de bloque 2048 bit\n");
                     pb = new ProcessBuilder(command3); 
                     pb.start();
                     this.AreaDeTexto1.append("El archivo ha sido protegido con formato(.HA3)\n");
                     
                       
                   break;
                   
                   case "4096 bit":
                     
                     String command4[]= {dir+"/./hamming2punto0",this.informationFile ,"1","4"};
                     this.AreaDeTexto1.append("Protegiendo archivo con hamming: tipo de bloque 4096 bit\n");
                     pb = new ProcessBuilder(command4);
                     pb.start();
                     this.AreaDeTexto1.append("El archivo ha sido protegido con formato(.HA4)\n");
                     
                       
                   break;
                   
               }
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
               
           }else{
              JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un archivo para proteger!");
           }
    }
    
    private void introducirErrores() throws IOException{
    
          if(!this.informationFile.equals("")){
          
               String tipoDeBloque="";
               String formato256=".+\\.HA1";
               String formato1024=".+\\.HA2";
               String formato2048=".+\\.HA3";
               String formato4096=".+\\.HA4";
               
               String dir= System.getProperty("user.dir");
               
               Pattern p1= Pattern.compile(formato256);
               Pattern p2= Pattern.compile(formato1024);
               Pattern p3= Pattern.compile(formato2048);
               Pattern p4= Pattern.compile(formato4096);
              
               Matcher m1= p1.matcher(this.informationFile);
               Matcher m2= p2.matcher(this.informationFile);
               Matcher m3= p3.matcher(this.informationFile);
               Matcher m4= p4.matcher(this.informationFile);
               
               ProcessBuilder pb;
               
               tipoDeBloque=  (String) this.jComboBoxTipoBloque.getSelectedItem();
             
               switch(tipoDeBloque){
                   case "256 bit":
                    
                    if(m1.find()){
                      
                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,"2","1"};
                      this.AreaDeTexto1.append("Introduciendo errores en archivo: tipo de bloque 256 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      this.AreaDeTexto1.append("El archivo con errores ha sido creado con formato(.HE1)\n");
                     
                      
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 256 BIT: \nDebe seleccionar un archivo con formato tipo (.HA1) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                   break;
                   
                   case "1024 bit":
                     if(m2.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,"2","2"};
                     
                      this.AreaDeTexto1.append("Introduciendo errores en archivo: tipo de bloque 1024 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      this.AreaDeTexto1.append("El archivo con errores ha sido creado con formato(.HE2)\n");
                     
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 1024 BIT: \nDebe seleccionar un archivo con formato tipo (.HA2) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                     
                   break;
                   
                   case "2048 bit":
                     if(m3.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,"2","3"};
                     
                      this.AreaDeTexto1.append("Introduciendo errores en archivo: tipo de bloque 2048 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      this.AreaDeTexto1.append("El archivo con errores ha sido creado con formato(.HE3)\n");
                     
                       
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 2048 BIT: \nDebe seleccionar un archivo con formato tipo (.HA3) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                     
                   break;
                   
                   case "4096 bit":
                      if(m4.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,"2","4"};
                     
                      this.AreaDeTexto1.append("Introduciendo errores en archivo: tipo de bloque 4096 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      this.AreaDeTexto1.append("El archivo con errores ha sido creado con formato(.HE4)\n");
                      
                      
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 4096 BIT: \nDebe seleccionar un archivo con formato tipo (.HA4) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                     
                   break;
                   
               }
               this.informationFile="";
               this.checkNOT1.setVisible(true);
               this.checkOK1.setVisible(false);
          
          
          }else{
              JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un archivo para poder introducir errores (.HAX)");
              this.informationFile="";
              this.checkNOT1.setVisible(true);
              this.checkOK1.setVisible(false);
          }
    }
    
    private void desproteger() throws IOException{
             
               String tipoDeBloque="";
               String tipoDeDesproteger="";
               String formato256=".+\\.(HA1)|(HE1)";
               String formato1024=".+\\.(HA2)|(HE2)";
               String formato2048=".+\\.(HA3)|(HE3)";
               String formato4096=".+\\.(HA4)|(HE4)";
               
               String dir= System.getProperty("user.dir");
               
               Pattern p1= Pattern.compile(formato256);
               Pattern p2= Pattern.compile(formato1024);
               Pattern p3= Pattern.compile(formato2048);
               Pattern p4= Pattern.compile(formato4096);
              
               Matcher m1= p1.matcher(this.informationFile);
               Matcher m2= p2.matcher(this.informationFile);
               Matcher m3= p3.matcher(this.informationFile);
               Matcher m4= p4.matcher(this.informationFile);
               
               ProcessBuilder pb;
               
               tipoDeBloque=  (String) this.jComboBoxTipoBloque.getSelectedItem();
        
        
             
               if(!this.informationFile.equals("")){
               
                if(this.jCheckBoxCorreccion.isSelected()){
                  tipoDeDesproteger="3"; // el checkbox esta seleccionado entonces es sin correcion
                
                }else{
                  tipoDeDesproteger="4";
                }
                
                
                switch(tipoDeBloque){
                   case "256 bit":
                    if(m1.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,tipoDeDesproteger,"1"};
                     
                      this.AreaDeTexto1.append("Desprotegiendo archivo: tipo de bloque 256 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                     
                      if(tipoDeDesproteger.equals("3")){
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DE1)\n");
                      }else{
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DH1)\n");
                      }
                      
                    }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 256 BIT: \nDebe seleccionar un archivo con formato tipo (.HA1,HE1) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                    }
                   break;
                   
                   case "1024 bit":
                     if(m2.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,tipoDeDesproteger,"2"};
                     
                      this.AreaDeTexto1.append("Desprotegiendo archivo: tipo de bloque 1024 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      
                      if(tipoDeDesproteger.equals("3")){
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DE2)\n");
                      }else{
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DH2)\n");
                      }
                     
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 1024 BIT: \nDebe seleccionar un archivo con formato tipo (.HA2,HE2) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                     
                   break;
                   
                   case "2048 bit":
                    if(m3.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,tipoDeDesproteger,"3"};
                     
                      this.AreaDeTexto1.append("Desprotegiendo archivo: tipo de bloque 2048 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      
                      if(tipoDeDesproteger.equals("3")){
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DE3)\n");
                      }else{
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DH3)\n");
                      }
                     
                       
                    }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 2048 BIT: \nDebe seleccionar un archivo con formato tipo (.HA3,HE3) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                    }
                     
                   break;
                   
                   case "4096 bit":
                    if(m4.find()){

                      String command1[]= {dir+"/./hamming2punto0",this.informationFile ,tipoDeDesproteger,"4"};
                     
                      this.AreaDeTexto1.append("Desprotegiendo archivo: tipo de bloque 4096 bit\n");
                      pb = new ProcessBuilder(command1);
                      pb.start();
                      
                      if(tipoDeDesproteger.equals("3")){
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DE4)\n");
                      }else{
                        this.AreaDeTexto1.append("El archivo ha sido desprotegido con formato(.DH4)\n");
                      }
                      
                      
                     }else{
                       JOptionPane.showMessageDialog(rootPane,"BLOQUE 4096 BIT: \nDebe seleccionar un archivo con formato tipo (.HA4,HE4) !!");
                       this.informationFile="";
                       this.checkNOT1.setVisible(true);
                       this.checkOK1.setVisible(false);
                     }
                     
                   break;
                   
               }
               this.informationFile="";
               this.checkNOT1.setVisible(true);
               this.checkOK1.setVisible(false); 
                
                
                 
             
             }else{
              JOptionPane.showMessageDialog(rootPane,"Debe seleccionar un archivo para poder desproteger (.HAX,HEX)");
              this.informationFile="";
              this.checkNOT1.setVisible(true);
              this.checkOK1.setVisible(false);
             }
        
    }
    
    // FUNCIONES DE INTERFAZ  
    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        this.Borrar();
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonBusquedaInfoFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaInfoFile1ActionPerformed
        this.buscarArchivo(1,0);     
    }//GEN-LAST:event_BotonBusquedaInfoFile1ActionPerformed

    private void BotonDescompactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDescompactarActionPerformed
             try {
                 Descompactar();
             } catch (IOException ex) {
                 System.out.print(ex);
             }
    }//GEN-LAST:event_BotonDescompactarActionPerformed

    private void BotonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadisticasActionPerformed
             try {
                 this.VerEstadisticas();
             } catch (IOException ex) {
                 System.out.print(ex);
             }
    }//GEN-LAST:event_BotonEstadisticasActionPerformed

    private void BotonVerArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerArchivosActionPerformed
             try {
                 this.VerArchivos();
             } catch (IOException ex) {
                 System.out.print(ex);
             }
    }//GEN-LAST:event_BotonVerArchivosActionPerformed

    private void huffmanToogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huffmanToogleActionPerformed
         if(this.huffmanToogle.isSelected()){
           this.PanelBotonesHuffman.setVisible(true);
         }else{
           this.PanelBotonesHuffman.setVisible(false);
         
         }
    }//GEN-LAST:event_huffmanToogleActionPerformed

    private void hammingToogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hammingToogleActionPerformed
              if(this.hammingToogle.isSelected()){
               this.PanelBotonesHamming.setVisible(true);
              }else{
               this.PanelBotonesHamming.setVisible(false);
              }
    }//GEN-LAST:event_hammingToogleActionPerformed

    private void checkOK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOK1MouseClicked
     this.informationFile="";
     this.checkNOT1.setVisible(true);
     this.checkOK1.setVisible(false);
    }//GEN-LAST:event_checkOK1MouseClicked

    private void checkOK1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOK1MouseEntered
    if(!this.informationFile.equals("")) checkOK1.setToolTipText(this.informationFile);
    }//GEN-LAST:event_checkOK1MouseEntered

    private void BotonProtegerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProtegerActionPerformed
             try {
                 this.proteger();
             } catch (IOException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_BotonProtegerActionPerformed

    private void BotonIntrucirErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIntrucirErroresActionPerformed
             try {
                 this.desproteger();
             } catch (IOException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_BotonIntrucirErroresActionPerformed

    private void desprotegerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desprotegerActionPerformed
             try {
                 this.introducirErrores();
             } catch (IOException ex) {
                 Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             }
    }//GEN-LAST:event_desprotegerActionPerformed

    private void jCheckBoxCorreccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCorreccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxCorreccionActionPerformed

    private void jMenuItemAbriArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbriArchivoActionPerformed
      this.buscarArchivo(1,0);    
    }//GEN-LAST:event_jMenuItemAbriArchivoActionPerformed

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
         
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDeTexto1;
    private javax.swing.JTextArea AreaDeTexto2;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBusquedaInfoFile1;
    private javax.swing.JButton BotonCompactar;
    private javax.swing.JButton BotonDescompactar;
    private javax.swing.JButton BotonEstadisticas;
    private javax.swing.JButton BotonIntrucirErrores;
    private javax.swing.JButton BotonProteger;
    private javax.swing.JButton BotonVerArchivos;
    private javax.swing.JLabel Desproteger;
    private javax.swing.JLabel HAMMING;
    private javax.swing.JLabel HUFFMAN;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem MenuItemAcerca;
    private javax.swing.JPanel PanelBotonesHamming;
    private javax.swing.JPanel PanelBotonesHuffman;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Proteger;
    private javax.swing.JLabel archivocompactadoLabel;
    private javax.swing.JLabel borrartextolabel;
    private javax.swing.JLabel checkNOT1;
    private javax.swing.JLabel checkOK1;
    private javax.swing.JLabel compactar;
    private javax.swing.JLabel descompactar;
    private javax.swing.JButton desproteger;
    private javax.swing.JLabel estadisticas;
    private javax.swing.JLabel fondo;
    private javax.swing.JToggleButton hammingToogle;
    private javax.swing.JToggleButton huffmanToogle;
    private javax.swing.JLabel introducirErrores;
    private javax.swing.JCheckBox jCheckBoxCorreccion;
    private javax.swing.JComboBox<String> jComboBoxTipoBloque;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbriArchivo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel tamanioDeBLoque;
    private javax.swing.JLabel verArchivos;
    // End of variables declaration//GEN-END:variables
}
