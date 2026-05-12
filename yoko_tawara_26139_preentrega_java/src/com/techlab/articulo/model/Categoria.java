package com.techlab.articulo.model;

import com.techlab.articulo.interfaces.Identificable;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase representa una categoría del sistema.
 *
 * Se utilizará como atributo dentro de Articulo.
 *
 * ATRIBUTOS OBLIGATORIOS
 * ------------------------------------------------------------
 * - codigo : int
 * - nombre : String
 * - descripcion : String
 *
 * ESTA CLASE DEBE
 * ------------------------------------------------------------
 * - implementar Identificable
 * [x] tener constructor
 * [x] tener getters y setters
 * [x] tener toString()
 *
 * IMPORTANTE
 * ------------------------------------------------------------
 * Luego esta clase tendrá su propio CRUD desde MenuCategorias.
 */
public class Categoria implements Identificable {

    private int codigo;
    private String nombre;
    private String descripcion;


    // Crear constructor.
    public Categoria(int codigo, String nombre, String descripcion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public int getCodigo() {
        // TODO:
        return 0;
    }

    // Crear getters 
    public String getnombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    // setters restantes.
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }


    @Override
    public String toString() {
        // TODO:
        return "Categoria {" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    
}
