package Ejercicio2;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in).useLocale(Locale.US); //Por el double se agrega el locale

        try {
            System.out.println("Ingrese la distancia en millas: ");
            double millas = cargaDeDatos.nextDouble();

            double kilometros = (millas * 1.60934);
            System.out.println("La distancia en kilómetros es: " + kilometros);
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrate de ingresar un número válido.");
        } finally {
            cargaDeDatos.close();
        }
    }
}

