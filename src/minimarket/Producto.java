/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

/**
 *
 * @author Bizza
 */
public abstract class Producto implements Caja {

    protected int codigo;
    protected String descripcion; //nombre del producto
    protected int precio;
    protected int stock;

    //constructor
    //sobrecarga metodo constructor
    public Producto() {
    }

    public Producto(int codigo, String descripcion, int precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    //getter y setter
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //customer
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + "}";
    }

    @Override
    public int calcularTotal(int cantidad) {
        return this.precio * cantidad;
    }

    @Override
    public int descontar(int total) {
        return 0;
    }

    @Override
    public int calcularTotalFinal(int total, int cantidad) {
        int totalIva = 0, totalFinal = 0;
        totalIva = (int) (total * Caja.IVA);
        totalFinal = this.calcularTotal(cantidad) + totalIva - descontar(total);
        return totalFinal;
    }
}
