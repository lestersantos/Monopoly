/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Alejandro
 */
public class Fichas {
   private Panel fichapanel;
           //,ficha2,ficha3,ficha4;
   private Image image;
           //,image2,image3,image4;

    public Fichas(String imageurl) {
        ImageIcon icono1 = new ImageIcon(getClass().getResource(imageurl));
        Image img1 = icono1.getImage();
        image = img1.getScaledInstance(1500, -1, java.awt.Image.SCALE_DEFAULT);
        fichapanel = new Panel(getImage());
        /*//-------------------------------
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/images/ficha2.png"));
        Image img2 = icono2.getImage();
        image1 = img2.getScaledInstance(1500, -1, java.awt.Image.SCALE_DEFAULT);
        ficha1 = new Panel(image1);
        //---------------------------------------------
        ImageIcon icono3 = new ImageIcon(getClass().getResource("/images/ficha3.png"));
        Image img3 = icono3.getImage();
        image1 = img3.getScaledInstance(1500, -1, java.awt.Image.SCALE_DEFAULT);
        ficha1 = new Panel(image1);
        //----------------------------------
        ImageIcon icono4 = new ImageIcon(getClass().getResource("/images/ficha4.png"));
        Image img4 = icono4.getImage();
        image1 = img4.getScaledInstance(1500, -1, java.awt.Image.SCALE_DEFAULT);
        ficha1 = new Panel(image1);*/
    }

    /**
     * @return the ficha1
     */
    public Panel getFichaPanel() {
        return fichapanel;
    }

    /**
     * @param fichapanel the ficha1 to set
     */
    public void setFicha1(Panel fichapanel) {
        this.fichapanel = fichapanel;
    }

    /**
     * @return the image1
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image1 to set
     */
    public void setImage1(Image image) {
        this.image = image;
    }
   
   
}
