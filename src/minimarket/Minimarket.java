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
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear productos
        Liquido cocacola = new Liquido(0, 1, "Coca Cola", 1000, 1000);
        Liquido fanta = new Liquido(0, 2, "Fanta", 1200, 800);
        Limpieza cloro = new Limpieza("baños", 1000, "Cloro", 690, 200);
        LacteoCecina queso = new LacteoCecina(5, 5000, "Queso", 5000, 20);
        //crear lista
        RegistroProducto rp = new RegistroProducto();
        //agregar los productos a la lista
        rp.agregarProducto(cocacola);
        rp.agregarProducto(fanta);
        rp.agregarProducto(cloro);
        rp.agregarProducto(queso);

        rp.listarProductos();
        System.out.println("...............");
        rp.mostrarBoleta();
    }

}
