/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelado;

/**
 *
 * @author karen
 */
public class Autores_md {
    private String id_autor;
    private String nombre; 
    private String telefono;
    
    public Autores_md(String id_autor, String nombre, String telefono){
        this.id_autor=id_autor;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public String getId_autor() {
        return id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + telefono;
    }
}
