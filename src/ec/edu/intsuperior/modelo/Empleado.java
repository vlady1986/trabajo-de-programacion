/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dh
 */ 
public class Empleado extends Persona{
   double sueldobruto;

    public Empleado() {
    }

    public Empleado(double sueldobruto, String Cedula, String nombre1, String nombre2, String apellido1, String apellio2, String telefono, String correo, int edad) {
        super(Cedula, nombre1, nombre2, apellido1, apellio2, telefono, correo, edad);
        this.sueldobruto = sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    public double getSueldobruto() {
        return sueldobruto;
    }
   
   

    @Override
    public String toString() {
        return super.toString()+" \n"
                +"SueldoBruto"+getSueldobruto(); //To change body of generated methods, choose Tools | Templates.
    }

   
   

}
