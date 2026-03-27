/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelado;
import Modelado.Autores_md;
/**
 *
 * @author karen
 */
public class Libros_md {
    private String id_libro;
    private String nombre;
    private String año_publi;
    protected Autores_md autor;
    
    public Libros_md(String id_libro,String nombre, String año_publi ,Autores_md autor){
        this.id_libro=id_libro;
        this.nombre=nombre;
        this.año_publi=año_publi;
        this.autor=autor;
    }

    public String getId_libro() {
        return id_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAño_publi() {
        return año_publi;
    }

    public Autores_md getAutor() {
        return autor;
    }
     @Override
    public String toString() {
        return id_libro + " | " + nombre + " | " + año_publi + " | " +autor.getNombre();
    }
}
