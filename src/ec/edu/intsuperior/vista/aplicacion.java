/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
         Persona p1= new Cliente();
         
         p1.setNombre1(JOptionPane.showInputDialog("Ingrese el primer nombre "));
         p1.setNombre2(JOptionPane.showInputDialog("Ingrese el segundo nombre"));
         p1.setApellido1(JOptionPane.showInputDialog("Ingrese le primer apellido"));
         p1.setApellio2(JOptionPane.showInputDialog("Ingrese el segundo apellido"));
         p1.setCedula(JOptionPane.showInputDialog("Ingrese el numero de cedula"));
         p1.setTelefono(JOptionPane.showInputDialog("Ingrese el numero de contacto"));
         p1.setCorreo(JOptionPane.showInputDialog("Ingrese el correo"));
          Scanner teclado=new Scanner(System.in);
int fecha_actual;
int fecha_nacimiento;
int edad;
System.out.print("Digite la fecha altual:");
fecha_actual=teclado.nextInt();

System.out.println("Digite la fecha de nacimiento de la persona: ");
fecha_nacimiento=teclado.nextInt();

edad=fecha_actual-fecha_nacimiento;
System.out.println("La edad de la persona es: " + edad);

           
         
         JOptionPane.showInputDialog(null,p1.toString());
         
         Persona p2= new Empleado();
         p2.setNombre1(JOptionPane.showInputDialog("Ingrese el primer nombre del Empleado "));
         p2.setNombre2(JOptionPane.showInputDialog("Ingrese el segundo nombre del Empleado"));
         p2.setApellido1(JOptionPane.showInputDialog("Ingrese le primer apellido del Empleado"));
         p2.setApellio2(JOptionPane.showInputDialog("Ingese el segundo apellido de Empleado"));
         p2.setCedula(JOptionPane.showInputDialog("Ingese el numero de cedula del Empleado"));
         p2.setCorreo(JOptionPane.showInputDialog("Ingrese el correo del Empleado"));
         String nombre=JOptionPane.showInputDialog("Nombre del Empleado");
         String profecion=JOptionPane.showInputDialog("Tipo de Profecion");
         int dt=Integer.parseInt(JOptionPane.showInputDialog("Dias de trabajo"));
         double pd=Double.parseDouble(JOptionPane.showInputDialog("Pago por dia"));
         
         double ab=0;
         if (dt>30) {
             double tn=15*pd;
             
             double sx=(pd*15);
             ab=sx+tn;
            
        } else {
             ab=dt*pd;
        }
         
         JOptionPane.showMessageDialog(null, "Empleados: "+nombre+"\n" 
         +"profecion: "+profecion+"\n"
         +"dias de trabajo: "+dt+"\n"
         +"SueldoBruto: "+ab+"\n");
        
         JOptionPane.showInputDialog(null,p2.toString());
         
         Directivo d1=new Directivo();
         System.out.println("Ingrese el tipo de categoria del empleado");
         d1.setCategoria(Directivo.Categoria.CategoriaConserje);
         System.out.println("Ingrese ");
          
        
         
             
         
         
        
         
        
        
        
        
       
         
         
         
         
         
         
         
         
         
    }
}
