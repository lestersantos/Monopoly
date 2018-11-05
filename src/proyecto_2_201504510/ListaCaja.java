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
public class ListaCaja {
     private Cartas cabeza;
    
    public ListaCaja() {
        cabeza = null;
    }

    public void agregarCaja(int numero, String tipo,Iconos icono){
        Cartas nuevo = new Cartas(numero,tipo, icono);
        if(this.getCabeza() != null){
            nuevo.setSiguiente(this.getCabeza().getSiguiente());
            this.getCabeza().getSiguiente().setAnterior(nuevo);
            this.getCabeza().setSiguiente(nuevo);
            nuevo.setAnterior(this.getCabeza());
        }
            this.setCabeza(nuevo);
    }
    public void mostrarCaja(){
        Cartas actual;
        for(actual = this.getCabeza(); actual != null; actual = actual.getSiguiente()){
            System.out.println("No."+actual.getNumero()+"Tipo: "+actual.getTipo());
    }
    }
    /**
     * @return the cabeza
     */
    public Cartas getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Cartas cabeza) {
        this.cabeza = cabeza;
    }
}
