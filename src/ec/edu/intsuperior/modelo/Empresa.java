/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.HashSet;

/**
 *
 * @author dh
 */
public class Empresa{
    private String nombre;
    private String direccion;
    private String telfono;
    private String rut;
    private String contacto;
    private String correo;
    private String pais;
    private String region;
    
    HashSet<Cliente>cliente=new HashSet<Cliente>();
    HashSet<Empleado>empleado=new HashSet<Empleado>();

    
    public Empresa(){
        
    }

    public Empresa(String nombre, String direccion, String telfono, String rut, String contacto, String correo, String pais, String region) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telfono = telfono;
        this.rut = rut;
        this.contacto = contacto;
        this.correo = correo;
        this.pais = pais;
        this.region = region;    
    }

    public void setCliente(HashSet<Cliente> cliente) {
        this.cliente = cliente;
    }

    public void MostrarClientes(){
    System.out.println("\t\tLista de Clientes");
    System.out.println(cliente.toString());
}

    public void setEmpleado(HashSet<Empleado> empleado) {
        this.empleado = empleado;
    }
    public void MostrarEmpleados(){
        System.out.println("\t\tLista de Empleados");
    System.out.println(cliente.toString());
    }
    

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public HashSet<Cliente> getCliente() {
        return cliente;
    }

    public HashSet<Empleado> getEmpleado() {
        return empleado;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelfono() {
        return telfono;
    }

    public String getRut() {
        return rut;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "los datos de la empresa son:\n"
                +"Cliente"+getCliente()+"\n"
                +"Empleado"+getEmpleado()+"\n"
                +"Nombre: "+getNombre()+"\n"
                +"Direccion: "+getDireccion()+"\n"
                +"Telefono: "+getTelfono()+"\n"
                +"Rut: "+getRut()+"\n"
                +"Contacto: "+getContacto()+"\n"
                +"Correo: "+getCorreo()+"\n"
                +"Pais: "+getPais()+"\n"
                +"Region: "+getRegion()+"\n";
        
    }
        
    
    
   
}
