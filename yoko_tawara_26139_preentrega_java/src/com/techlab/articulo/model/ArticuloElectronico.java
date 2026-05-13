package com.techlab.articulo.model;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase debe heredar de Articulo.
 *
 * Representa un artículo electrónico.
 *
 * ATRIBUTO ESPECÍFICO
 * ------------------------------------------------------------
 * - garantiaMeses : int
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
 * - si la garantía supera 12 meses, aplicar un recargo
 * - si no, dejar el precio igual
 *
 * Lo importante no es la regla comercial exacta,
 * sino mostrar que cada subtipo implementa el cálculo de manera distinta.
 */
public class ArticuloElectronico extends Articulo {

    private int garantiaMeses;

    
    // Crear constructor.
    public ArticuloElectronico(int codigo, String nombre, double precio, Categoria categoria,  int garantiaMeses){
        super(codigo, nombre, precio, categoria);
        this.garantiaMeses = garantiaMeses;
    }

    // Crear getters
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    //  setters.
    public void setGarantiaMeses(int meses){
        this.garantiaMeses = meses ;
    }

    @Override
    public String getTipoArticulo() {
        // TODO:
        return "";
    }

    @Override
    public String getDetalleEspecifico(){
        //TODO
        return "";
    }

    @Override
    public double calcularPrecioFinal() {
        
        // Implementar lógica propia del artículo electrónico.
        if (garantiaMeses > 12) {
            return precio * 1.15;
        }
        else {
            return precio;
        }
    }


}
