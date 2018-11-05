/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

/**
 *
 * @author Alejandro
 */
public class Reportes {
    
    Monopoly datos;
    int[] contadorPropiedades;
    
    public Reportes(Monopoly datos) {
        this.datos = datos;
        //contadorPropiedades = datos.ordenarPropiedades();
    }
    
    public void Reporte3() {

        try {

            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reportes.html"); //permite abrir el archivo que se le indica
            archivo.write("<html> \n".getBytes());
            archivo.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<title>REPORTES PROYECTO MONOPOLY</title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body bgcolor = CornflowerBlue >\n".getBytes());

            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>REPORTE No.3<br><br></h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("<h3>REPORTE DE LAS PROPIEDADES QUE EL BANCO DE MONOPOLY POSEE<br><br><br><br><br></h3>\n".getBytes());

            archivo.write("<h3>TERRENOS A LA VENTA:<br><br></h3>\n".getBytes());

            int i;
            for (i = 0; i < datos.terrenos.length; i++) {
                if (datos.listaterrenos.buscarPropiedad(i + 1).isVendida() == false) {
                    archivo.write(("<br>" + datos.listaterrenos.buscarPropiedad(i + 1).getNumeropropiedad() + ")" + datos.listaterrenos.buscarPropiedad(i + 1).getCarta().getTitulo() + "<br>").getBytes());
                    archivo.write(("Estado: " + "en venta" + "<br>").getBytes());
                    archivo.write(("Dueño: " + datos.listaterrenos.buscarPropiedad(i + 1).getDueño().getNombre() + "<br>").getBytes());
                }
            }

            archivo.write("<h3>EMPRESAS DE TRANSPORTE A LA VENTA:<br><br></h3>\n".getBytes());

            int k;
            for (k = 0; k < datos.transporte.length; k++) {
                if (datos.listatransportes.buscarPropiedad(k + 1).isVendida() == false) {
                    archivo.write(("<br>" + datos.listatransportes.buscarPropiedad(k + 1).getNumeropropiedad() + ")" + datos.listatransportes.buscarPropiedad(k + 1).getCarta().getTitulo() + "<br>").getBytes());
                    archivo.write(("Estado: " + "en venta" + "<br>").getBytes());
                    archivo.write(("Dueño: " + datos.listatransportes.buscarPropiedad(k + 1).getDueño().getNombre() + "<br>").getBytes());
                }
            }

            archivo.write("<h3>EMPRESAS DE SERVICIO A LA VENTA:<br><br></h3>\n".getBytes());
            int j;
            for (j = 0; j < datos.servicio.length; j++) {
                if (datos.listaservicios.buscarPropiedad(j + 1).isVendida() == false) {

                    archivo.write(("<br>" + datos.listaservicios.buscarPropiedad(j + 1).getNumeropropiedad() + ")" + datos.listaservicios.buscarPropiedad(j + 1).getCarta().getTitulo() + "<br>").getBytes());
                    archivo.write(("Estado: " + "en venta" + "<br>").getBytes());
                    archivo.write(("Dueño: " + datos.listaservicios.buscarPropiedad(j + 1).getDueño().getNombre() + "<br>").getBytes());
                }
            }

            archivo.write("<center>\n".getBytes());
            archivo.write(("</br>" + "</br>" + "</br>" + "</br>" + "LESTER EFRAIN AJUCUM SANTOS 201504510").getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reportes.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
    public void manualDeUsuario() {

        try {

            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reportes.html"); //permite abrir el archivo que se le indica
            archivo.write("<html> \n".getBytes());
            archivo.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<title>MANUAL DE USUARIO MONOPOLY VIRTUAL</title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body bgcolor = CornflowerBlue >\n".getBytes());
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>MANUAL DE USUARIO MONOPOLY VIRTUAL<br><br></h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write(" El objetivo del juego es completar 3 grupos de propiedad. ¿Qué son grupos de propiedad? Son propiedades que tienen el mismo color,<br> en cada una de las cuales se indica cuántas son necesarias para completar el grupo.<br> Obviamente cuantas menos cartas se necesiten para completar el grupo, más cotizada serán dichas cartas, ya que más fácilmente se completa<br><br>\n".getBytes());
            archivo.write("Marca: Hasbro<br><br>\n".getBytes());
            archivo.write("<br><br>\n".getBytes());
            archivo.write("MANUAL DE USUARIO MONOPOLY VIRTUAL<br><br>\n".getBytes());

            archivo.write("<center>\n".getBytes());
            archivo.write(("</br>" + "</br>" + "</br>" + "</br>" + "LESTER EFRAIN AJUCUM SANTOS 201504510").getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reportes.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
    public void ReporteDinero() {

        try {

            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reportes.html"); //permite abrir el archivo que se le indica
            archivo.write("<html> \n".getBytes());
            archivo.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<title>REPORTES PROYECTO MONOPOLY</title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body bgcolor = CornflowerBlue >\n".getBytes());

            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>REPORTE No.2<br><br></h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("<h3>REPORTE DEL DINERO DE CADA JUGADOR<br><br><br><br><br></h3>\n".getBytes());

            archivo.write(("DINERO EN EL BANCO:" + " " + datos.banco2.banco.getDinero()).getBytes());
            archivo.write(("<br>").getBytes());
            Jugador actual;
            if (datos.listajugadores.getCabeza() != null) {
                int i = 0;
                for (actual = datos.listajugadores.getCabeza(); actual != null; actual = actual.getSiguiente()) {

                    System.out.println("Nombre jugador:" + " " + actual.getNombre() + "DINERO:" + " " + actual.getDinero());
                    archivo.write(("<br>" + "Nombre jugador:" + " " + actual.getNombre() + "<br>").getBytes());
                    archivo.write(("DINERO:" + " " + actual.getDinero() + "<br>").getBytes());

                }
            } else {
                archivo.write(("Los jugadores no han sido creados").getBytes());
                System.out.println("Los jugadores no han sido creados.");
            }
            archivo.write("<center>\n".getBytes());
            archivo.write(("</br>" + "</br>" + "</br>" + "</br>" + "LESTER EFRAIN AJUCUM SANTOS 201504510").getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reportes.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
    //reporte pendiente
    public void ReportePropiedadesJugador() {

        try {

            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reportes.html"); //permite abrir el archivo que se le indica
            archivo.write("<html> \n".getBytes());
            archivo.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<title>REPORTES PROYECTO MONOPOLY</title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body bgcolor = CornflowerBlue >\n".getBytes());

            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>REPORTE No.1<br><br></h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("<h3>REPORTE DE LAS PROPIEDADES DE CADA JUGADOR<br><br><br></h3>\n".getBytes());

            Jugador actual;
            
            if (datos.listajugadores.getCabeza() != null) {
                int i=0;
                for (actual = datos.listajugadores.getCabeza(); actual != null; actual = actual.getSiguiente()) {

                    System.out.println("Nombre jugador:" + " " + actual.getNombre() + "\n" + "Propiedades: " + " " + contadorPropiedades[i]);
                    archivo.write(("<br>" + "Nombre jugador:" + " " + actual.getNombre() + "<br>").getBytes());
                    archivo.write(("Propiedades:" + " " +contadorPropiedades[i] + "<br>").getBytes());
                    i++;
                }
            } else {
                archivo.write(("Los jugadores no han sido creados").getBytes());
                System.out.println("Los jugadores no han sido creados.");
            }
            archivo.write("<center>\n".getBytes());
            archivo.write(("</br>" + "</br>" + "</br>" + "</br>" + "LESTER EFRAIN AJUCUM SANTOS 201504510").getBytes());
            archivo.write("</center>\n".getBytes());

            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reportes.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
