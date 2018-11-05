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
public class Banco extends Jugador {
    private String nombre;
    private int dinero;
    Jugador jugador;
    Banco banco;
    
    
    public Banco(int numerojugador,String nombre, Fichas ficha, int dinero, String estado,boolean turno,int casillaactual) {
        super(numerojugador,nombre, ficha, dinero, estado,turno,casillaactual);
    }
    
    public Banco(String nombre,int dinero){
        super(nombre,dinero);
    }

    
}
