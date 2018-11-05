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
public class Banco2 {
Jugador banco;
    public Banco2() {
    banco = new Jugador("Banco",3330000);
    }
    
    public void cargarDinero(Jugador jugador){
        if(jugador != null){
            jugador.setDinero(150000);
            banco.setDinero(banco.getDinero()-jugador.getDinero());
        }
    }
    
}
