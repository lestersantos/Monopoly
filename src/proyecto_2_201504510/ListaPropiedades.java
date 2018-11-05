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
public class ListaPropiedades {
    private Propiedades cabeza;
    
    public ListaPropiedades() {
        cabeza = null;
    }
    
    public void addPropiedad(int numeropropiedad,Jugador dueño,Cartas carta,boolean vendida){
        Propiedades nuevo = new Propiedades(numeropropiedad,dueño, carta, vendida);
        if(this.getCabeza() == null){
            this.setCabeza(nuevo);
        }else{
            Propiedades temp = this.getCabeza();
            while(temp.getSiguiente() !=null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);       
        }
    }
    public Propiedades buscarPropiedad(int indice) {
        Propiedades actual;
        for (actual = this.getCabeza(); actual != null; actual = actual.getSiguiente()) {
            if (actual.getNumeropropiedad() == indice) {
                return actual;
            }
        }
        return null;
    }
    
    public void mostrarPropiedades(){
        Propiedades actual;
        for(actual = this.getCabeza(); actual != null; actual = actual.getSiguiente()){
            System.out.println("No.propiedad"+actual.getCarta().getNumerocasilla()+"tipo"+actual.getCarta().getTipo());
        }
    }

    /**
     * @return the cabeza
     */
    public Propiedades getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Propiedades cabeza) {
        this.cabeza = cabeza;
    }
    
}
