package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro: ");
        int edad = cargaDeDatos.nextInt();

        int edadPerro = (edad * 7);
        System.out.println("La edad de su perro en humano es: " + edadPerro);

        cargaDeDatos.close();

    }
}
