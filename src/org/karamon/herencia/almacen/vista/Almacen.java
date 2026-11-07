package org.karamon.herencia.almacen.vista;

import org.karamon.herencia.almacen.domain.*;

public class Almacen {
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

            if (producto instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) producto).getPeso());
                System.out.println("Color: " + ((Fruta) producto).getColor());
            } else if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
            } else if (producto instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) producto).getCantidad());
                System.out.println("Proteínas (gr): " + ((Lacteo) producto).getProteinas());
            } else if (producto instanceof NoPerecible) {
                System.out.println("Calorías (kCal): " + ((NoPerecible) producto).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) producto).getContenido());
            }

        }
    }

}
