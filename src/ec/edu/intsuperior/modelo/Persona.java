/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;


/**
 *
 * @author dh
 */
public class Persona {
    private String Cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellio2;
    private String telefono;
    private String correo;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String Cedula, String nombre1, String nombre2, String apellido1, String apellio2, String telefono, String correo, int edad) {
        this.Cedula = Cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellio2 = apellio2;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellio2(String apellio2) {
        this.apellio2 = apellio2;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellio2() {
        return apellio2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "los datos de la persona son:\n"
                +"Cedula: "+getCedula()+"\n"
                + "Nombre1: "+getNombre1()+"\n"
                +"Nombre2: "+getNombre2()+"\n"
                +"Apellido1: "+getApellido1()+"\n"
                +"Apellido2: "+getApellio2()+"\n"
                +"Telefono: "+getTelefono()+"\n"
                +"Correo: "+getCorreo()+"\n"
                +"Edad: "+getEdad()+"\n";
                
                }
  
        
    }
