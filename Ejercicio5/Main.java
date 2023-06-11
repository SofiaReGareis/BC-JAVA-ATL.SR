package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
        Random aleatorio = new Random();
        try {
            System.out.println("ADIVINA EL NUMERO DEL 1 AL 100");
            //Genero un numero aleatorio
            int numeroAleatorio = aleatorio.nextInt(100) + 1;
            //Inicio el ingresado con 0 para que no coincida.
            int numeroIngresado = 0;
            //Contador
            int intentos = 0;

            while (numeroIngresado != numeroAleatorio) {
                System.out.println("Ingrese un número: ");
                numeroIngresado = cargaDeDatos.nextInt();
                intentos++;
                if (numeroIngresado < numeroAleatorio) {
                    System.out.println("El número secreto es mayor. ¡Sigue intentando!");
                } else if (numeroIngresado > numeroAleatorio) {
                    System.out.println("El número secreto es menor. ¡Sigue intentando!");
                }
            }

            System.out.println("¡Felicitaciones! Adivinaste el número secreto en " + intentos + " intentos.");
            System.out.println("El número secreto era: " + numeroAleatorio );
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrate de ingresar un número válido.");
        } finally {
            cargaDeDatos.close();
        }
    }
}