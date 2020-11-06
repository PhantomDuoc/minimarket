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
public final class LacteoCecina extends Producto {

    private int temperatura;

    public LacteoCecina() {
    }

    public LacteoCecina(int temperatura, int codigo, String descripcion, int precio, int stock) {
        super(codigo, descripcion, precio, stock);
        this.temperatura = temperatura;
    }

    //getter y setter
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " LacteoCecina{" + "temperatura=" + temperatura + '}';
    }

}
