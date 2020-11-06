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
public class Limpieza extends Producto {

    //atributos
    private String tipoUso;

    //constructores
    public Limpieza() {
    }

    public Limpieza(String tipoUso, int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
        this.tipoUso = tipoUso;
    }

    //getter y setter
    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    @Override
    public String toString() {
        return super.toString() + " Limpieza{" + "tipoUso=" + tipoUso + '}';
    }

}
