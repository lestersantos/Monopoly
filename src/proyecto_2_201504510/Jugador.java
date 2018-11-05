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
public class Jugador {

    private Fichas ficha;
    private int dinero,casillaactual;
    private String estado,nombre;
    private boolean turno;
    private Jugador siguiente;
    private Jugador anterior;
    private int numerojugador;
    
    public Jugador(int numerojugador,String nombre,Fichas ficha, int dinero, String estado,boolean turno,int casillaactual) {
        this.ficha = ficha;
        this.dinero = dinero;
        this.estado = estado;
        this.nombre=nombre;
        this.turno = turno;
        this.casillaactual = casillaactual;
        this.numerojugador = numerojugador;
        this.setSiguiente(null);
        this.setAnterior(null);
        
    }
    public Jugador(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }

    /**
     * @return the ficha
     */
    public Fichas getFicha() {
        return ficha;
    }

    /**
     * @param ficha the ficha to set
     */
    public void setFicha(Fichas ficha) {
        this.ficha = ficha;
    }

    /**
     * @return the dinero
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the turno
     */
    public boolean isTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    /**
     * @return the casillaactual
     */
    public int getCasillaactual() {
        return casillaactual;
    }

    /**
     * @param casillaactual the casillaactual to set
     */
    public void setCasillaactual(int casillaactual) {
        this.casillaactual = casillaactual;
    }

    /**
     * @return the siguiente
     */
    public Jugador getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Jugador getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Jugador anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the numerojugador
     */
    public int getNumerojugador() {
        return numerojugador;
    }

    /**
     * @param numerojugador the numerojugador to set
     */
    public void setNumerojugador(int numerojugador) {
        this.numerojugador = numerojugador;
    }

}
