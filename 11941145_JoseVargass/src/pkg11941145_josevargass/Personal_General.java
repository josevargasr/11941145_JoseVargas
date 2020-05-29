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
    
    protected String educacion;
    protected Date horario;
    protected Date tiempo_trabajo;
    protected int sueldo;

    public Personal_General() {
    }

    public Personal_General(String educacion, Date horario, Date tiempo_trabajo, int sueldo, int id, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(id, nombre, edad, sexo, estado, altura, peso);
        this.educacion = educacion;
        this.horario = horario;
        this.tiempo_trabajo = tiempo_trabajo;
        this.sueldo = sueldo;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
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
        return "Personal_General{" + "educacion=" + educacion + ", horario=" + horario + ", tiempo_trabajo=" + tiempo_trabajo + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
