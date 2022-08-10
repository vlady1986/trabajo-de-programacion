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
public class Cliente extends Persona {
    String telefonodecontacto;

    public Cliente() {
    }

    public Cliente(String telefonodecontacto, String Cedula, String nombre1, String nombre2, String apellido1, String apellio2, String telefono, String correo, int edad) {
        super(Cedula, nombre1, nombre2, apellido1, apellio2, telefono, correo, edad);
        this.telefonodecontacto = telefonodecontacto;
    }

    

    public void setTelefonodecontacto(String telefonodecontacto) {
        this.telefonodecontacto = telefonodecontacto;
    }

    public String getTelefonodecontacto() {
        return telefonodecontacto;
    }

    @Override
    public String toString() {
        return super.toString()+" \n"
                +"TelefonodeContacto: "+getTelefonodecontacto(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
