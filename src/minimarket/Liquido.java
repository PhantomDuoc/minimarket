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
public class Liquido extends Producto {

    //atributos
    private double gradosAlcoholicos;

    //constructores
    public Liquido() {
    }

    public Liquido(double gradosAlcoholicos, int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    //getter y setter
    public double getGradosAlcoholicos() {
        return gradosAlcoholicos;
    }

    public void setGradosAlcoholicos(double gradosAlcoholicos) {
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    //sobreescritura
    @Override
    public String toString() {
        return super.toString() + " Liquido{" + "gradosAlcoholicos=" + gradosAlcoholicos + '}';
    }

    @Override
    public int descontar(int total) {
        return (int) (total * (Caja.DESCUENTO_LIQUIDO));
    }

}
