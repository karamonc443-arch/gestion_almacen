package org.karamon.herencia.almacen.vista;

import org.karamon.herencia.almacen.domain.*;

public class AlmacenSwitchCase {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("Manzana", 5D, 13D, "Roja");
        productos[1] = new Fruta("Manzana", 3.5, 20D, "Verde");
        productos[2] = new Limpieza("lavaloza", 1.2, "Quix", 2290);
        productos[3] = new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330);
        productos[4] = new Lacteo("Leche Sabor Chocolate Semidescremada", 1000D, 32, 1150);
        productos[5] = new Lacteo("Yoghurt Batido Sabor Frutilla Bolsa", 1000D, 37, 1190);
        productos[6] = new NoPerecible("Atún Lomitos en Agua Angelo", 95D, 1, 960);
        productos[7] = new NoPerecible("Porotos Hallado Bolsa", 1000d, 3536, 1990);


        for (Producto producto : productos) {
            System.out.println("-------------------------------- " + producto.getClass().getSimpleName() + " ---------------------------------");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            switch (producto) {
                case Fruta fruta -> {
                    System.out.println("Peso (gr): " + fruta.getPeso());
                    System.out.println("Color: " + fruta.getColor());
                }
                case Limpieza limpieza -> {
                    System.out.println("Componentes: " + limpieza.getComponentes());
                    System.out.println("Litros: " + limpieza.getLitros());
                }
                case Lacteo lacteo -> {
                    System.out.println("Cantidad (gr/cc): " + lacteo.getCantidad());
                    System.out.println("Proteínas (gr): " + lacteo.getProteinas());
                }
                case NoPerecible noPerecible -> {
                    System.out.println("Calorías (kCal): " + noPerecible.getCalorias());
                    System.out.println("Contenido neto (gr): " + noPerecible.getContenido());
                }
                default -> {
                }
            }

        }
    }

}
