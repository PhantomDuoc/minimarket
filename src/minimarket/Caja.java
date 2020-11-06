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
public interface Caja {


    //constantes y metodos abstractos
    /*public static final*/ double IVA = 0.19;
    double DESCUENTO_LIQUIDO = 0.1;

    int calcularTotal(int cantidad);

    int descontar(int total);

    int calcularTotalFinal(int total, int cantidad);
}
