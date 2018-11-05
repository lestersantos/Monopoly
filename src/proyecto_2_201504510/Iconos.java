/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class Iconos {
    private Image imagen;
    private JLabel labelcarta;
    private ImageIcon imagenicono;
    public Iconos(String imageurl) {
        ImageIcon icono1 = new ImageIcon(getClass().getResource(imageurl));
        Image img1 = icono1.getImage();
        imagen= img1.getScaledInstance(1500, -1, java.awt.Image.SCALE_DEFAULT);
        imagenicono = new ImageIcon(getImagen());
        labelcarta = new JLabel();
        labelcarta.setIcon(imagenicono);
       
    }

    /**
     * @return the imagen
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the labelcarta
     */
    public JLabel getLabelcarta() {
        return labelcarta;
    }

    /**
     * @param labelcarta the labelcarta to set
     */
    public void setLabelcarta(JLabel labelcarta) {
        this.labelcarta = labelcarta;
    }

    /**
     * @return the imagenicono
     */
    public ImageIcon getImagenicono() {
        return imagenicono;
    }

    /**
     * @param imagenicono the imagenicono to set
     */
    public void setImagenicono(ImageIcon imagenicono) {
        this.imagenicono = imagenicono;
    }
}
