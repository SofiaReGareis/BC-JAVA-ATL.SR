package Ejercicio3;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Ingrese el precio original del producto: ");
            double precioOriginal = cargaDeDatos.nextDouble();
            System.out.println("Ingrese el % de descuento: ");
            double descuento = cargaDeDatos.nextDouble();

            double precioFinal = (precioOriginal -(precioOriginal * descuento / 100 ));

            System.out.println("El precio final del producto es: " + precioFinal);
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrate de ingresar un número válido.");
        } finally {
            cargaDeDatos.close();
        }
    }
}
