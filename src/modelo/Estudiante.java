/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_jose.escobar
 */
public class Estudiante extends Persona implements Comparable<Estudiante>{
    private String codigo;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String codigo, String carrera, String nombre, String telefono, String correo) {
        super(nombre, telefono, correo);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante { " +super.toString()+ ", codigo= " + codigo + ", carrera= " + carrera +" "+ '}';
    }

    @Override
    public int compareTo(Estudiante t) {
         
        
        
        
        return nombre.compareTo(t.getNombre()); 
    }
    
    
    
}
