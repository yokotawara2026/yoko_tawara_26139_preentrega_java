package com.techlab.articulo.model;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase debe heredar de Articulo.
 *
 * Representa un artículo alimenticio.
 *
 * ATRIBUTO ESPECÍFICO
 * ------------------------------------------------------------
 * - diasParaVencimiento : int
 *
 * ESTA CLASE DEBE
 * ------------------------------------------------------------
 * [x] tener constructor
 * [x] tener getters y setters
 * - sobrescribir getTipoArticulo()
 * [x] sobrescribir calcularPrecioFinal()
 *
 * IDEA DIDÁCTICA PARA calcularPrecioFinal()
 * ------------------------------------------------------------
 * Podés definir una regla propia, por ejemplo:
 * - si faltan pocos días para vencer, aplicar descuento
 * - si no, mantener el precio
 */
public class ArticuloAlimenticio extends Articulo {

    private int diasParaVencimiento;

    // Crear constructor.
    public ArticuloAlimenticio(int codigo, String nombre, double precio, Categoria categoria,  int diasParaVencimiento){
        super(codigo, nombre, precio, categoria);
        this.diasParaVencimiento = diasParaVencimiento;
    }

    // Crear getters 
    public int getDiasParaVencimiento() {
        return diasParaVencimiento;
    }

    //  setters.
    public void setDiasParaVencimiento(int dias){
        this.diasParaVencimiento = dias ;
    }


    @Override
    public String getTipoArticulo() {
        return categoria.getNombre();
    }

    @Override
    public String getDetalleEspecifico(){
        //TODO
        return "";
    }
    

    @Override
    public double calcularPrecioFinal() {
        // TODO:
        // Implementar lógica propia del artículo alimenticio.
        if (diasParaVencimiento<=5) {
            return precio * 0.75;
        }
        else {
            return precio;
        }
    }



}
