/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11941145_josevargass;

import java.util.Date;

/**
 *
 * @author josevargas
 */
public class Personal_General extends Persona{
    
    protected String ocupacion;
    protected String horario;
    protected Date tiempo_trabajo;
    protected int sueldo;

    public Personal_General() {
    }

    public Personal_General(String ocupacion, String horario, Date tiempo_trabajo, int sueldo, int id, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo_trabajo = tiempo_trabajo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setEducacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getTiempo_trabajo() {
        return tiempo_trabajo;
    }

    public void setTiempo_trabajo(Date tiempo_trabajo) {
        this.tiempo_trabajo = tiempo_trabajo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
