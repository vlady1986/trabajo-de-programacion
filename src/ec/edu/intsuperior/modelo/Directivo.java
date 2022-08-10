/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


/**
 *
 * @author dh
 */
public class Directivo {
    
    private Empleado empleado;

    public enum Categoria{CategoriaConserje, CategoriaMantenimiento, CategoriaDirectorEjecutivo, CategoriaDirectorComercial,CategoriaDirectordeOperciones,CategoriaDirectordeMarketing,CategoriaDirectordeRecursosHumanos}
    private Categoria categoria;

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "las categorias son :\n"
                +"Empleado"+getEmpleado()+"\n"
                +"Categoria"+getCategoria()+"\n";
         
                }
    
    
    
}
