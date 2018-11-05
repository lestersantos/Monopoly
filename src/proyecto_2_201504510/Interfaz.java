/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Alejandro
 */
public  class Interfaz extends JFrame implements ActionListener {
    Banco banco;
    JScrollPane ventana;
    JToolBar toolBar;
    Container contentPane;
    Image imagen;
    Jugador[] jugadores;
    JSpinner spinner;
    JMenuItem menuPrincipal, itemjugadores2, itemjugadores3, itemjugadores4,itemjugadores5,itemjugadores6,itemjugadores7,
            salir, tirardado, moverprueba, reporte1, reporte2, reporte3,manualUsuario,reportespdf1,
            activarCupones,activarCaja,mostrarterrenos,reportepdf1,reportepdf2,reportepdf3;
    /////---------------
    JLabel titulo1, dinerolb, dinero, nombrelb, nombre, dadolb, jugadorlb,cuponlb;
    JPanel jugadorpanel, paneldado, panelcartas, panelcasilla,internalPane,panelTerrenos,panelServicio,panelTransporte;
    JButton dadobt, venderbt, hipotecarbt, avanzarbt, retrocederbt,terminarturnobt,boton,siguientecupon,anteriorcupon,siguientecaja,anteriorcaja;
    JTextArea txtarea;
    //-----------------------------------------
    Panel ficha1, ficha2, ficha3, ficha4,panelprueba;
    JDesktopPane dp;
    JInternalFrame internalFrame;
    public Interfaz() {
        super("Virtual Monopoly");
        jugadores = new Jugador[4];
        contentPane = this.getContentPane();
        contentPane.setLayout(null);
      
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(this.menuBar());
        this.paneles();
        
        this.setVisible(true);
        //this.toolBar();
         
         //this.panel(ventana);
        
    }
    
    public void toolBar(){
        /*toolBar = new JToolBar(JToolBar.VERTICAL);
        JButton openButton = new JButton("Open");
        openButton.setToolTipText("Open a policy");
        toolBar.add(openButton);
        this.add(toolBar);*/
        //add(toolBar, BorderLayout.PAGE_START);
        toolBar = new JToolBar("TOOLBAR");
        JButton openButton = new JButton("Open");
        openButton.setToolTipText("Open a policy");
        toolBar.add(openButton);
        
        JButton button = new JButton("Close");
        openButton.setToolTipText("Open a policy");
        toolBar.add(button);
       //this.addButtons(toolBar);
         toolBar.addSeparator();
         toolBar.setBackground(Color.darkGray);
       this.add(toolBar);
    }
    
    public void paneles(){
        
        //TAMAÑO DE LA VENTANA 1370
        //---------------------PANEL DEL JUGADOR---------------------
        jugadorpanel = new JPanel();
        jugadorpanel.setLayout(null);
        jugadorpanel.setBounds(679, 0,691, 500);
        jugadorpanel.setBackground(new Color(70,130,180));
        //-------------INICIO PANEL DEL JUGADOR--------------------
        titulo1 = new JLabel();
        titulo1.setFont(new Font("Serif", Font.BOLD, 16));
        titulo1.setText("TURNO DEL JUGADOR");
        titulo1.setBounds(330,10,300,15);
        jugadorpanel.add(titulo1);
        //-----------LABEL PARA LA IMAGEN DEL JUGADOR---------------------------------------
        //aquí solo debería ir interfaz, no agregar nada que tenga que ver con los jugadores ya creados.
        jugadorlb = new JLabel();
//        Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
//        Image img1aux = imglb.getScaledInstance(200,-1, java.awt.Image.SCALE_DEFAULT);
//        ImageIcon iconolb = new ImageIcon(img1aux);
        //jugadorlb.setIcon(iconolb);
        //---------------------LABEL DONDE APARECE LA FICHA DEL JUGADOR-------------------
        jugadorlb.setBackground(Color.BLACK);
        jugadorlb.setBounds(15,100,200,200);
        jugadorlb.setOpaque(true);
        jugadorpanel.add(jugadorlb);
        
        //-----------------PANEL PARA LAS CARTAS--------------------------------
        panelcartas = new JPanel();
        panelcartas.setBounds(300, 30,380,460);
        panelcartas.setBackground(new Color(135,206,250));
        panelcartas.setLayout(null);
        jugadorpanel.add(panelcartas);
        //-----------------PANELES PARA LAS CARTAS, TERRENOS, SERVICIOS, TRANSPORTES---------------
        panelTerrenos = new JPanel();
        panelTerrenos.setBounds(5,5,370,300);
        panelTerrenos.setBackground(new Color(178,34,34));
        
        panelcartas.add(panelTerrenos);
        
        //panelcartas.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill =GridBagConstraints.BOTH;
        gbc.insets = new Insets(2,5,2,5) ;
        Image casilla2 = new ImageIcon(getClass().getResource("/images/casilla2.png")).getImage();
        Image img1aux = casilla2.getScaledInstance(50,-1, java.awt.Image.SCALE_DEFAULT);
        ImageIcon iconolb = new ImageIcon(img1aux);
        //fila
        for(int y = 0; y <4 ; y++) {
            //columna
            for(int x=0; x<6;x++){
             //girdx,gridy manejan la posición en la que se muestra el componente.
            gbc.gridx=y;
            gbc.gridy=x;
            String text = "Carta ("+x+","+y+")";
            JLabel j1 = new JLabel();
            j1.setIcon(iconolb);
            j1.setBorder(BorderFactory.createLineBorder(Color.yellow));
            j1.setBackground(Color.CYAN);
            //j1.setOpaque(true);
            //panelTerrenos.add(j1,gbc);
            }
        }
        //---------------------PANEL DE SERVICIO, VERDE, A LA DERECHA-----------------------------------------
        panelServicio = new JPanel();
        panelServicio.setBounds(255,310,120,145);
        panelServicio.setBackground(new Color(154,205,50));
        panelcartas.add(panelServicio);
       
        //-----------------------PANEL DE TRANSPORTE, AMARILLO, A LA IZQUIERDA-------------------------------
        panelTransporte = new JPanel();
        panelTransporte.setBounds( 5,310,245,145);
        panelTransporte.setBackground(new Color(255,215,0));
        panelcartas.add(panelTransporte);
        //------------------LABEL PARA EL NOMBRE DEL JUGADOR--------------------------------
        nombre = new JLabel();
        nombre.setBackground(Color.WHITE);
        nombre.setBounds(65,30,200,20);
        nombre.setOpaque(true);
        jugadorpanel.add(nombre);
        //------------------LABEL QUE DICE NOMBRE--------------------------------------------------
        nombrelb = new JLabel();
        nombrelb.setText("Nombre:");
        nombrelb.setBackground(Color.red);
        nombrelb.setBounds(15,30,150,20);
        nombrelb.setOpaque(true);
        nombrelb.setLabelFor(nombre);
        jugadorpanel.add(nombrelb);
        //---------------LABEL PARA EL DINERO DEL JUGADOR----------------------------
        dinero = new JLabel();
        dinero.setBackground(Color.WHITE);
        dinero.setBounds(65,70,200,20);
        dinero.setOpaque(true);
        jugadorpanel.add(dinero);
        //-----------------------BOTONO, VENDER, HIPOTECAR-------------------------
        venderbt = new JButton("vender");
        venderbt.setBounds(15,350,110,25);
        jugadorpanel.add(venderbt);
        
        hipotecarbt = new JButton("hipotecar");
        hipotecarbt.setBounds(140,350,110,25);
        jugadorpanel.add(hipotecarbt);
        
        //-----------------------LABEL DINERO---------------------------------------
        dinerolb = new JLabel();
        dinerolb.setText(" Dinero:");
        dinerolb.setBackground(Color.red);
        dinerolb.setBounds(15,70,50,20);
        dinerolb.setOpaque(true);
        dinerolb.setLabelFor(dinero);
        jugadorpanel.add(dinerolb);
        //--------------------PANEL DADO-----------------------------
        paneldado = new JPanel();
        paneldado.setLayout(null);
        paneldado.setBounds(679,500,300,179);
        paneldado.setBackground(new Color(0,139,139));
        //-------------------------TEXT AREA RESULTADO DADOS------------------------
        txtarea = new JTextArea();
        txtarea.setBackground(Color.WHITE);
        txtarea.setBounds(8,30,150,110);
        txtarea.setOpaque(true);
        txtarea.setEditable(false);
        txtarea.setFont(new Font("Serif", Font.BOLD, 16));
        paneldado.add(txtarea);
        //-----------------AVANZAR Y REGRESAR BOTONES--------------------------------
        avanzarbt = new JButton("avanzar");
        avanzarbt.setBounds(160,65,110,25);
//        avanzarbt.addActionListener((ActionEvent e) -> {
//           this.moverPrueba();
//        });
        paneldado.add(avanzarbt);
        
        retrocederbt = new JButton("retroceder");
        retrocederbt.setBounds(160,95,110,25);
        paneldado.add(retrocederbt);
        //----------------------BOTON LANZAR---------------------------
        dadobt = new JButton("Lanzar Dado");
        dadobt.setBounds(15,150,110,20);
        dadobt.addActionListener(this);
        paneldado.add(dadobt);
        //-----------BOTON PARA TERMINAR TURNO----------------------------7
        terminarturnobt = new JButton("Terminar Turno");
        terminarturnobt.setBounds(160,130,110,20);
        
        paneldado.add(terminarturnobt);
        
        //-----------------LABEL SPINNER-----------------------------------
        JLabel spinnerlb = new JLabel();
        spinnerlb.setText("Paso*n");
        spinnerlb.setBackground(new Color(245,245,245));
        spinnerlb.setFont(new Font("Comic Sans MS",Font.BOLD,12));
        spinnerlb.setOpaque(true);
        spinnerlb.setBounds(215,30,45,20);
        paneldado.add(spinnerlb);
        //-----------------------SPINNER----------------------------------
           int minValue = 1;
           int maxValue = 3;
           int currentValue = 1;
           int steps = 1;
           SpinnerNumberModel model = new SpinnerNumberModel(currentValue,minValue,maxValue,steps);
            spinner = new JSpinner(model);
            spinner.setBounds(160,30,50,20);
            paneldado.add(spinner);
        //----------------------PANEL PARA CARTAS CUPON Y BOLSA---------------------------
        //tablero->679+ panel jugador-> 691
        panelcasilla = new JPanel();
        panelcasilla.setLayout(null);
        panelcasilla.setBounds(979,500,391,179);
        panelcasilla.setBackground(new Color(95,158,160));
        //-------------------------LABEL PARA CUPONES-------------------
        cuponlb = new  JLabel();
        cuponlb.setBounds(2,2,230,133);
        cuponlb.setVisible(true);
        cuponlb.setOpaque(true);
        //ImageIcon ib = new ImageIcon(getClass().getResource("/images/ch13.png"));
        //cuponlb.setIcon(ib);
        panelcasilla.add(cuponlb);
        //-------------------------BOTÓN PARA CAMBIAR DE CUPON O CAJA----------------
        siguientecupon = new JButton("next chance");
        siguientecupon.setBounds(250,10,90,20);
        siguientecupon.setEnabled(false);
        panelcasilla.add(siguientecupon);
        
        siguientecaja = new JButton("next Comunity.C");
        siguientecaja.setBounds(250,40,90,20);
        siguientecaja.setEnabled(false);
        panelcasilla.add(siguientecaja);
        //------------------------------PANEL DEL TABLERO------------------------------------------------------
        //-----------------------imagen titulo ventana----------------------------------------
        Image icono = new ImageIcon(getClass().getResource("/images/monopoly1.jpg")).getImage();
        this.setIconImage(icono);
        this.setTitle("Monopoly");
        
        //-------------------------imagen para el tablero----------------------------
        ImageIcon imagepanel = new ImageIcon(getClass().getResource("/images/monopoly1.jpg"));
        imagen = imagepanel.getImage();
        //imagen = img.getScaledInstance(2500, -1, java.awt.Image.SCALE_DEFAULT);
        Panel panelconfondo = new Panel(imagen);
        panelconfondo.setBounds(0, 0, 679, 679);
        System.out.println("Bounds of panel-->" + panelconfondo.getBounds() + "\n" + panelconfondo.getSize());
        System.out.println("Posición final" + panelconfondo.getInsets());
        //--------------------------------------------------------------------
        boton = new JButton();
        boton = new JButton("Lanzar Dado");
        boton.setBounds(15,150,110,20);
        boton.addActionListener(this);
       // panelconfondo.add(boton);
        //--------------------------------------------------------------------

        this.add(panelconfondo, 0, 0);
        this.add(jugadorpanel, 1, 0);
        this.add(paneldado, 1, 0);
        this.add(panelcasilla,1,0);
    }
    
    
    public JMenuBar menuBar(){
        JMenuBar menuBar;
        JMenu menu, submenu;

        
        menuBar = new JMenuBar();
        
        menu = new JMenu("Abrir");
        menuBar.add(menu);
        //-------------ITEM MENU PRINCIPAL-----------
        menuPrincipal = new JMenuItem("Menú Principal");
        menuPrincipal.addActionListener(this);
        menu.add(menuPrincipal);
         menu.addSeparator();
        //--------------SUBMENU------------------
        submenu = new JMenu("Nuevo Juego");
        menu.add(submenu);
        menu.addSeparator();

        itemjugadores2 = new JMenuItem("2 jugadores");
        submenu.add(itemjugadores2);
        //itemjugadores2.addActionListener(this);
        submenu.addSeparator();
        
        itemjugadores3 = new JMenuItem("3 jugadores");
        submenu.add(itemjugadores3);
        //itemjugadores3.addActionListener(this);
        submenu.addSeparator();
        
        itemjugadores4 = new JMenuItem("4 jugadores");
        submenu.add(itemjugadores4);
        submenu.addSeparator();
        
        itemjugadores5 = new JMenuItem("5 jugadores");
        submenu.add(itemjugadores5);
        //itemjugadores4.addActionListener(this);
        //---------------------FINAL DEL SUBMENU JUGADORES ------------------------
                
        salir = new JMenuItem("Salir");
        menu.add(salir);
        salir.addActionListener(this);
        //-----------------------SUBMENU JUGAR----------------
        menu = new JMenu("Jugar");
        menuBar.add(menu);
        
        tirardado = new JMenuItem("Tirar dado");
        menu.add(tirardado);
        tirardado.addActionListener(this);
        
        moverprueba = new JMenuItem("MoverPrueba");
        menu.add(moverprueba);
        moverprueba.addActionListener(this);
        
        activarCupones = new JMenuItem("Activar Cupones");
        menu.add(activarCupones);
        
        activarCaja = new JMenuItem("Activar Caja");
        menu.add(activarCaja);
        
        mostrarterrenos = new JMenuItem("Mostrar Terrenos");
        menu.add(mostrarterrenos);
        //----------------REPORTES-------------------
        menu = new JMenu("Reportes");
        menuBar.add(menu);
      
        reporte1 =  new JMenuItem("Reporte propiedades");
        menu.add(reporte1);
        menu.addSeparator();
        
        reporte2 =  new JMenuItem("Efectivo de cada jugador");
        menu.add(reporte2);
        menu.addSeparator();
                 
        reporte3 =  new JMenuItem("Propiedades en venta");
        menu.add(reporte3);
        menu.addSeparator();
        
        manualUsuario = new JMenuItem("Manual del Usuario");
        menu.add(manualUsuario);
        //--------------------------------------------
        //----------------REPORTES PDF-------------------
        menu = new JMenu("Reportes PDF");
        menuBar.add(menu);
      
        reportespdf1 =  new JMenuItem("Reporte PDF 1");
        menu.add(reportespdf1);
        menu.addSeparator();
        
        reportepdf1 =  new JMenuItem("Reporte propiedades");
        menu.add(reportepdf1);
        menu.addSeparator();
        
        reportepdf2 =  new JMenuItem("Efectivo de cada jugador");
        menu.add(reportepdf2);
        menu.addSeparator();
                 
        reportepdf3 =  new JMenuItem("Propiedades en venta");
        menu.add(reportepdf3);
         
         
        
        return menuBar;
    
    }
    
    public void internalFrame(Image img){
        //JPanel deskPanel = new JPanel();
        //deskPanel.setBounds(500,200,300,300);
        dp = new JDesktopPane();
        
        dp.setBackground(Color.red);
        //dp.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
        //dp.setBounds(500,200,200,200);
        dp.setSize(500,500);
        
        dp.setDragMode(JDesktopPane.LIVE_DRAG_MODE);
        internalFrame = new JInternalFrame();
        internalFrame.pack();
        //internal.setLayout(null);
        internalFrame.setResizable(true);
        internalFrame.setMaximizable(true);
        internalFrame.setClosable(true);
        //internalFrame.setBounds(100,100,600,400);
        //------------panel del internalFrame----------
        //panelprueba = new Panel("/images/c1.jpg");
        panelprueba = new Panel(img);
        panelprueba.setBackground(Color.red);
        internalFrame.add(panelprueba);
        dp.add(internalFrame);
        //internalFrame.setSize(300,300);
        internalFrame.setBounds(200,150,360,360);
        //deskPanel.add(dp);
        contentPane.add(internalFrame,1,0);
        internalFrame.setVisible(true);
//contentPane.add(dp);
        //this.setContentPane(dp);
        //this.add(dp,1,0);
    }
    public int[] tirarDado(){
        int valores[];
        valores = new int[3];
        Dado dado = new Dado();
        valores[0] = dado.getValordado();
        Dado dado2 = new Dado();
        valores[1] = dado2.getValordado();
        System.out.println("DADO1-->"+dado.getValordado()+" "+"DADO2-->"+dado2.getValordado());
        valores[2]=valores[0]+valores[1];
        return valores;
    }
    public void moverPrueba(){
       int mover=1;
       Panel f1= jugadores[0].getFicha().getFichaPanel();
       Panel f2= jugadores[1].getFicha().getFichaPanel();
       int x = f1.getX();
       int y = f1.getY();
       int x2 = f2.getX();
       int y2 = f2.getY();
         f1.setLocation(x-(mover*10), y);
         //f2.setLocation(x2-(mover*62), y2);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == salir) {
            System.exit(0);
        }
        if (e.getSource() == tirardado) {
          System.out.println("--->"+Arrays.toString(tirarDado()));
        }
        if (e.getSource() == moverprueba) {
          System.out.println("--->"+Arrays.toString(tirarDado()));
        this.moverPrueba();
        }
         if (e.getSource() == boton) {
         //this.internalFrame();
        }
//         if (e.getSource() == dadobt) {
//          int valores[] = tirarDado();
//                String val1 = Integer.toString(valores[0]);
//                String val2 = Integer.toString(valores[1]);
//                String total = Integer.toString(valores[2]);
//                txtarea.setText(" "+"Dado 1:"+" "+val1+"\n"+" "+"Dado 2:"+" "+val2 +"\n"+" "+"Avance:"+" "+total+" "+"casilla(s)");
//                //dadobt.setEnabled(false);
//        }
        
    }
    
    
}
