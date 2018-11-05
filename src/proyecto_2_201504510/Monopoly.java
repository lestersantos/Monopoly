/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Alejandro
 */
public class Monopoly implements ActionListener{
    //para agregar un panel a la interfaz, funciona agregandolo a la interfaz: interfaz.add(componente);
    //o se puede agregar al contentpane:  interfaz.contentpane.add(componente);
    Interfaz interfaz;
    Reportes reporte;
    Banco banco;
    Banco2 banco2;
    Jugador[] jugadores;
    Propiedades[] terrenos,transporte,servicio,especial;
    Cartas cuponActual;
    Cartas cajaActual;
    Cartas[] cartas;
    Cartas casilla1,casilla2,casilla3,casilla4,casilla5,casilla6,casilla7,casilla8,casilla9,casilla10,
            casilla11,casilla12,casilla13,casilla14,casilla15,casilla16,casilla17,casilla18,casilla19,casilla20
            ,casilla21,casilla22,casilla23,casilla24,casilla25,casilla26,casilla27,casilla28,casilla29,casilla30
            ,casilla31,casilla32,casilla33,casilla34,casilla35,casilla36,casilla37,casilla38,casilla39,casilla40; 
    Panel ficha1,ficha2,ficha3,ficha4;
    Fichas f1,f2,f3,f4;
    Jugador p1,p2,p3,p4;
    int dadoResul[];
    
    int numeroJugadores;
//    Iconos c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,
//            c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40;
    Iconos[] imagenescartas;
    Iconos[] imagenesCupones;
    Iconos[] imagenesCaja;
    ImagenesCartas imagen;
    ListaCupon listaCupon;
    ListaCaja listaCaja;
    ListaPropiedades listaterrenos;
    ListaPropiedades listatransportes;
    ListaPropiedades listaservicios;
    ListaJugadores listajugadores;
    private int[] contadorpropiedades;
    ReportePdf reportepdf;
    JSpinner spinner;
    int[] ofertas;
    public Monopoly() {
    interfaz = new Interfaz();
    
    reporte = new Reportes(this);
    reportepdf = new ReportePdf(this);
    contadorpropiedades = new int[4];
    
        
    imagen = new ImagenesCartas();
    imagenescartas = new Iconos[40];
    imagenescartas[0] = imagen.c1;
    imagenescartas[1] = imagen.c2;
    imagenescartas[2] = imagen.c3;
    imagenescartas[3] = imagen.c4;
    imagenescartas[4] = imagen.c5;
    imagenescartas[5] = imagen.c6;
    imagenescartas[6] = imagen.c7;
    imagenescartas[7] = imagen.c8;
    imagenescartas[8] = imagen.c9;
    imagenescartas[9] = imagen.c10;
    imagenescartas[10] = imagen.c11;
    imagenescartas[11] = imagen.c12;
    imagenescartas[12] = imagen.c13;
    imagenescartas[13] = imagen.c14;
    imagenescartas[14] = imagen.c15;
    imagenescartas[15] = imagen.c16;
    imagenescartas[16] = imagen.c17;
    imagenescartas[17] = imagen.c18;
    imagenescartas[18] = imagen.c19;
    imagenescartas[19] = imagen.c20;
    imagenescartas[20] = imagen.c21;
    imagenescartas[21] = imagen.c22;
    imagenescartas[22] = imagen.c23;
    imagenescartas[23] = imagen.c24;
    imagenescartas[24] = imagen.c25;
    imagenescartas[25] = imagen.c26;
    imagenescartas[26] = imagen.c27;
    imagenescartas[27] = imagen.c28;
    imagenescartas[28] = imagen.c29;
    imagenescartas[29] = imagen.c30;
    imagenescartas[30] = imagen.c31;
    imagenescartas[31] = imagen.c32;
    imagenescartas[32] = imagen.c33;
    imagenescartas[33] = imagen.c34;
    imagenescartas[34] = imagen.c35;
    imagenescartas[35] = imagen.c36;
    imagenescartas[36] = imagen.c37;
    imagenescartas[37] = imagen.c38;
    imagenescartas[38] = imagen.c39;
    imagenescartas[39] = imagen.c40;
    //-------------------IMAGENES DE LAS CARTAS CUPON-----------
    imagenesCupones = new Iconos[15];
    imagenesCupones[0] = imagen.ch1;
    imagenesCupones[1] = imagen.ch2;
    imagenesCupones[2] = imagen.ch3;
    imagenesCupones[3] = imagen.ch4;
    imagenesCupones[4] = imagen.ch5;
    imagenesCupones[5] = imagen.ch6;
    imagenesCupones[6] = imagen.ch7;
    imagenesCupones[7] = imagen.ch8;
    imagenesCupones[8] = imagen.ch9;
    imagenesCupones[9] = imagen.ch10;
    imagenesCupones[10] = imagen.ch11;
    imagenesCupones[11] = imagen.ch12;
    imagenesCupones[12] = imagen.ch13;
    imagenesCupones[13] = imagen.ch14;
    imagenesCupones[14] = imagen.ch15;
    //---------------------------IMAGENES DE LAS CARTAS CAJA-----------
    imagenesCaja = new Iconos[15];
    imagenesCaja[0] = imagen.cj1;
    imagenesCaja[1] = imagen.cj2;
    imagenesCaja[2] = imagen.cj3;
    imagenesCaja[3] = imagen.cj4;
    imagenesCaja[4] = imagen.cj5;
    imagenesCaja[5] = imagen.cj6;
    imagenesCaja[6] = imagen.cj7;
    imagenesCaja[7] = imagen.cj8;
    imagenesCaja[8] = imagen.cj9;
    imagenesCaja[9] = imagen.cj10;
    imagenesCaja[10] = imagen.cj11;
    imagenesCaja[11] = imagen.cj12;
    imagenesCaja[12] = imagen.cj13;
    imagenesCaja[13] = imagen.cj14;
    imagenesCaja[14] = imagen.cj15;
    
    
    casilla1 = new Cartas(1,"especial","Entrada",imagenescartas[0],false);
    casilla2 = new Cartas(2,"terreno","Mediterranean avenue","cafe",6000,200,1000,3000,9000,16000,25000,3000,5000,5000,imagenescartas[1],false);
    casilla3 = new Cartas(3,"caja","Caja",imagenescartas[2],false);
    casilla4 = new Cartas(4,"terreno","Baltic avenue","cafe",6000,400,2000,6000,18000,32000,45000,3000,5000,5000,imagenescartas[3],false);
    casilla5 = new Cartas(5,"impuesto","Impuesto",imagenescartas[4],false);
    casilla6 = new Cartas(6,"transporte","Reading railroad",20000,2500,10000,imagenescartas[5],false);
    casilla7 = new Cartas(7,"terreno","Oriental avenue","cafe",10000,600,3000,9000,27000,40000,55000,5000,5000,5000,imagenescartas[6],false);
    casilla8 = new Cartas(8,"suerte","Suerte",imagenescartas[7],true);
    casilla9 = new Cartas(9,"terreno","Vermont avenue","cafe",10000,600,3000,9000,27000,40000,55000,5000,5000,5000,imagenescartas[8],false);
    casilla10 = new Cartas(10,"terreno","Connecticut avenue","cafe",12000,4000,1000,30000,45000,60000,250,30,50,50,imagenescartas[9],false);
    casilla11 = new Cartas(11,"especial","Cárcel",imagenescartas[10],false);
    casilla12 = new Cartas(12,"terreno","ST.Charles place","cafe",14000,2,10,30,90,160,250,30,50,50,imagenescartas[11],false);
    casilla13 = new Cartas(13,"servicio","Electric company",15000,75,imagenescartas[12],false);
    casilla14 = new Cartas(14,"terreno","States avenue","cafe",14000,2,10,30,90,160,250,30,50,50,imagenescartas[13],false);
    casilla15 = new Cartas(15,"terreno","Virginia avenue","cafe",16000,2,10,30,90,160,250,30,50,50,imagenescartas[14],false);
    casilla16 = new Cartas(16,"transporte","Pensylvania railroad",20000,25,100,imagenescartas[15],false);
    casilla17 = new Cartas(17,"terreno","ST. James place","cafe",18000,2,10,30,90,160,250,30,50,50,imagenescartas[16],false);
    casilla18 = new Cartas(18,"caja","Caja",imagenescartas[17],false);
    casilla19 = new Cartas(19,"terreno","Tennessee avenue","cafe",18000,2,10,30,90,160,250,30,50,50,imagenescartas[18],false);
    casilla20 = new Cartas(20,"terreno","New york avenue","cafe",20000,2,10,30,90,160,250,30,50,50,imagenescartas[19],false);
    casilla21 = new Cartas(21,"especial","Free parking",imagenescartas[20],false);
    casilla22 = new Cartas(22,"terreno","Kentucky avenue","cafe",22000,2,10,30,90,160,250,30,50,50,imagenescartas[21],false);
    casilla23 = new Cartas(23,"suerte","Suerte",imagenescartas[22],false);
    casilla24 = new Cartas(24,"terreno","Indiana avenue","cafe",22000,2,10,30,90,160,250,30,50,50,imagenescartas[23],false);
    casilla25 = new Cartas(25,"terreno","Illinois avenue","cafe",24000,2,10,30,90,160,250,30,50,50,imagenescartas[24],false);
    casilla26 = new Cartas(26,"transporte","B.&.O railroad",20000,25,100,imagenescartas[25],false);
    casilla27 = new Cartas(27,"terreno","Atlantic avenue","cafe",26000,2,10,30,90,160,250,30,50,50,imagenescartas[26],false);
    casilla28 = new Cartas(28,"terreno","Ventnor avenue","cafe",26000,2,10,30,90,160,250,30,50,50,imagenescartas[27],false);
    casilla29 = new Cartas(29,"servicio","Water works",15000,75,imagenescartas[28],false);
    casilla30 = new Cartas(30,"terreno","Marvin gardens","cafe",28000,2,10,30,90,160,250,30,50,50,imagenescartas[29],false);
    casilla31 = new Cartas(31,"especial","Go to jail",imagenescartas[30],false);
    casilla32 = new Cartas(32,"terreno","Pacific avenue","cafe",30000,2,10,30,90,160,250,30,50,50,imagenescartas[31],false);
    casilla33 = new Cartas(33,"terreno","North carolina avenue","cafe",30000,2,10,30,90,160,250,30,50,50,imagenescartas[32],false);
    casilla34 = new Cartas(34,"caja","Caja",imagenescartas[33],false);
    casilla35 = new Cartas(35,"terreno","Pennsylvania avenue","cafe",32000,2,10,30,90,160,250,30,50,50,imagenescartas[34],false);
    casilla36 = new Cartas(36,"transporte","Short line",20000,25,100,imagenescartas[35],false);
    casilla37 = new Cartas(37,"suerte","Suerte",imagenescartas[36],false);
    casilla38 = new Cartas(38,"terreno","Park place","cafe",35000,2,10,30,90,160,250,30,50,50,imagenescartas[37],false);
    casilla39 = new Cartas(39,"impuesto","Luxury tax",imagenescartas[38],false);
    casilla40 = new Cartas(40,"terreno","Boardwalk","cafe",40000,2,10,30,90,160,250,30,50,50,imagenescartas[39],false);
    
    cartas = new Cartas[40];
    cartas[0] = casilla1;
    cartas[1] = casilla2;
    cartas[2] = casilla3;
    cartas[3] = casilla4;
    cartas[4] = casilla5;
    cartas[5] = casilla6;
    cartas[6] = casilla7;
    cartas[7] = casilla8;
    cartas[8] = casilla9;
    cartas[9] = casilla10;
    cartas[10] = casilla11;
    cartas[11] = casilla12;
    cartas[12] = casilla13;
    cartas[13] = casilla14;
    cartas[14] = casilla15;
    cartas[15] = casilla16;
    cartas[16] = casilla17;
    cartas[17] = casilla18;
    cartas[18] = casilla19;
    cartas[19] = casilla20;
    cartas[20] = casilla21;
    cartas[21] = casilla22;
    cartas[22] = casilla23;
    cartas[23] = casilla24;
    cartas[24] = casilla25;
    cartas[25] = casilla26;
    cartas[26] = casilla27;
    cartas[27] = casilla28;
    cartas[28] = casilla29;
    cartas[29] = casilla30;
    cartas[30] = casilla31;
    cartas[31] = casilla32;
    cartas[32] = casilla33;
    cartas[33] = casilla34;
    cartas[34] = casilla35;
    cartas[35] = casilla36;
    cartas[36] = casilla37;
    cartas[37] = casilla38;
    cartas[38] = casilla39;
    cartas[39] = casilla40;
   
    
    /*caillas especiales no se venden:
    esquinas 1,11,21,31
    caja 3,18,34
    suerte 8,23,37
    impuesto 5,39 
    1,3,5,8,11,18,21,23,31,34,37,39
    */    
        //banco = new Banco("Banco",3330000);
        banco2 = new Banco2();
        jugadores = new Jugador[4];
//        jugadores[0] = interfaz.jugadores[0];
//        jugadores[1] = interfaz.jugadores[1];
//        jugadores[2] = interfaz.jugadores[2];
//        jugadores[3] = interfaz.jugadores[3];
        
        //1,3,5,8,11,18,21,23,31,34,37,39 casillas que no se venden
        terrenos = new Propiedades[22];
        terrenos[0] = new Propiedades(1,banco2.banco,casilla2,false);
        terrenos[1] = new Propiedades(2,banco2.banco,casilla4,false);
        terrenos[2] = new Propiedades(3,banco2.banco,casilla7,false);
        terrenos[3] = new Propiedades(4,banco2.banco,casilla9,false);
        terrenos[4] = new Propiedades(5,banco2.banco,casilla10,false);
        terrenos[5] = new Propiedades(6,banco2.banco,casilla12,false);
        terrenos[6] = new Propiedades(7,banco2.banco,casilla14,false);
        terrenos[7] = new Propiedades(8,banco2.banco,casilla15,false);
        terrenos[8] = new Propiedades(9,banco2.banco,casilla17,false);
        terrenos[9] = new Propiedades(10,banco2.banco,casilla19,false);
        terrenos[10] = new Propiedades(11,banco2.banco,casilla20,false);
        terrenos[11] = new Propiedades(12,banco2.banco,casilla22,false);
        terrenos[12] = new Propiedades(13,banco2.banco,casilla24,false);
        terrenos[13] = new Propiedades(14,banco2.banco,casilla25,false);
        terrenos[14] = new Propiedades(15,banco2.banco,casilla27,false);
        terrenos[15] = new Propiedades(16,banco2.banco,casilla28,false);
        terrenos[16] = new Propiedades(17,banco2.banco,casilla30,false);
        terrenos[17] = new Propiedades(18,banco2.banco,casilla32,false);
        terrenos[18] = new Propiedades(19,banco2.banco,casilla33,false);
        terrenos[19] = new Propiedades(20,banco2.banco,casilla35,false);
        terrenos[20] = new Propiedades(21,banco2.banco,casilla38,false);
        terrenos[21] = new Propiedades(22,banco2.banco,casilla40,false);
        
        listaterrenos = new ListaPropiedades();
        listaterrenos.addPropiedad(1,banco2.banco, casilla2,false);
        listaterrenos.addPropiedad(2,banco2.banco, casilla4,false);
        listaterrenos.addPropiedad(3,banco2.banco, casilla7,false);
        listaterrenos.addPropiedad(4,banco2.banco, casilla9,false);
        listaterrenos.addPropiedad(5,banco2.banco, casilla10,false);
        listaterrenos.addPropiedad(6,banco2.banco, casilla12,false);
        listaterrenos.addPropiedad(7,banco2.banco, casilla14,false);
        listaterrenos.addPropiedad(8,banco2.banco, casilla15,false);
        listaterrenos.addPropiedad(9,banco2.banco, casilla17,false);
        listaterrenos.addPropiedad(10,banco2.banco, casilla19,false);
        listaterrenos.addPropiedad(11,banco2.banco, casilla20,false);
        listaterrenos.addPropiedad(12,banco2.banco, casilla22,false);
        listaterrenos.addPropiedad(13,banco2.banco, casilla24,false);
        listaterrenos.addPropiedad(14,banco2.banco, casilla25,false);
        listaterrenos.addPropiedad(15,banco2.banco, casilla27,false);
        listaterrenos.addPropiedad(16,banco2.banco, casilla28,false);
        listaterrenos.addPropiedad(17,banco2.banco, casilla30,false);
        listaterrenos.addPropiedad(18,banco2.banco, casilla32,false);
        listaterrenos.addPropiedad(19,banco2.banco, casilla33,false);
        listaterrenos.addPropiedad(20,banco2.banco, casilla35,false);
        listaterrenos.addPropiedad(21,banco2.banco, casilla38,false);
        listaterrenos.addPropiedad(22,banco2.banco, casilla40,false);
        //----------------TRANSPORTES-----------------
        transporte = new Propiedades[4];
        transporte[0] = new Propiedades(1,banco2.banco,casilla6,false);
        transporte[1] = new Propiedades(2,banco2.banco,casilla16,false);
        transporte[2] = new Propiedades(3,banco2.banco,casilla26,false);
        transporte[3] = new Propiedades(4,banco2.banco,casilla36,false);
        
        listatransportes = new ListaPropiedades();
        listatransportes.addPropiedad(1,banco2.banco,casilla6,false);
        listatransportes.addPropiedad(2,banco2.banco,casilla16,false);
        listatransportes.addPropiedad(3,banco2.banco,casilla26,false);
        listatransportes.addPropiedad(4,banco2.banco,casilla36,false);
        //-------------------SERVICIO----------------------------------
        servicio = new Propiedades[2];
        servicio[0] = new Propiedades(1,banco2.banco,casilla13,false);
        servicio[1] = new Propiedades(2,banco2.banco,casilla29,false);
        
        listaservicios = new ListaPropiedades();
        listaservicios.addPropiedad(1,banco2.banco,casilla13,false);
        listaservicios.addPropiedad(2,banco2.banco,casilla29,false);
        //-------------------ESPECIAL-----------------------------------
        especial = new Propiedades[12];
        especial[0] = new Propiedades(banco2.banco,casilla1);
        especial[1] = new Propiedades(banco2.banco,casilla3);
        especial[2] = new Propiedades(banco2.banco,casilla5);
        especial[3] = new Propiedades(banco2.banco,casilla8);
        especial[4] = new Propiedades(banco2.banco,casilla11);
        especial[5] = new Propiedades(banco2.banco,casilla18);
        especial[6] = new Propiedades(banco2.banco,casilla21);
        especial[7] = new Propiedades(banco2.banco,casilla23);
        especial[8] = new Propiedades(banco2.banco,casilla31);
        especial[9] = new Propiedades(banco2.banco,casilla34);
        especial[10] = new Propiedades(banco2.banco,casilla37);
        especial[11] = new Propiedades(banco2.banco,casilla39);
        dadoResul = new int[3];
       
        ///lista de cupones
        listaCupon = new ListaCupon();
        for(int m =0; m<imagenesCupones.length;m++){
        listaCupon.agregarCupon(m+1,"cupon",imagenesCupones[m]);
        }
        listaCaja = new ListaCaja();
        for(int m =0; m<imagenesCaja.length;m++){
        listaCaja.agregarCaja(m+1,"caja",imagenesCaja[m]);
        }
        listajugadores = new ListaJugadores();
              
        this.botones();
    }
    public void crearJugadoresLista(int players) {

        switch (players) {
            case 2:
                if (listajugadores.buscarJugador(1) == null) {
                    //banco2 = new Banco2();
                    banco2.banco.setDinero(3330000);
                    f1 = new Fichas("/images/ficha1.png");
                    listajugadores.addJugador(1, "Jugador 1", f1, 0, "ACTIVO", false, 1);

                    f2 = new Fichas("/images/ficha2.png");
                    listajugadores.addJugador(2, "Jugador 2", f2, 0, "ACTIVO", false, 1);
                    System.out.println("Creo al jugador");
                    System.out.println(listajugadores.buscarJugador(1).getNombre());
                    ficha1 = listajugadores.buscarJugador(1).getFicha().getFichaPanel();
                    ficha1.setBounds(610, 610, 25, 25);
                    interfaz.add(ficha1, 1, 0);
                    //--------------------------------------
                    ficha2 = listajugadores.buscarJugador(2).getFicha().getFichaPanel();
                    ficha2.setBounds(640, 610, 25, 25);
                    interfaz.add(ficha2, 1, 0);
                    //---------------------------------------
                    banco2.cargarDinero(listajugadores.buscarJugador(1));
                    banco2.cargarDinero(listajugadores.buscarJugador(2));

                    listajugadores.buscarJugador(1).setTurno(true);
                    ofertas = new int[2];
                    interfaz.repaint();
                //listaCupon.mostrarCupones();
                    //empezarJuego(players);
                } else {
                    System.out.println("Hay una partida en ejecución");
                }
                break;
            case 3:
                if (listajugadores.buscarJugador(1) == null) {
                    //banco2 = new Banco2();
                    banco2.banco.setDinero(3330000);
                    f1 = new Fichas("/images/ficha1.png");
                    listajugadores.addJugador(1, "Jugador 1", f1, 0, "ACTIVO", false, 1);

                    //---------------------------------------
                    f2 = new Fichas("/images/ficha2.png");
                    listajugadores.addJugador(2, "Jugador 2", f2, 0, "ACTIVO", false, 1);

                    //-----------------------------------
                    f3 = new Fichas("/images/ficha3.png");
                    listajugadores.addJugador(3, "Jugador 3", f3, 0, "ACTIVO", false, 1);

                    ficha1 = listajugadores.buscarJugador(1).getFicha().getFichaPanel();
                    ficha1.setBounds(610, 610, 25, 25);
                    interfaz.add(ficha1, 1, 0);
                    //--------------------------------------
                    ficha2 = listajugadores.buscarJugador(2).getFicha().getFichaPanel();
                    ficha2.setBounds(640, 610, 25, 25);
                    interfaz.add(ficha2, 1, 0);
                    //----------------------------------------
                    ficha3 = listajugadores.buscarJugador(3).getFicha().getFichaPanel();
                    ficha3.setBounds(610, 640, 25, 25);
                    interfaz.add(ficha3, 1, 0);

                    banco2.cargarDinero(listajugadores.buscarJugador(1));
                    banco2.cargarDinero(listajugadores.buscarJugador(2));
                    banco2.cargarDinero(listajugadores.buscarJugador(3));
                    listajugadores.buscarJugador(1).setTurno(true);
                    ofertas = new int[3];
                    interfaz.repaint();
                    //empezarJuego(players);
                } else {
                    System.out.println("Hay una partida en ejecución");
                }

                break;
            case 4:

                if (listajugadores.buscarJugador(1) == null) {
                    //banco2 = new Banco2();
                    banco2.banco.setDinero(3330000);
                    f1 = new Fichas("/images/ficha1.png");
                    listajugadores.addJugador(1, "Jugador 1", f1, 1000, "ACTIVO", false, 1);

                    //---------------------------------------
                    f2 = new Fichas("/images/ficha2.png");
                    listajugadores.addJugador(2, "Jugador 2", f2, 1000, "ACTIVO", false, 1);

                    //-----------------------------------
                    f3 = new Fichas("/images/ficha3.png");
                    listajugadores.addJugador(3, "Jugador 3", f3, 1000, "ACTIVO", false, 1);
                    //--------------------------------------
                    f4 = new Fichas("/images/ficha4.png");
                    listajugadores.addJugador(4, "Jugador 4", f4, 1000, "ACTIVO", false, 1);

                    ficha1 = listajugadores.buscarJugador(1).getFicha().getFichaPanel();
                    ficha1.setBounds(610, 610, 25, 25);
                    interfaz.add(ficha1, 1, 0);
                    //--------------------------------------
                    ficha2 = listajugadores.buscarJugador(2).getFicha().getFichaPanel();
                    ficha2.setBounds(640, 610, 25, 25);
                    interfaz.add(ficha2, 1, 0);
                    //----------------------------------------
                    ficha3 = listajugadores.buscarJugador(3).getFicha().getFichaPanel();
                    ficha3.setBounds(610, 640, 25, 25);
                    interfaz.add(ficha3, 1, 0);
                    //-----------------------------------------------
                    ficha4 = listajugadores.buscarJugador(4).getFicha().getFichaPanel();
                    ficha4.setBounds(640, 640, 25, 25);
                    interfaz.add(ficha4, 1, 0);

                    banco2.cargarDinero(listajugadores.buscarJugador(1));
                    banco2.cargarDinero(listajugadores.buscarJugador(2));
                    banco2.cargarDinero(listajugadores.buscarJugador(3));
                    banco2.cargarDinero(listajugadores.buscarJugador(4));
                    listajugadores.buscarJugador(1).setTurno(true);
                    ofertas = new int[4];
                    interfaz.repaint();
                    //empezarJuego(players);
                } else {
                    System.out.println("Hay una partida en ejecución");
                }
                break;
        }
    }
    public void crearJugadores(int players){
        
        switch(players){
            case 2:
                if(jugadores[0]== null){
                //banco2 = new Banco2();
                banco2.banco.setDinero(3330000);
                f1 = new Fichas("/images/ficha1.png");
                p1 = new Jugador(1,"Jugador 1", f1,0, "ACTIVO",false,1);
                jugadores[0] = p1;
                
                f2 = new Fichas("/images/ficha2.png");
                p2 = new Jugador(2,"Jugador 2", f2,0, "ACTIVO",false,1);
                jugadores[1] = p2;

                ficha1 = jugadores[0].getFicha().getFichaPanel();
                ficha1.setBounds(610, 610, 25, 25);
                interfaz.add(ficha1, 1, 0);
                //--------------------------------------
                ficha2 = jugadores[1].getFicha().getFichaPanel();
                ficha2.setBounds(640, 610, 25, 25);
                interfaz.add(ficha2, 1, 0);
                //---------------------------------------
                banco2.cargarDinero(jugadores[0]);
                banco2.cargarDinero(jugadores[1]);
                
                jugadores[0].setTurno(true);
                interfaz.repaint();
                //listaCupon.mostrarCupones();
                 //empezarJuego(players);
                }
                else{
                    System.out.println("Hay una partida en ejecución");}
             break;
            case 3:
                if(jugadores[0]== null){
                //banco2 = new Banco2();
                banco2.banco.setDinero(3330000);
                f1 = new Fichas("/images/ficha1.png");
                p1 = new Jugador(1,"Jugador 1", f1,0, "ACTIVO",false,1);
                jugadores[0] = p1;
                //---------------------------------------
                f2 = new Fichas("/images/ficha2.png");
                p2 = new Jugador(2,"Jugador 2", f2,0, "ACTIVO",false,1);
                jugadores[1] = p2;
                //-----------------------------------
                f3 = new Fichas("/images/ficha3.png");
                p3 = new Jugador(3,"Jugador 3", f3,0, "ACTIVO",false,1);
                jugadores[2] = p3;
               
                ficha1 = jugadores[0].getFicha().getFichaPanel();
                ficha1.setBounds(610, 610, 25, 25);
                interfaz.add(ficha1, 1, 0);
                //--------------------------------------
                ficha2 = jugadores[1].getFicha().getFichaPanel();
                ficha2.setBounds(640, 610, 25, 25);
                interfaz.add(ficha2, 1, 0);
                //----------------------------------------
                ficha3 = jugadores[2].getFicha().getFichaPanel();
                ficha3.setBounds(610, 640, 25, 25);
                interfaz.add(ficha3, 1, 0);
               
                banco2.cargarDinero(jugadores[0]);
                banco2.cargarDinero(jugadores[1]);
                banco2.cargarDinero(jugadores[2]);
                jugadores[0].setTurno(true);
                interfaz.repaint();
                //empezarJuego(players);
                }
                else{
                    System.out.println("Hay una partida en ejecución");
                }
                
                break;
            case 4:
                
                if(jugadores[0]== null){
                //banco2 = new Banco2();
                banco2.banco.setDinero(3330000);
                f1 = new Fichas("/images/ficha1.png");
                p1 = new Jugador(1,"Jugador 1", f1, 1000, "ACTIVO",false,1);
                jugadores[0] = p1;
                //---------------------------------------
                f2 = new Fichas("/images/ficha2.png");
                p2 = new Jugador(2,"Jugador 2", f2, 1000, "ACTIVO",false,1);
                jugadores[1] = p2;

                //-----------------------------------
                f3 = new Fichas("/images/ficha3.png");
                p3 = new Jugador(3,"Jugador 3", f3, 1000, "ACTIVO",false,1);
                jugadores[2] = p3;
                //--------------------------------------
                f4 = new Fichas("/images/ficha4.png");
                p4 = new Jugador(4,"Jugador 4", f4, 1000, "ACTIVO",false,1);
                jugadores[3] = p4;
                ficha1 = jugadores[0].getFicha().getFichaPanel();
                ficha1.setBounds(610, 610, 25, 25);
                interfaz.add(ficha1, 1, 0);
                //--------------------------------------
                ficha2 = jugadores[1].getFicha().getFichaPanel();
                ficha2.setBounds(640, 610, 25, 25);
                interfaz.add(ficha2, 1, 0);
                //----------------------------------------
                ficha3 = jugadores[2].getFicha().getFichaPanel();
                ficha3.setBounds(610, 640, 25, 25);
                interfaz.add(ficha3, 1, 0);
                //-----------------------------------------------
                ficha4 = jugadores[3].getFicha().getFichaPanel();
                ficha4.setBounds(640, 640, 25, 25);
                interfaz.add(ficha4, 1, 0);
                
                banco2.cargarDinero(jugadores[0]);
                banco2.cargarDinero(jugadores[1]);
                banco2.cargarDinero(jugadores[2]);
                banco2.cargarDinero(jugadores[3]);
                jugadores[0].setTurno(true);
                interfaz.repaint();
                //empezarJuego(players);
                }
                else{
                    System.out.println("Hay una partida en ejecución");
                }
                break;
        
        }
    }
    public void empezarJuego(int players){
        try {
            
            crearJugadoresLista(numeroJugadores);
            JOptionPane.showMessageDialog(null,"GAME STARTED","MONOPOLY",JOptionPane.INFORMATION_MESSAGE);
            Thread.sleep(500);
            turnos();
            
    
        } catch (InterruptedException ex) {
            Logger.getLogger(Monopoly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void mostrarDatosyFicha(int jugador){
        interfaz.jugadorlb.setIcon(imagenTurno(jugador));
        interfaz.nombre.setText(listajugadores.buscarJugador(jugador).getNombre());
        interfaz.dinero.setText(Integer.toString(listajugadores.buscarJugador(jugador).getDinero()));
        //imagenTerrenosJugador(jugador);
        imagenTerrenosJugadorLista(jugador);
        //imagenTransporteJugador(jugador);
        imagenTransporteJugadorLista(jugador);
        //imagenServicioJugador(jugador);
        imagenServicioJugadorLista(jugador);
        interfaz.repaint();
    }
    public void turnos(){
           switch (numeroJugadores) {
            case 2:
                if (listajugadores.buscarJugador(1).isTurno() == true) {

                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(1);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(2);
                }
                break;
            case 3:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(1);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(2);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(3);
                }
                break;
            case 4:
                if (listajugadores.buscarJugador(1).isTurno() == true) {

                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(1);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(2);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(3);
                } else if (listajugadores.buscarJugador(4).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosyFicha(4);
                }
                break;
           }
            
    }
    public void terminarTurno(){
         switch (numeroJugadores) {
            case 2:
                if(listajugadores.buscarJugador(1).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(true);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.dadobt.setEnabled(true);
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.txtarea.setText("");
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                    
                }else if(listajugadores.buscarJugador(2).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(true);
                    listajugadores.buscarJugador(2).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.dadobt.setEnabled(true);
                    interfaz.avanzarbt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }
                
                break;

            case 3:
                if(listajugadores.buscarJugador(1).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(true);
                    listajugadores.buscarJugador(3).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.dadobt.setEnabled(true);
                    interfaz.avanzarbt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                    
                }else if(listajugadores.buscarJugador(2).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(false);
                    listajugadores.buscarJugador(3).setTurno(true);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }
                else if(listajugadores.buscarJugador(3).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(true);
                    listajugadores.buscarJugador(2).setTurno(false);
                    listajugadores.buscarJugador(3).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }
                break;
            case 4:
                if(listajugadores.buscarJugador(1).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(true);
                    listajugadores.buscarJugador(3).setTurno(false);
                    listajugadores.buscarJugador(4).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                    
                }else if(listajugadores.buscarJugador(2).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(false);
                    listajugadores.buscarJugador(3).setTurno(true);
                    listajugadores.buscarJugador(4).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }
                else if(listajugadores.buscarJugador(3).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(false);
                    listajugadores.buscarJugador(3).setTurno(false);
                    listajugadores.buscarJugador(4).setTurno(true);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }else if(listajugadores.buscarJugador(4).isTurno()==true){
                    listajugadores.buscarJugador(1).setTurno(true);
                    listajugadores.buscarJugador(2).setTurno(false);
                    listajugadores.buscarJugador(3).setTurno(false);
                    listajugadores.buscarJugador(4).setTurno(false);
                    interfaz.panelTerrenos.removeAll();
                    interfaz.panelTransporte.removeAll();
                    interfaz.panelServicio.removeAll();
                    interfaz.avanzarbt.setEnabled(true);
                    interfaz.dadobt.setEnabled(true);
                    for(int i = 0; i<cartas.length;i++){
                        cartas[i].setCasillaactiva(false);
                    }
                    turnos();
                }
                break;
        }   
    }
    private Icon redimensionarImagen(int tamaño,Image imagen){
        
        Image img1aux = imagen.getScaledInstance(tamaño,-1, java.awt.Image.SCALE_DEFAULT);
        ImageIcon iconolb = new ImageIcon(img1aux);
        return iconolb;
    }
    public ImageIcon imagenTurno(int player){
        //Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
        Image imglb = listajugadores.buscarJugador(player).getFicha().getImage();
        Image img1aux = imglb.getScaledInstance(200,-1, java.awt.Image.SCALE_DEFAULT);
        ImageIcon iconolb = new ImageIcon(img1aux);
        return iconolb;
    }
    public void imagenTerrenosJugadorLista(int player) {
        //Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
        int i;
        int count = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 5, 2, 5);

        Propiedades[] terrenosaux;
        for (i = 0; i < terrenos.length; i++) {
            if (listaterrenos.buscarPropiedad(i+1).getDueño().getNombre() == null ? listajugadores.buscarJugador(player).getNombre() == null : listaterrenos.buscarPropiedad(i+1).getDueño().getNombre().equals(listajugadores.buscarJugador(player).getNombre())) {
                count = count + 1;
            }
        }
        System.out.println("El tamaño del arreglo de terrenos es-->" + " " + count);
        if (count >= 1) { //if primario.
            terrenosaux = new Propiedades[count];
            int contador1 = 0;
            for (i = 0; i < terrenos.length; i++) {
                if (listaterrenos.buscarPropiedad(i+1).getDueño().getNombre() ==  listajugadores.buscarJugador(player).getNombre()) {
                    //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                    terrenosaux[contador1] = terrenos[i];
                    System.out.println("terrenos aux el dueño es:" + " " + terrenosaux[contador1].getDueño().getNombre() + " " + terrenosaux[contador1].getCarta().getTitulo());
                    contador1++;
                }
            }
            //hasta aquí va perfecto.
            System.out.println("Propiedad en el arreglo posición 0-->" + " " + terrenosaux[0].getCarta().getTitulo());
        //el tamaño del arreglo es 1, por lo que no se puede acceder a la posición 1.
            //System.out.println("Propiedad en el arreglo posición 1-->"+" "+terrenosaux[1].getCarta().getTitulo());
            //filas
            int imagencount = 0;
            for (int y = 0; y < 4; y++) {
                //columnas
                for (int x = 0; x < 6; x++) {
                    //girdx,gridy manejan la posición en la que se muestra el componente.
                    gbc.gridx = y;
                    gbc.gridy = x;
                    System.out.println("El contador de posición en el arreglo terrenosaux-->" + imagencount);
                    if (imagencount < terrenosaux.length) {
                        if (terrenosaux[imagencount] != null) { //<----da error en esta línea

                            Image imagelb = terrenosaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(55, -1, java.awt.Image.SCALE_DEFAULT);
                            ImageIcon iconoaux = new ImageIcon(imagelb);
                            JLabel labelaux = new JLabel();
                            labelaux.setIcon(iconoaux);
                            //terrenosaux[imagencount].getCarta().getIcono().getLabelcarta()
                            interfaz.panelTerrenos.add(labelaux, gbc);
                            interfaz.repaint();

                            imagencount++;

                        } else {
                            System.out.println("El jugador no ha comprado propiedades");
                            break;
                        }

                    } else {
                        System.out.println("Hasta aquí llegaron los terrenos del jugador");
                        break;
                    }

                }//---final del for interno
                //imagencount++;
            }
        } else {
            System.out.println("El jugador no ha comprado terrenos");
            //interfaz.panelTerrenos.removeAll();
        }
    }
    public void imagenTerrenosJugador(int player){
        //Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
        int i;
        int count = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 5, 2, 5);

        Propiedades[] terrenosaux;
        for (i = 0; i < terrenos.length; i++) {
            if (terrenos[i].getDueño().getNombre() == null ? jugadores[player].getNombre() == null : terrenos[i].getDueño().getNombre().equals(jugadores[player].getNombre())) {
                count = count + 1;
            }
        }
        System.out.println("El tamaño del arreglo de terrenos es-->"+" "+count);
        if(count >=1){
        terrenosaux = new Propiedades[count];
        int contador1 = 0;
        for (i = 0; i < terrenos.length; i++) {
            if (terrenos[i].getDueño().getNombre() == null ? jugadores[player].getNombre() == null : terrenos[i].getDueño().getNombre().equals(jugadores[player].getNombre())) {
                //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                terrenosaux[contador1] = terrenos[i];
                System.out.println("terrenos aux el dueño es:"+" "+terrenosaux[contador1].getDueño().getNombre()+" "+terrenosaux[contador1].getCarta().getTitulo());
                contador1++;
            }
        }
        //hasta aquí va perfecto.
        System.out.println("Propiedad en el arreglo posición 0-->"+" "+terrenosaux[0].getCarta().getTitulo());
        //el tamaño del arreglo es 1, por lo que no se puede acceder a la posición 1.
        //System.out.println("Propiedad en el arreglo posición 1-->"+" "+terrenosaux[1].getCarta().getTitulo());
        //filas
        int imagencount = 0;
        for (int y = 0; y < 4; y++) {
            //columnas
            for (int x = 0; x < 6; x++) {
                //girdx,gridy manejan la posición en la que se muestra el componente.
                gbc.gridx = y;
                gbc.gridy = x;
                System.out.println("El contador de posición en el arreglo terrenosaux-->"+imagencount);
                if (imagencount < terrenosaux.length) {
                    if (terrenosaux[imagencount] != null) { //<----da error en esta línea
//            j1.setIcon(iconolb);
//            j1.setBorder(BorderFactory.createLineBorder(Color.yellow));
//            j1.setBackground(Color.CYAN);
                        //j1.setOpaque(true);

                        Image imagelb = terrenosaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(55, -1, java.awt.Image.SCALE_DEFAULT);
                        ImageIcon iconoaux = new ImageIcon(imagelb);
                        JLabel labelaux = new JLabel();
                        labelaux.setIcon(iconoaux);
                        //terrenosaux[imagencount].getCarta().getIcono().getLabelcarta()
                        interfaz.panelTerrenos.add(labelaux, gbc);
                        interfaz.repaint();

                        imagencount++;
                        
                    } else {
                        System.out.println("El jugador no ha comprado propiedades");
                        break;
                    }

                } else {
                    System.out.println("Hasta aquí llegaron los terrenos del jugador");
                    break;
                }

            }//---final del for interno
            //imagencount++;
        }
    }else{
        System.out.println("El jugador no ha comprado terrenos");
        //interfaz.panelTerrenos.removeAll();
        } 
    }
    public void imagenTransporteJugadorLista(int player){
        //Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
        int i;
        int count = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 5, 2, 5);

        Propiedades[] transportesaux;
        for (i = 0; i < transporte.length; i++) {
            if (listatransportes.buscarPropiedad(i+1).getDueño().getNombre() == listajugadores.buscarJugador(player).getNombre()) {
                count = count + 1;
            }

        }
         System.out.println("El tamaño del arreglo de transportes es-->"+" "+count);
        if(count >=1){
        transportesaux = new Propiedades[count];
        int contador1 = 0;
        for (i = 0; i < transporte.length; i++) {
            if (listatransportes.buscarPropiedad(i+1).getDueño().getNombre() == listajugadores.buscarJugador(player).getNombre()) {
                //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                transportesaux[contador1] = transporte[i];
                 System.out.println("transportes aux el dueño es:"+" "+transportesaux[contador1].getDueño().getNombre()+" "+transportesaux[contador1].getCarta().getTitulo());
                contador1++;
            }
        }
        //filas
        int imagencount = 0;
        for (int y = 0; y < 4; y++) {
            //columnas
            for (int x = 0; x < 6; x++) {
                //girdx,gridy manejan la posición en la que se muestra el componente.
                gbc.gridx = y;
                gbc.gridy = x;
                if(imagencount < transportesaux.length){
                    if (transportesaux[imagencount] != null) {
//            j1.setIcon(iconolb);
//            j1.setBorder(BorderFactory.createLineBorder(Color.yellow));
//            j1.setBackground(Color.CYAN);
                        //j1.setOpaque(true);

                        Image imagelb = transportesaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(57, -1, java.awt.Image.SCALE_DEFAULT);
                        ImageIcon iconoaux = new ImageIcon(imagelb);
                        JLabel labelaux = new JLabel();
                        labelaux.setIcon(iconoaux);
                        //terrenosaux[imagencount].getCarta().getIcono().getLabelcarta()
                        interfaz.panelTransporte.add(labelaux, gbc);
                        interfaz.repaint();
                        imagencount++;
                    } else {
                        System.out.println("El jugador no ha comprado nada");
                        break;
                    }
                } else {
                    System.out.println("Hasta aquí llegaron los transportes del jugador");
                    break;
                }

            }
            //imagencount++;
        }
    }else{
        System.out.println("El jugador no ha comprado Estaciones de transporte");
        } 
    }
    public void imagenTransporteJugador(int player){
        //Image imglb = new ImageIcon(getClass().getResource("/images/ficha1.png")).getImage();
        int i;
        int count = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 5, 2, 5);

        Propiedades[] transportesaux;
        for (i = 0; i < transporte.length; i++) {
            if (transporte[i].getDueño().getNombre() == jugadores[player].getNombre()) {
                count = count + 1;
            }

        }
         System.out.println("El tamaño del arreglo de transportes es-->"+" "+count);
        if(count >=1){
        transportesaux = new Propiedades[count];
        int contador1 = 0;
        for (i = 0; i < transporte.length; i++) {
            if (transporte[i].getDueño().getNombre() == jugadores[player].getNombre()) {
                //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                transportesaux[contador1] = transporte[i];
                 System.out.println("transportes aux el dueño es:"+" "+transportesaux[contador1].getDueño().getNombre()+" "+transportesaux[contador1].getCarta().getTitulo());
                contador1++;
            }
        }
        //filas
        int imagencount = 0;
        for (int y = 0; y < 4; y++) {
            //columnas
            for (int x = 0; x < 6; x++) {
                //girdx,gridy manejan la posición en la que se muestra el componente.
                gbc.gridx = y;
                gbc.gridy = x;
                if(imagencount < transportesaux.length){
                    if (transportesaux[imagencount] != null) {
//            j1.setIcon(iconolb);
//            j1.setBorder(BorderFactory.createLineBorder(Color.yellow));
//            j1.setBackground(Color.CYAN);
                        //j1.setOpaque(true);

                        Image imagelb = transportesaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(57, -1, java.awt.Image.SCALE_DEFAULT);
                        ImageIcon iconoaux = new ImageIcon(imagelb);
                        JLabel labelaux = new JLabel();
                        labelaux.setIcon(iconoaux);
                        //terrenosaux[imagencount].getCarta().getIcono().getLabelcarta()
                        interfaz.panelTransporte.add(labelaux, gbc);
                        interfaz.repaint();
                        imagencount++;
                    } else {
                        System.out.println("El jugador no ha comprado nada");
                        break;
                    }
                } else {
                    System.out.println("Hasta aquí llegaron los transportes del jugador");
                    break;
                }

            }
            //imagencount++;
        }
    }else{
        System.out.println("El jugador no ha comprado Estaciones de transporte");
        } 
    }
    public void imagenServicioJugadorLista(int player){
        
         int i;
         int count = 0;
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.fill = GridBagConstraints.BOTH;
         gbc.insets = new Insets(2, 5, 2, 5);

         Propiedades[] serviciosaux;
         for (i = 0; i < servicio.length; i++) {
             if (listaservicios.buscarPropiedad(i+1).getDueño().getNombre() == listajugadores.buscarJugador(player).getNombre()) {
                 count = count + 1;
             }
         }
         System.out.println("El tamaño del arreglo de servicios es-->" + " " + count);
         if (count >= 1) {
             serviciosaux = new Propiedades[count];
             int contador1 = 0;
             for (i = 0; i < servicio.length; i++) {
                 if (listaservicios.buscarPropiedad(i+1).getDueño().getNombre() == listajugadores.buscarJugador(player).getNombre()) {
                     //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                     serviciosaux[contador1] = servicio[i];
                     System.out.println("servicios aux el dueño es:" + " " + serviciosaux[contador1].getDueño().getNombre() + " " + serviciosaux[contador1].getCarta().getTitulo());
                     contador1++;
                 }
             }
             //filas
             int imagencount = 0;
             for (int y = 0; y < 4; y++) {
                 //columnas
                 for (int x = 0; x < 6; x++) {
                     //girdx,gridy manejan la posición en la que se muestra el componente.
                     gbc.gridx = y;
                     gbc.gridy = x;
                     System.out.println("El contador de posición en el arreglo serviciosaux-->" + imagencount);
                     if (imagencount < serviciosaux.length) {
                         if (serviciosaux[imagencount] != null) {

                             Image imagelb = serviciosaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(57, -1, java.awt.Image.SCALE_DEFAULT);
                             ImageIcon iconoaux = new ImageIcon(imagelb);
                             JLabel labelaux = new JLabel();
                             labelaux.setIcon(iconoaux);

                             interfaz.panelServicio.add(labelaux, gbc);
                             interfaz.repaint();
                             imagencount++;
                         } else {
                             System.out.println("El jugador no ha comprado nada");
                             break;
                         }
                     } else {
                         System.out.println("Hasta aquí llegaron los servicios del jugador");
                         break;
                     }
                 }
             }
         } else {
             System.out.println("El jugador no ha comprado compañias de servicios");
         }
    }
    public void imagenServicioJugador(int player){
        
         int i;
         int count = 0;
         GridBagConstraints gbc = new GridBagConstraints();
         gbc.fill = GridBagConstraints.BOTH;
         gbc.insets = new Insets(2, 5, 2, 5);

         Propiedades[] serviciosaux;
         for (i = 0; i < servicio.length; i++) {
             if (servicio[i].getDueño().getNombre() == jugadores[player].getNombre()) {
                 count = count + 1;
             }
         }
         System.out.println("El tamaño del arreglo de servicios es-->" + " " + count);
         if (count >= 1) {
             serviciosaux = new Propiedades[count];
             int contador1 = 0;
             for (i = 0; i < servicio.length; i++) {
                 if (servicio[i].getDueño().getNombre() == jugadores[player].getNombre()) {
                     //cuidado si no es dueño de la posición 2 y si de la 3 entonces el espacio 2 lo deja vacio y el 3 le agrega la propiedad
                     serviciosaux[contador1] = servicio[i];
                     System.out.println("servicios aux el dueño es:" + " " + serviciosaux[contador1].getDueño().getNombre() + " " + serviciosaux[contador1].getCarta().getTitulo());
                     contador1++;
                 }
             }
             //filas
             int imagencount = 0;
             for (int y = 0; y < 4; y++) {
                 //columnas
                 for (int x = 0; x < 6; x++) {
                     //girdx,gridy manejan la posición en la que se muestra el componente.
                     gbc.gridx = y;
                     gbc.gridy = x;
                     System.out.println("El contador de posición en el arreglo serviciosaux-->" + imagencount);
                     if (imagencount < serviciosaux.length) {
                         if (serviciosaux[imagencount] != null) {

                             Image imagelb = serviciosaux[imagencount].getCarta().getIcono().getImagen().getScaledInstance(57, -1, java.awt.Image.SCALE_DEFAULT);
                             ImageIcon iconoaux = new ImageIcon(imagelb);
                             JLabel labelaux = new JLabel();
                             labelaux.setIcon(iconoaux);

                             interfaz.panelServicio.add(labelaux, gbc);
                             interfaz.repaint();
                             imagencount++;
                         } else {
                             System.out.println("El jugador no ha comprado nada");
                             break;
                         }
                     } else {
                         System.out.println("Hasta aquí llegaron los servicios del jugador");
                         break;
                     }
                 }
             }
         } else {
             System.out.println("El jugador no ha comprado compañias de servicios");
         }
    }
    public void botones(){
    interfaz.avanzarbt.addActionListener(this);
    interfaz.avanzarbt.setMnemonic(KeyEvent.VK_UP);
    interfaz.retrocederbt.addActionListener(this);
    interfaz.retrocederbt.setMnemonic(KeyEvent.VK_DOWN);
    interfaz.reporte3.addActionListener(this);
    interfaz.itemjugadores2.addActionListener(this);
    interfaz.itemjugadores3.addActionListener(this);
    interfaz.itemjugadores4.addActionListener(this);
    interfaz.reporte2.addActionListener(this);
    interfaz.terminarturnobt.addActionListener(this);
    interfaz.dadobt.addActionListener(this);
    interfaz.reporte1.addActionListener(this);
    interfaz.manualUsuario.addActionListener(this);
    interfaz.reportespdf1.addActionListener(this);
    interfaz.siguientecupon.addActionListener(this);
    interfaz.activarCupones.addActionListener(this);
    interfaz.activarCaja.addActionListener(this);
    interfaz.siguientecaja.addActionListener(this);
    interfaz.mostrarterrenos.addActionListener(this);
    interfaz.reportepdf2.addActionListener(this);
    interfaz.reportepdf3.addActionListener(this);
            }
    public void activarCartasCupones(){
        ///esta parte se debe crear al momento de que un jugador caiga en la casilla de cupon
        cuponActual = listaCupon.getCabeza().getSiguiente();
        interfaz.cuponlb.setIcon(redimensionarImagen(230,cuponActual.getIcono().getImagen()));
        interfaz.siguientecupon.setEnabled(true);
    }
    public void activarCartasCaja(){
        ///esta parte se debe crear al momento de que un jugador caiga en la casilla de cupon
        cajaActual = listaCaja.getCabeza().getSiguiente();
        interfaz.cuponlb.setIcon(redimensionarImagen(230,cajaActual.getIcono().getImagen()));
        interfaz.siguientecaja.setEnabled(true);
    }
    public void avanzar(int paso) {
        /*p1:610,610
         p2:640,610
         p3:610,640
         p3:640,640
         */
        switch(numeroJugadores){
            case 2:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                     casillasAcciones();
                    if (x > 40 && y >= 610) {
                        avanzarIzquierdaHorizontal(1, paso);
                        
                    } else if (x <= 40 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(1);
                    } else if (x < 610 && y <= 40) {
                        avanzarDerechaHorizontal(1);
                    } else if (x >= 610 && y < 610) {
                        avanzarVerticalAbajo(1);
                    }
                    

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                        casillasAcciones();
                    if (x > 10 && y >= 610) {
                        avanzarIzquierdaHorizontal(2, paso);
                    } else if (x <= 10 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(2);
                    } else if (x < 640 && y <= 10) {
                        avanzarDerechaHorizontal(2);
                    } else if (x >= 640 && y < 640) {
                        avanzarVerticalAbajo(2);
                    }
                }

                break;
            case 3:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 40 && y >= 610) {
                        avanzarIzquierdaHorizontal(1, paso);
                    } else if (x <= 40 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(1);
                    } else if (x < 610 && y <= 40) {
                        avanzarDerechaHorizontal(1);
                    } else if (x >= 610 && y < 610) {
                        avanzarVerticalAbajo(1);
                    }

                }else if(listajugadores.buscarJugador(2).isTurno() == true){
                int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 10 && y >= 610) {
                        avanzarIzquierdaHorizontal(2, paso);
                    } else if (x <= 10 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(2);
                    } else if (x < 640 && y <= 10) {
                        avanzarDerechaHorizontal(2);
                    } else if (x >= 640 && y < 640) {
                        avanzarVerticalAbajo(2);
                    }
                }
                else if(listajugadores.buscarJugador(3).isTurno() == true){
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 40 && y >= 640) {
                        avanzarIzquierdaHorizontal(3, paso);
                    } else if (x <= 40 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(3);
                    } else if (x < 640 && y <= 10) {
                        avanzarDerechaHorizontal(3);
                    } else if (x >= 610 && y < 640) {
                        avanzarVerticalAbajo(3);
                    }
                }
                break;
            case 4:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 40 && y >= 610) {
                        avanzarIzquierdaHorizontal(1, paso);
                    } else if (x <= 40 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(1);
                    } else if (x < 610 && y <= 40) {
                        avanzarDerechaHorizontal(1);
                    } else if (x >= 610 && y < 610) {
                        avanzarVerticalAbajo(1);
                    }

                }else if(listajugadores.buscarJugador(2).isTurno() == true){
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 10 && y >= 610) {
                        avanzarIzquierdaHorizontal(2, paso);
                    } else if (x <= 10 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(2);
                    } else if (x < 640 && y <= 10) {
                        avanzarDerechaHorizontal(2);
                    } else if (x >= 640 && y < 640) {
                        avanzarVerticalAbajo(2);
                    }
                }else if(listajugadores.buscarJugador(3).isTurno() == true){
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 40 && y >= 640) {
                        avanzarIzquierdaHorizontal(3, paso);
                    } else if (x <= 40 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(3);
                    } else if (x < 640 && y <= 10) {
                        avanzarDerechaHorizontal(3);
                    } else if (x >= 610 && y < 640) {
                        avanzarVerticalAbajo(3);
                    }
                }else if(listajugadores.buscarJugador(4).isTurno() == true){
                    int x = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getY();
                    casillasAcciones();
                    if (x > 10 && y >= 640) {
                        avanzarIzquierdaHorizontal(4, paso);
                    } else if (x <= 10 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        avanzarVerticalArriba(4);
                    } else if (x < 640 && y <= 40) {
                        avanzarDerechaHorizontal(4);
                    } else if (x >= 640 && y < 640) {
                        avanzarVerticalAbajo(4); 
                    }
                }
                break;
        }
        

    }
    public void regresar() {
        /*p1:610,610
         p2:640,610
         p3:610,640
         p3:640,640
         */
        //x=40 y=610
        //player = player-1;
        switch(numeroJugadores){
            case 2:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();

                    if (x < 610 && y >= 610) {
                        regresarDerechaHorizontal(1);
                    } else if (x >= 610 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(1);
                    } else if (x > 40 && y <= 40) {
                        regresarIzquierdaHorizontal(1);
                    } else if (x <= 40 && y < 610) {
                        regresarVerticalAbajo(1);
                    }

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 610) {
                        regresarDerechaHorizontal(2);
                    } else if (x >= 640 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(2);
                    } else if (x > 10 && y <= 10) {
                        regresarIzquierdaHorizontal(2);
                    } else if (x <= 10 && y < 610) {
                        regresarVerticalAbajo(2);
                    }
                }
                
                break;
            case 3:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();

                    if (x < 610 && y >= 610) {
                        regresarDerechaHorizontal(1);
                    } else if (x >= 610 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(1);
                    } else if (x > 40 && y <= 40) {
                        regresarIzquierdaHorizontal(1);
                    } else if (x <= 40 && y < 610) {
                        regresarVerticalAbajo(1);
                    }

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 610) {
                        regresarDerechaHorizontal(2);
                    } else if (x >= 640 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(2);
                    } else if (x > 10 && y <= 10) {
                        regresarIzquierdaHorizontal(2);
                    } else if (x <= 10 && y < 610) {
                        regresarVerticalAbajo(2);
                    }
                }
                else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 640) {
                        regresarDerechaHorizontal(3);
                    } else if (x >= 640 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(3);
                    } else if (x > 40 && y <= 10) {
                        regresarIzquierdaHorizontal(3);
                    } else if (x <= 40 && y < 640) {
                        regresarVerticalAbajo(3);
                    }
                }
                break;
            case 4:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    //x=40 y=610
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();

                    if (x < 610 && y >= 610) {
                        regresarDerechaHorizontal(1);
                    } else if (x >= 610 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(1);
                    } else if (x > 40 && y <= 40) {
                        regresarIzquierdaHorizontal(1);
                    } else if (x <= 40 && y < 610) {
                        regresarVerticalAbajo(1);
                    }

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 610) {
                        regresarDerechaHorizontal(2);
                    } else if (x >= 640 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(2);
                    } else if (x > 10 && y <= 10) {
                        regresarIzquierdaHorizontal(2);
                    } else if (x <= 10 && y < 610) {
                        regresarVerticalAbajo(2);
                    }
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 640) {
                        regresarDerechaHorizontal(3);
                    } else if (x >= 640 && y > 10) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(3);
                    } else if (x > 40 && y <= 10) {
                        regresarIzquierdaHorizontal(3);
                    } else if (x <= 40 && y < 640) {
                        regresarVerticalAbajo(3);
                    }
                } else if (listajugadores.buscarJugador(4).isTurno() == true) {
                    int x = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getY();

                    if (x < 640 && y >= 640) {
                        regresarDerechaHorizontal(4);
                    } else if (x >= 640 && y > 40) {
                        //mayor a 40 por que tiene que llegar a 40 e ir vertical arriba reduce.
                        regresarVerticalArriba(4);
                    } else if (x > 10 && y <= 40) {
                        regresarIzquierdaHorizontal(4);
                    } else if (x <= 10 && y < 640) {
                        regresarVerticalAbajo(4);
                    }
                }
                break;
        }
       ///<-------VAS AQUI
    }
    public void avanzarIzquierdaHorizontal(int player,int paso){
    
        //player=player-1; 
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x - (paso * 10), y);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");

    }
    public void avanzarDerechaHorizontal(int player){
    
     //player=player-1; 
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x + 10, y);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");
                //avanzarVertical(player);
           
    }
    public void avanzarVerticalArriba(int player){
    
    //player= player-1;
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x, y - 10);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");
            
    }
    public void avanzarVerticalAbajo(int player){
    
    //player= player-1;
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x, y + 10);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");

    } 
    public void regresarIzquierdaHorizontal(int player){
    
        //player=player-1; 
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x - 10, y);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");

    }
    public void regresarDerechaHorizontal(int player){
        
        //player=player-1; 
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x + 10, y);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");

    }
    public void regresarVerticalArriba(int player){

        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x, y -10);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");
   
    }
    public void regresarVerticalAbajo(int player){
   
        int x = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX();
        int y = listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY();

        listajugadores.buscarJugador(player).getFicha().getFichaPanel().setLocation(x, y + 10);
        System.out.println("Coordenadas:" + "(" + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getX() + "," + listajugadores.buscarJugador(player).getFicha().getFichaPanel().getY() + ")");
    }
    public void comprar(int jugador,Propiedades terreno){
        int response = JOptionPane.showConfirmDialog(null, "LA PROPIEDAD NO TIENE DUEÑO"+"\n"+"¿DESEA COMPRARLA?", "MONOPOLY", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        switch (response) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null,"Has comprado con exito esta propiedad","MONOPOLY",JOptionPane.INFORMATION_MESSAGE);
                //el terreno se le asigna al de la lista.
                terreno.setDueño(listajugadores.buscarJugador(jugador));
                terreno.setVendida(true);
                banco2.banco.setDinero(banco2.banco.getDinero()+terreno.getCarta().getPrecio());
                listajugadores.buscarJugador(jugador).setDinero(listajugadores.buscarJugador(jugador).getDinero()-terreno.getCarta().getPrecio());
                mostrarDatosyFicha(jugador);
                getContadorpropiedades()[jugador-1] = getContadorpropiedades()[jugador-1]+1;
                interfaz.repaint();
                System.out.println("EL NUEVO DUEÑO DE LA PROPIEDAD"+" "+terreno.getCarta().getTitulo()+"\n "+"es:"+terreno.getDueño().getNombre());
                
                System.out.println("EL DINERO EN EL BANCO AHORA ES:"+Integer.toString(banco2.banco.getDinero()));
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("You chose no");
                subastar(jugador,terreno);
                //turnoSubasta(jugador,terreno);
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("You chose cancel");
                break;

            case JOptionPane.CLOSED_OPTION:
                System.out.println("You closed the dialog box.");
                break;
            default:
                System.out.println("I do not know what you did ");
        }
    }
    public void pagarPeaje(int jugador,Propiedades terreno){
    int response = JOptionPane.showConfirmDialog(null, "LA PROPIEDAD TIENE DUEÑO"+"\n"+"PAGAR DERECHO DE PASO", "MONOPOLY", JOptionPane.OK_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        switch (response) {
            case JOptionPane.OK_OPTION:
                JOptionPane.showMessageDialog(null,"HAS CANCELADO EL DERECHO DE PASO","MONOPOLY",JOptionPane.INFORMATION_MESSAGE);
                terreno.getDueño().setDinero(terreno.getDueño().getDinero()+terreno.getCarta().getRenta());
                listajugadores.buscarJugador(jugador).setDinero(listajugadores.buscarJugador(jugador).getDinero()-terreno.getCarta().getRenta());
                
                mostrarDatosyFicha(jugador);
                interfaz.repaint();
//                System.out.println("EL NUEVO DUEÑO DE LA PROPIEDAD"+" "+terreno.getCarta().getTitulo()+"\n "+"es:"+terreno.getDueño().getNombre());
//                
//                System.out.println("EL DINERO EN EL BANCO AHORA ES:"+Integer.toString(banco2.banco.getDinero()));
                break;

            case JOptionPane.CLOSED_OPTION:
                System.out.println("You closed the dialog box.");
                break;
            default:
                System.out.println("I do not know what you did ");
        }
    }
    public void casillasAcciones(){
        switch (numeroJugadores) {
            case 2:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(1, x, y);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(2, x, y);
                }
                break;
            case 3:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    System.out.println("El jugador 1 esta en turno");
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(1, x, y);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(2, x, y);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(3, x, y);
                }
                break;
            case 4:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    int x = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(1).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(1, x, y);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int x = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(2).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(2, x, y);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int x = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(3).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(3, x, y);
                }
                else if (listajugadores.buscarJugador(4).isTurno() == true) {
                    int x = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getX();
                    int y = listajugadores.buscarJugador(4).getFicha().getFichaPanel().getY();
                    CayoEnCasilla(4, x, y);
                }
                break;
                
    }
    }
    public void CayoEnCasilla(int jugador,int x, int y){ //ACTIVAR LA OPCION DE RESULTADO LANZAMIENTO, LA APAGASTE PARA VER SI FUNCIONABA A LLEGAR A UNA CASILLA
        //----------------------CASILLA 2: TERRENO 1-------------------<--si funciona
        if (x <= 550 && x >= 540 && y >= 610) {
            if (casilla2.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c2.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(1).isVendida() == false) {
                    comprar(jugador, listaterrenos.buscarPropiedad(1));
                } else if (listaterrenos.buscarPropiedad(1).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(1));
                }
            }
            //-----------CASILLA 3: COMMUNITY CHEST------------
        } else if (x < 540 && x > 500 && y >= 610) {
            if (casilla3.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c3.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                this.activarCartasCaja();
            }
            //-----------CASILLA 4 TERRENO 2-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x < 480 && x > 425 && y >= 610) {
            if (casilla4.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c4.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(2).isVendida() == false) {
                    comprar(jugador, listaterrenos.buscarPropiedad(2));
                } else if (listaterrenos.buscarPropiedad(2).isVendida() == true) {
                   pagarPeaje(jugador,listaterrenos.buscarPropiedad(2));
                }
            }
            //-----------CASILLA 5 ICOME TAXE ESPECIAL[2]----
        }else if (x < 420 && x > 370 && y >= 610) {
                System.out.println("El jugador a llegado a la casilla 5");
            if (casilla5.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c5.getImagen());
                interfaz.avanzarbt.setEnabled(false);
            }
            //-----------CASILLA 6 TRANSPORTE 1-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        } else if (x < 370 && x > 315 && y >= 610) {
            if (casilla6.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c6.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listatransportes.buscarPropiedad(1).isVendida() == false) {
                    comprar(jugador, listatransportes.buscarPropiedad(1));
                } else if (listatransportes.buscarPropiedad(1).isVendida() == true) {
                    pagarPeaje(jugador,listatransportes.buscarPropiedad(1));
                }
            }
            //-----------CASILLA 7 TERRENO 3-------------- 
        }else if (x < 290 && x > 260 && y >= 610) {
            System.out.println("El jugador a llegado a la casilla 7");
            if (casilla7.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c7.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(3).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(3));
                } else if (listaterrenos.buscarPropiedad(3).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(3));
                }
            }
           //-----------CASILLA 8: CHANCE ESPECIAL[3] ------------
        } else if (x < 255 && x > 210) {
            if (casilla8.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c8.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                this.activarCartasCupones();
            }
            //-----------CASILLA 9 TERRENO 4-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x < 190 && x > 145) {
            if (casilla9.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c9.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(4).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(4));
                } else if (listaterrenos.buscarPropiedad(4).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(4));
                }
            }
            //-----------CASILLA 10 TERRENO 5-------------- 
        }else if (x < 145 && x > 90 && y >=610) {
            if (casilla10.isCasillaactiva() == true) {
                System.out.println("ESTAS EN LA CASILLA "+" "+casilla10.getTitulo());
                interfaz.internalFrame(this.imagen.c10.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(5).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(5));
                } else if (listaterrenos.buscarPropiedad(5).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(5));
                }
            }
            //-----------CASILLA 11 CARCEL -------------- 
        }else if (x <=90 && x >= 10 && y <= 640 && y > 590 ) {
            if (casilla11.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c11.getImagen());
                interfaz.avanzarbt.setEnabled(false);
            }
            //-----------CASILLA 12 TERRENO 6-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x <=90 && x >= 10 && y < 590 && y > 535) {
            if (casilla12.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c12.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(6).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(6));
                } else if (listaterrenos.buscarPropiedad(6).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(6));
                }
            }
            //-----------CASILLA 13 SERVICIO 1--------------
        }else if (x <=90 && x >= 10 && y < 535 && y >480) {
            if (casilla13.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c13.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaservicios.buscarPropiedad(1).isVendida() == false) {
                    comprar(jugador,listaservicios.buscarPropiedad(1));
                } else if (listaservicios.buscarPropiedad(1).isVendida() == true) {
                    pagarPeaje(jugador,listaservicios.buscarPropiedad(1));
                }
            }
            //-----------CASILLA 14 TERRENO 7-------------- 
        }else if (x < 90 && x >= 10 && y < 480 && y > 425) {
            if (casilla14.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c14.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(7).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(7));
                } else if (listaterrenos.buscarPropiedad(7).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(7));
                }
            }
            //-----------CASILLA 15 TERRENO 8--------------
        }else if (x < 90 && x >= 10 && y < 425 && y > 370) {
            if (casilla15.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c15.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(8).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(8));
                } else if (listaterrenos.buscarPropiedad(8).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(8));
                }
            }
            //-----------CASILLA 16 TRANSPORTE 2--------------
        }else if (x < 90 && x >= 10 && y < 370 && y > 310) {
            if (casilla16.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c16.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listatransportes.buscarPropiedad(2).isVendida() == false) {
                    comprar(jugador, listatransportes.buscarPropiedad(2));
                } else if (listatransportes.buscarPropiedad(2).isVendida() == true) {
                    pagarPeaje(jugador,listatransportes.buscarPropiedad(2));
                }
            }
            //-----------CASILLA 17 TERRENO 9--------------
        }else if (x < 90 && x >= 10 && y < 310 && y > 260) {
            if (casilla17.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c17.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(9).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(9));
                } else if (listaterrenos.buscarPropiedad(9).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(9));
                }
            }
           //-----------CASILLA 18: COMMUNITY CHEST------------
        }else if (x < 90 && x >= 10 && y < 260 && y > 200) {
            if (casilla18.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c18.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                this.activarCartasCaja();
            }
            //-----------CASILLA 19 TERRENO 10-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x < 90 && x >= 10 && y < 200 && y > 145) {
            if (casilla19.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c19.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(10).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(10));
                } else if (listaterrenos.buscarPropiedad(10).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(10));
                }
            }
           //-----------CASILLA 20: TERRENO 11------------
        }else if (x < 90 && x >= 10 && y < 145 && y > 90) {
            if (casilla20.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c20.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(11).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(11));
                } else if (listaterrenos.buscarPropiedad(11).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(11));
                }
            }
           //-----------CASILLA 21: FREE PARKING1------------
        }else if (x < 60 && x >= 10 && y < 60 && y >=10 ) {
            if (casilla21.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c21.getImagen());
                interfaz.avanzarbt.setEnabled(false);
            }
            //-----------CASILLA 22 TERRENO 12-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x > 80 && x < 120 && y < 60 && y >= 10) { //intentar menor a y =60
            if (casilla22.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c22.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(12).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(12));
                } else if (listaterrenos.buscarPropiedad(12).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(12));
                }
            }
           //-----------CASILLA 23: CHANCE------------
        } else if (x > 120 && x < 175 && y < 640 && y >= 10) {
            if (casilla23.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c23.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                this.activarCartasCupones();
            }
            //-----------CASILLA 24 TERRENO 13 -------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x > 175 && x < 230 && y < 640 && y >= 10) {
            if (casilla24.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c24.getImagen());
                interfaz.avanzarbt.setEnabled(false);
                if (listaterrenos.buscarPropiedad(13).isVendida() == false) {
                    comprar(jugador, terrenos[12]);
                } else if (listaterrenos.buscarPropiedad(13).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(13));
                }
            }
           //-----------CASILLA 25: TERRENO 14------------
        }else if (x > 230 && x < 290 && y < 640 && y >= 10) {
            if (casilla25.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c25.getImagen()); //aqui ya no apague el boton de avanzar por wueba xD
                if (listaterrenos.buscarPropiedad(14).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(14));
                } else if (listaterrenos.buscarPropiedad(14).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(14));
                }
            }
           //-----------CASILLA 26: TRANSPORTE 3------------
        }else if (x > 290 && x < 340 && y < 640 && y >= 10) {
            if (casilla26.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c26.getImagen());
                if (listatransportes.buscarPropiedad(3).isVendida() == false) {
                    comprar(jugador, listatransportes.buscarPropiedad(3));
                } else if (listatransportes.buscarPropiedad(3).isVendida() == true) {
                    pagarPeaje(jugador,listatransportes.buscarPropiedad(3));
                }
            }
            //-----------CASILLA 27 TERRENO 15--------------
        }else if (x > 340 && x < 400 && y < 640 && y >= 10) {
            if (casilla27.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c27.getImagen());
                if (listaterrenos.buscarPropiedad(15).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(15));
                } else if (listaterrenos.buscarPropiedad(15).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(15));
                }
            }
           //-----------CASILLA 28: TERRENO 16------------
        }else if (x > 400 && x < 455 && y < 640 && y >= 10) {
            if (casilla28.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c28.getImagen());
                if (listaterrenos.buscarPropiedad(16).isVendida() == false) {
                    comprar(jugador, listaterrenos.buscarPropiedad(16));
                } else if (listaterrenos.buscarPropiedad(16).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(16));
                }
            }
           //-----------CASILLA 29: SERVICIO 2----------------
        }else if (x > 455 && x < 510 && y < 640 && y >= 10) {
            if (casilla29.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c29.getImagen());
                if (listaservicios.buscarPropiedad(2).isVendida() == false) {
                    comprar(jugador,listaservicios.buscarPropiedad(2));
                } else if (listaservicios.buscarPropiedad(2).isVendida() == true) {
                    pagarPeaje(jugador,listaservicios.buscarPropiedad(2));
                }
            }
           //-----------CASILLA 30: TERRENO 17-------------------------------
        }else if (x > 510 && x < 565 && y < 640 && y >= 10) {
            if (casilla30.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c30.getImagen());
                if (listaterrenos.buscarPropiedad(17).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(17));
                } else if (listaterrenos.buscarPropiedad(17).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(17));
                }
            }
           //-----------CASILLA 31: GO TO JAIL------------
        }else if (x > 565 && x <= 640 && y < 65 && y >= 10) {
            if (casilla31.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c31.getImagen());
            }
            //-----------CASILLA 32 TERRENO 18-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x > 565 && x <= 640  && y > 65 && y < 120) {
            if (casilla32.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c32.getImagen());
                if (listaterrenos.buscarPropiedad(18).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(18));
                } else if (listaterrenos.buscarPropiedad(18).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(18));
                }
            }
           //-----------CASILLA 33: TERRENO 19------------
        }else if (x > 565 && x <= 640  && y > 120 && y < 175) {
            if (casilla33.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c33.getImagen());
                if (listaterrenos.buscarPropiedad(19).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(19));
                } else if (listaterrenos.buscarPropiedad(19).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(19));
                }
            }
           //-----------CASILLA 34: COMMUNTIY CHEST------------
        }else if (x > 565 && x <= 640  && y > 175 && y < 230) {
            if (casilla34.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c34.getImagen());
                this.activarCartasCaja();
            }
            //-----------CASILLA 35: TERRENO 20------------
        }else if (x > 565 && x <= 640  && y > 230 && y < 290) {
            if (casilla33.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c35.getImagen());
                if (listaterrenos.buscarPropiedad(20).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(20));
                } else if (listaterrenos.buscarPropiedad(20).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(20));
                }
            }
           //-----------CASILLA 36: TRANSPORTE 4------------
        }else if (x > 565 && x <= 640  && y > 290 && y < 340){
            if (casilla36.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c36.getImagen());
                if (listatransportes.buscarPropiedad(4).isVendida() == false) {
                    comprar(jugador,listatransportes.buscarPropiedad(4));
                } else if (listatransportes.buscarPropiedad(4).isVendida() == true) {
                    pagarPeaje(jugador,listatransportes.buscarPropiedad(4));
                }
            }
            //-----------CASILLA 37 CHANCE --------------
        }else if (x > 565 && x <= 640  && y > 340 && y < 400){
            if (casilla37.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c37.getImagen());
                this.activarCartasCupones();
            }
            //-----------CASILLA 38 TERRENO 21 -------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x > 565 && x <= 640  && y > 400 && y < 460) {
            if (casilla38.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c38.getImagen());
                if (listaterrenos.buscarPropiedad(21).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(21));
                } else if (listaterrenos.buscarPropiedad(21).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(21));
                }
            }
           //-----------CASILLA 39: INCOME TAX------------
        }else if (x > 565 && x <= 640  && y > 460 && y < 510){
            if (casilla39.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c39.getImagen());
            }
            //-----------CASILLA 40 TERRENO 22 -------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }else if (x > 565 && x <= 640  && y > 510 && y < 565) {
            if (casilla40.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c40.getImagen());
                if (listaterrenos.buscarPropiedad(22).isVendida() == false) {
                    comprar(jugador,listaterrenos.buscarPropiedad(22));
                } else if (listaterrenos.buscarPropiedad(22).isVendida() == true) {
                    pagarPeaje(jugador,listaterrenos.buscarPropiedad(22));
                }
            }
           //-----------CASILLA 1: ENTRADA------------
        }else if (x <=640 && x >= 10 && y <= 640 && y > 590 ) {
            if (casilla1.isCasillaactiva() == true) {
                interfaz.internalFrame(this.imagen.c1.getImagen());
            }
            //-----------CASILLA 12 TERRENO 6-------------- //CUIDADO SE DEBE CAMBIAR LA CASILLA, LA IMAGEN Y EL NUMERO DE TERRENO EN EL ARREGLO
        }
    }
    public void mostrarTerrenos(){
        listaterrenos.mostrarPropiedades();
    }
    public void siguienteCupon(){
        cuponActual = cuponActual.getSiguiente();
        interfaz.cuponlb.setIcon(redimensionarImagen(230,cuponActual.getIcono().getImagen()));
        System.out.println("No. Cupon actual"+cuponActual.getNumero());
    }
    public void siguienteCaja(){
        cajaActual = cajaActual.getSiguiente();
        interfaz.cuponlb.setIcon(redimensionarImagen(230,cajaActual.getIcono().getImagen()));
        System.out.println("No. Caja actual"+cajaActual.getNumero());
    }
    public void reporte3(){
        System.out.println("------TERRENOS EN VENTA-----");
        for(int i=0; i<terrenos.length;i++){
            if(terrenos[i].isVendida()==false){
                System.out.println((i+1)+"."+" "+terrenos[i].getCarta().getTitulo()+" "+"EN VENTA"+" "+"DUEÑO:"+" "+terrenos[i].getDueño().getNombre());
            }
        }
        System.out.println("------COMPAÑIAS DE TRANSPORTE EN VENTA-----");
        for(int i=0; i<transporte.length;i++){
            if(transporte[i].isVendida()==false){
                System.out.println((i+1)+"."+" "+transporte[i].getCarta().getTitulo()+" "+"EN VENTA"+" "+"DUEÑO:"+" "+transporte[i].getDueño().getNombre());
            }
        }
        System.out.println("------COMPAÑIAS DE SERVICIO EN VENTA-----");
        for(int i=0; i<servicio.length;i++){
            if(servicio[i].isVendida()==false){
                System.out.println((i+1)+"."+" "+servicio[i].getCarta().getTitulo()+" "+"EN VENTA"+" "+"DUEÑO:"+" "+transporte[i].getDueño().getNombre());
            }
        }
    }
    public void bancarrota(){
        switch (numeroJugadores) {
            case 2:
                if(jugadores[0].isTurno()==true){
                    
                }
                break;
            case 3:
                break;
            case 4:
                break;
            
    }
    }
    public void subastar(int jugador,Propiedades terreno){
        
        String titulo ="Monopoly";
        Icon icon =null;
        Object[] options = new String[]{"ofertar","retirarse"};
        Object initialOption = options[0];
        int minValue = terreno.getCarta().getPrecio();
        int maxValue = listajugadores.buscarJugador(jugador).getDinero();
        int currentValue = terreno.getCarta().getPrecio();
        int steps = 10000;
        SpinnerNumberModel model = new SpinnerNumberModel(currentValue, minValue, maxValue, steps);
        spinner = new JSpinner(model);
        //JOptionPane.showMessageDialog(null,spinner,"Monopoly",JOptionPane.OK_CANCEL_OPTION);
        int response = JOptionPane.showOptionDialog(null, spinner, titulo, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, initialOption);
        switch(response){
            case 0:
                int oferta = (int) spinner.getValue();
                ofertar(jugador,oferta,terreno);
                break;
            case 1:
                retirarse();
                break;
        }
    }
    public void ofertar(int jugador,int oferta,Propiedades terreno){
         switch (numeroJugadores) {
             case 2:
                 if (ofertas[0] == 0 || ofertas[1] == 0) {
                     if (jugador == 1) {
                         ofertas[0] = oferta;
                     } else {
                         ofertas[1] = oferta;
                     }
                     turnoSubasta(jugador,terreno);
                 } else {
                     int i;
                     int j;
                     for (i = 0; i < ofertas.length - 1; i++) {
                         for (j = 0; j < ofertas.length - 1; j++) {
                             if (ofertas[j] > ofertas[j + 1]) {
                                 int tmp = ofertas[j + 1];
                                 ofertas[j + 1] = ofertas[j];
                                 ofertas[j] = tmp;
                             }
                         }
                     }
                     System.out.println("El jugador que aposto más fue"+listajugadores.buscarJugador(jugador).getNombre());
                 }
                 break;
             case 3:
                 break;
             case 4:
                 break;
         }
    }
    public Jugador GanadorSubasta(int jugador){
       Jugador ganador = listajugadores.buscarJugador(jugador);
       return ganador;
    }
    public void retirarse(){
    }
    public void turnoSubasta(int jugador,Propiedades terreno){
        JOptionPane.showMessageDialog(null,"La Propiedad será subastada","Monpoly",JOptionPane.INFORMATION_MESSAGE);
         switch (numeroJugadores) {
            case 2:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    listajugadores.buscarJugador(1).setTurno(false);
                    listajugadores.buscarJugador(2).setTurno(true);
                    JOptionPane.showMessageDialog(null, "Turno del jugador 1", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(1,terreno);
                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    listajugadores.buscarJugador(1).setTurno(true);
                    listajugadores.buscarJugador(2).setTurno(false);
                    JOptionPane.showMessageDialog(null, "Turno del jugador 2", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(2,terreno);
                }
                break;
            case 3:
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);
                }
                break;
            case 4:
                if (listajugadores.buscarJugador(1).isTurno() == true) {

                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);

                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);
                } else if (listajugadores.buscarJugador(4).isTurno() == true) {
                    JOptionPane.showMessageDialog(null, "TIRAR DADO", "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    subastar(jugador,terreno);
                }
                break;
           }
    }
    public void tirarDado(){

        Dado dado1, dado2;
        dado1 = new Dado();
        dado2 = new Dado();

        dadoResul[0] = dado1.getValordado();
        dadoResul[1] = dado2.getValordado();
        System.out.println("DADO1-->" + dado1.getValordado() + " " + "DADO2-->" + dado2.getValordado());
        dadoResul[2] = dadoResul[0] + dadoResul[1];
        String val1 = Integer.toString(dadoResul[0]);
        String val2 = Integer.toString(dadoResul[1]);
        String total = Integer.toString(dadoResul[2]);
        interfaz.txtarea.setText(" " + "Dado 1:" + " " + val1 + "\n" + " " + "Dado 2:" + " " + val2 + "\n" + " " + "Avance:" + " " + total + " " + "casilla(s)");
        resultadoLanzamiento();
    }
    public void resultadoLanzamiento(){
    switch (numeroJugadores) {
            case 2:
                //-------------SIN SON 2 JUGADORES------------------------------
                    //-----------JUGADOR1----------------------------
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(1).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                    //-----------------JUGADOR 2-----------------------
                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(2).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }
                break;
            case 3: //--------SI SON 3 JUGADORES--------------
                //------------------JUGADOR 1-------------------------
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(1).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                    //----------------JUGADOR 2----------------------
                } else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(2).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                    //--------------JUGADOR 3----------------------------------
                } else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(3).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(3).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(3).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(3).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(3).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }
                break;
            case 4://--------------SI SON 4 JUGADORES-------------------
                //------------------JUGADOR 1-----------------------------
                if (listajugadores.buscarJugador(1).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(1).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(1).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(1).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }//------------------JUGADOR 2-----------------------------------
                else if (listajugadores.buscarJugador(2).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(2).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(2).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(2).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }//--------------------JUGADOR 3------------------------------------------ 
                else if (listajugadores.buscarJugador(3).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(3).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(3).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(3).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(3).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(3).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }//---------------------JUGADOR 4------------------------------------------ 
                else if (listajugadores.buscarJugador(4).isTurno() == true) {
                    int currentbox = listajugadores.buscarJugador(4).getCasillaactual();
                    int dadoResulaux = dadoResul[2];
                    currentbox = currentbox + dadoResulaux;
                    if (currentbox >= 40) {
                        currentbox = currentbox - 40;
                        listajugadores.buscarJugador(4).setCasillaactual(currentbox);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(4).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        listajugadores.buscarJugador(4).setCasillaactual(currentbox);
                        JOptionPane.showMessageDialog(null, "DEBE IR A LA CASILLA" + " " + listajugadores.buscarJugador(4).getCasillaactual(), "MONOPOLY", JOptionPane.INFORMATION_MESSAGE);
                        cartas[currentbox - 1].setCasillaactiva(true);
                        System.out.println("Se activo la carta:" + cartas[currentbox - 1].getTitulo());
                    }
                }
                break;
        }
    }
    //queda pendiente
    public int[] ordenarPropiedades(){
        int[] contador = new int[4];
        ListaJugadores listajugadoresaux = new ListaJugadores();
        listajugadoresaux = listajugadores;
        for(int k =0;k<this.getContadorpropiedades().length;k++){
            contador[k] = this.getContadorpropiedades()[k];
        }
        
        int i;
        int j;
        for(i=0;i<this.getContadorpropiedades().length-1;i++){
            for(j=0;j<this.getContadorpropiedades().length-1;j++){
                if(contador[j] > contador[j+1]){
                    int tmp = contador[j];
                    Jugador aux;
                    contador[j] = contador[j+1];
                    contador[j+1] = tmp;
                   
                    aux = listajugadoresaux.getCabeza();
                    listajugadoresaux.setCabeza(listajugadoresaux.getCabeza().getSiguiente());
                }
            }
        }
        return contador;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==interfaz.avanzarbt){
        int paso = (int) interfaz.spinner.getValue();
        avanzar(paso);
        }
        if(e.getSource()==interfaz.retrocederbt){
        regresar();
        }
        if(e.getSource()==interfaz.reporte3){
        reporte3();
        reporte.Reporte3();
        }
        if(e.getSource()==interfaz.itemjugadores2){
            numeroJugadores = 2;
        empezarJuego(numeroJugadores);
        }
        if(e.getSource()==interfaz.itemjugadores3){
        numeroJugadores = 3;
            empezarJuego(numeroJugadores);
            
        }
        if(e.getSource()==interfaz.itemjugadores4){
        numeroJugadores = 4;
            empezarJuego(numeroJugadores);
            
        }
        
         if(e.getSource()==interfaz.terminarturnobt){
             terminarTurno();
        }
         if(e.getSource()==interfaz.dadobt){
             tirarDado();
             interfaz.dadobt.setEnabled(false);
        }
         if(e.getSource()==interfaz.reporte1){
             reporte.Reporte3();
             
        }
         if(e.getSource()==interfaz.manualUsuario){
             reporte.manualDeUsuario();
             
        }
         if(e.getSource()==interfaz.reporte2){
             reporte.ReporteDinero();
             
        }
         if(e.getSource()==interfaz.reportespdf1){
            
             reportepdf.reportePropiedadesVenta();
             JOptionPane.showMessageDialog(null,"SE HA GENERADO EL REPORTE CON EXITO","Monopoly",JOptionPane.INFORMATION_MESSAGE);
             
        }
         if(e.getSource()==interfaz.siguientecupon){
             siguienteCupon();    
        }
         if(e.getSource()==interfaz.siguientecaja){
             siguienteCaja();    
        }
         if(e.getSource()==interfaz.activarCupones){
             activarCartasCupones();
             
        }
         if(e.getSource()==interfaz.activarCaja){
             activarCartasCaja();  
        }
         if(e.getSource()==interfaz.mostrarterrenos){
             mostrarTerrenos();  
        }
         if(e.getSource() == interfaz.reportepdf2){
             reportepdf.reporteDinero();
             JOptionPane.showMessageDialog(null,"SE HA GENERADO EL REPORTE CON EXITO","Monopoly",JOptionPane.INFORMATION_MESSAGE);
         }
         if(e.getSource() == interfaz.reportepdf3){
             reportepdf.reportePropiedadesVenta();
             JOptionPane.showMessageDialog(null,"SE HA GENERADO EL REPORTE CON EXITO","Monopoly",JOptionPane.INFORMATION_MESSAGE);
         }
    }   

    /**
     * @return the contadorpropiedades
     */
    public int[] getContadorpropiedades() {
        return contadorpropiedades;
    }

    /**
     * @param contadorpropiedades the contadorpropiedades to set
     */
    public void setContadorpropiedades(int[] contadorpropiedades) {
        this.contadorpropiedades = contadorpropiedades;
    }
    
 
}
//class hilo extends Thread{
//        @Override
//        public void run(){
//           int y = 20;
//           while (y<400){
//              try{
//              }catch(InterruptedException ex){
//                  Logger.getLogger(Monopoly.class.getName() null)
//              }
//           }
//        }
//    }