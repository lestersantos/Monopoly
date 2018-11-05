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
public class ListaJugadores {
    private Jugador cabeza;

    public ListaJugadores() {
        cabeza = null;
    }
    public void addJugador(int numerojugador,String nombre,Fichas ficha, int dinero, String estado,boolean turno,int casillaactual){
        Jugador nuevo = new Jugador(numerojugador,nombre, ficha, dinero, estado, turno, casillaactual);
        if(this.getCabeza() != null){
            Jugador temp = this.getCabeza();
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
        }else{
        this.setCabeza(nuevo);
        }   
    }
    public Jugador buscarJugador(int numerojugador){
        Jugador actual;
        for(actual = this.getCabeza();actual !=  null; actual = actual.getSiguiente()){
            if(actual.getNumerojugador() == numerojugador){
                return actual;
            }
        }
        return null;
    }

    /**
     * @return the cabeza
     */
    public Jugador getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Jugador cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
