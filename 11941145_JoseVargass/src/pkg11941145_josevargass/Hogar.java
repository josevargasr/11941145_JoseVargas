/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11941145_josevargass;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author josevargas
 */
public class Hogar extends Objetos{
    
    private String descripcion_casa;
    private String instrucciones;
    private Date garantia;

    public Hogar() {
    }

    public Hogar(String descripcion_casa, String instrucciones, Date garantia, Color color, String descripcion, String marca, int tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.descripcion_casa = descripcion_casa;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcion_casa() {
        return descripcion_casa;
    }

    public void setDescripcion_casa(String descripcion_casa) {
        this.descripcion_casa = descripcion_casa;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Hogar{" + "descripcion_casa=" + descripcion_casa + ", instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }
    
    
}
