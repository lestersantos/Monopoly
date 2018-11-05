/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2_201504510;

import java.awt.Image;

/**
 *
 * @author Alejandro
 */
public class Cartas {
    private String tipo,titulo,color;       
    private int renta;
    private int precio;
    private int casa1;
    private int casa2;
    private int casa3;
    private int casa4;
    private int hotel;
    private int hipoteca;
    private int casacons;
    private int hotelcons;
    private int tren1,tren2,tren3,tren4;
    private Iconos icono;
    private boolean casillaactiva;
    private Cartas siguiente;
    private Cartas anterior;
    private int numero;
    private int numerocasilla;
/*
    tipo
    titulo
    color
    precio
    renta
    valor con 1 casa.
    valor con 2 casa.
    valor con 3 casa.
    valor con 4 casa.
    valor con hotel.
    valor hipoteca.
    valor construcción de casa.
    valor construcción de hotel.
    imagen de la carta.
    */
    //terrenos
    public Cartas(int numerocasilla,String tipo,String titulo, String color, int precio, int renta, int casa1, int casa2, int casa3, int casa4, int hotel, int hipoteca, int casacons, int hotelcons,Iconos icono,boolean casillaactiva) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.color = color;
        this.precio = precio;
        this.renta = renta;
        this.casa1 = casa1;
        this.casa2 = casa2;
        this.casa3 = casa3;
        this.casa4 = casa4;
        this.hotel = hotel;
        this.hipoteca = hipoteca;
        this.casacons = casacons;
        this.hotelcons = hotelcons;
        this.icono = icono;
        this.casillaactiva = casillaactiva;
        this.numerocasilla = numerocasilla;
    }
    //especiales, caja y suerte.
    public Cartas(int numerocasilla,String tipo,String titulo,Iconos icono,boolean casillaactiva) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.icono = icono;
        this.casillaactiva = casillaactiva;
        this.numerocasilla = numerocasilla;
    }
    //transporte
    public Cartas(int numerocasilla,String tipo,String titulo,int precio, int renta,int hipoteca,Iconos icono,boolean casillaactiva) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.precio = precio;
        this.renta = renta;
        this.hipoteca = hipoteca;
        this.icono = icono;
        this.casillaactiva = casillaactiva;
        this.numerocasilla = numerocasilla;
    }
     //servicio luz y agua.
    public Cartas(int numerocasilla,String tipo,String titulo,int precio,int hipoteca,Iconos icono, boolean casillaactiva) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.icono = icono;
        this.casillaactiva = casillaactiva;
        this.numerocasilla = numerocasilla;
    }
    //Cupones y caja
    public Cartas(int numero,String tipo,Iconos icono) {
        this.numero = numero;
        this.tipo = tipo;
        this.icono = icono;
        this.setSiguiente(this);
        this.setAnterior(this);
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the renta
     */
    public int getRenta() {
        return renta;
    }

    /**
     * @param renta the renta to set
     */
    public void setRenta(int renta) {
        this.renta = renta;
    }

    /**
     * @return the compra
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the compra to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the casa1
     */
    public int getCasa1() {
        return casa1;
    }

    /**
     * @param casa1 the casa1 to set
     */
    public void setCasa1(int casa1) {
        this.casa1 = casa1;
    }

    /**
     * @return the casa2
     */
    public int getCasa2() {
        return casa2;
    }

    /**
     * @param casa2 the casa2 to set
     */
    public void setCasa2(int casa2) {
        this.casa2 = casa2;
    }

    /**
     * @return the casa3
     */
    public int getCasa3() {
        return casa3;
    }

    /**
     * @param casa3 the casa3 to set
     */
    public void setCasa3(int casa3) {
        this.casa3 = casa3;
    }

    /**
     * @return the casa4
     */
    public int getCasa4() {
        return casa4;
    }

    /**
     * @param casa4 the casa4 to set
     */
    public void setCasa4(int casa4) {
        this.casa4 = casa4;
    }

    /**
     * @return the hotel
     */
    public int getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    /**
     * @return the hipoteca
     */
    public int getHipoteca() {
        return hipoteca;
    }

    /**
     * @param hipoteca the hipoteca to set
     */
    public void setHipoteca(int hipoteca) {
        this.hipoteca = hipoteca;
    }

    /**
     * @return the casacons
     */
    public int getCasacons() {
        return casacons;
    }

    /**
     * @param casacons the casacons to set
     */
    public void setCasacons(int casacons) {
        this.casacons = casacons;
    }

    /**
     * @return the hotelcons
     */
    public int getHotelcons() {
        return hotelcons;
    }

    /**
     * @param hotelcons the hotelcons to set
     */
    public void setHotelcons(int hotelcons) {
        this.hotelcons = hotelcons;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the icono
     */
    public Iconos getIcono() {
        return icono;
    }

    /**
     * @param icono the icono to set
     */
    public void setIcono(Iconos icono) {
        this.icono = icono;
    }

    /**
     * @return the casillaactiva
     */
    public boolean isCasillaactiva() {
        return casillaactiva;
    }

    /**
     * @param casillaactiva the casillaactiva to set
     */
    public void setCasillaactiva(boolean casillaactiva) {
        this.casillaactiva = casillaactiva;
    }

    /**
     * @return the siguiente
     */
    public Cartas getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Cartas siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Cartas getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Cartas anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the numerocasilla
     */
    public int getNumerocasilla() {
        return numerocasilla;
    }

    /**
     * @param numerocasilla the numerocasilla to set
     */
    public void setNumerocasilla(int numerocasilla) {
        this.numerocasilla = numerocasilla;
    }
    
    
}
