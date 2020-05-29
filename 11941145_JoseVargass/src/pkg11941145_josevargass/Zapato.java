/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11941145_josevargass;

import java.awt.Color;

/**
 *
 * @author josevargas
 */
public class Zapato extends Objetos{
    protected double talla;
    protected String descripcion_suela;
    protected int comodidad;

    public Zapato() {
    }

    public Zapato(double talla, String descripcion_suela, int comodidad, Color color, String descripcion, String marca, int tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.talla = talla;
        this.descripcion_suela = descripcion_suela;
        this.comodidad = comodidad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDescripcion_suela() {
        return descripcion_suela;
    }

    public void setDescripcion_suela(String descripcion_suela) {
        this.descripcion_suela = descripcion_suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapato{" + "talla=" + talla + ", descripcion_suela=" + descripcion_suela + ", comodidad=" + comodidad + '}';
    }
    
    
}
