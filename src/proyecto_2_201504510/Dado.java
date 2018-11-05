/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.util.Random;

/**
 *
 * @author Alejandro
 */
public class Dado {
    private int valordado;
    
    public Dado() {
    Random rdm = new Random();
    valordado = rdm.nextInt(6)+1;
    }

    /**
     * @return the valordado
     */
    public int getValordado() {
        return valordado;
    }

    /**
     * @param valordado the valordado to set
     */
    public void setValordado(int valordado) {
        this.valordado = valordado;
    }
    
}
