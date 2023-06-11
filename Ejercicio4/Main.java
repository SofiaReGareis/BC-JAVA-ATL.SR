package Ejercicio4;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Ingrese el total de la cuenta del restaurante: ");
            double totalCuenta = cargaDeDatos.nextDouble();
            System.out.println("Ingrese el % de propina que desea dejar: ");
            double PorcentajePropina = cargaDeDatos.nextDouble();

            double propina = totalCuenta  * (PorcentajePropina / 100 );

            System.out.println("El monto de la propina es: " + propina);
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrate de ingresar un número válido.");
        } finally {
            cargaDeDatos.close();
        }
    }
}