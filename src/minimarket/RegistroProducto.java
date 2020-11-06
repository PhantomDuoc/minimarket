/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bizza
 */
public class RegistroProducto {

    //atributos
    private List<Producto> listaProductos;
    Scanner teclado = new Scanner(System.in);

    //constructor de la arrayList
    public RegistroProducto() {
        listaProductos = new ArrayList<>();
    }

//customer
    public boolean agregarProducto(Producto prodNew) {
        return listaProductos.add(prodNew);
    }

    public boolean validarProducto(int codigo) {
        for (Producto prod : listaProductos) {
            if (prod.getCodigo() == codigo) {
                return true; //si encuentra el producto retorna true
            }
        }
        return false;//no encuentra el producto retorna false
    }

    public void listarProductos() {
        for (Producto prod : listaProductos) {
            System.out.println(prod.toString());//polimorfismo
        }
    }

//    public void mostrarBoleta() {
//        for (Producto prod : listaProductos) {
//            System.out.println(prod.getDescripcion() + " $" + prod.getPrecio());
//        }
//    }
    public void mostrarBoleta() {
        int totalBoleta = 0, cantidad = 0, totalProducto = 0, totalFinalProducto = 0;
        System.out.println("--------------------");
        for (Producto prod : listaProductos) {
            System.out.println(prod.getDescripcion() + " :");
            cantidad = teclado.nextInt();
            totalProducto = prod.calcularTotal(cantidad);
            totalFinalProducto = prod.calcularTotalFinal(totalProducto, cantidad);
            totalBoleta += totalFinalProducto;
            System.out.println(cantidad + " " + prod.getDescripcion() + " $" + totalFinalProducto);
        }
        System.out.println("--------------------");
        System.out.println("A Pagar: $" + totalBoleta);

        //rebajar stock
    }

}
