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
public class Propiedades {
    private Jugador dueño;
    private Cartas carta;
    private boolean vendida;
    private Propiedades siguiente;
    private Propiedades anterior;
    private int numeropropiedad;
   
    /**
     *
     * @param numeropropiedad
     * @param dueño
     * @param carta
     * @param vendida
     */
    public Propiedades(int numeropropiedad,Jugador dueño,Cartas carta,boolean vendida) {
        this.dueño = dueño;
        this.carta = carta;
        this.vendida = vendida;
        this.numeropropiedad = numeropropiedad;
        this.setSiguiente(null);
        this.setAnterior(null);
        
    } 

   
    //cartas y casillas que no se venden.

    /**
     *
     * @param dueño
     * @param carta
     */
        public Propiedades(Jugador dueño,Cartas carta) {
        this.dueño = dueño;
        this.carta = carta;
        this.setSiguiente(null);
        this.setAnterior(null);
        
    }
    /**
     * @return the dueño
     */
    public Jugador getDueño() {
        return dueño;
    }

    /**
     * @param dueño the dueño to set
     */
    public void setDueño(Jugador dueño) {
        this.dueño = dueño;
    }

    /**
     * @return the carta
     */
    public Cartas getCarta() {
        return carta;
    }

    /**
     * @param carta the carta to set
     */
    public void setCarta(Cartas carta) {
        this.carta = carta;
    }

    /**
     * @return the vendida
     */
    public boolean isVendida() {
        return vendida;
    }

    /**
     * @param vendida the vendida to set
     */
    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }

    /**
     * @return the siguiente
     */
    public Propiedades getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Propiedades siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Propiedades getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Propiedades anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the numeropropiedad
     */
    public int getNumeropropiedad() {
        return numeropropiedad;
    }

    /**
     * @param numeropropiedad the numeropropiedad to set
     */
    public void setNumeropropiedad(int numeropropiedad) {
        this.numeropropiedad = numeropropiedad;
    }
    
}
