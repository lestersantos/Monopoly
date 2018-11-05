/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import javax.swing.JFrame;
//import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Alejandro
 */
public class Proyecto_2_201504510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
        //SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
       // SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin"); //des 2018
        //SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceTintTheme");// 2018
        //Interfaz ventana = new Interfaz();
        Monopoly monopoly = new Monopoly();
        
    }
    
}
