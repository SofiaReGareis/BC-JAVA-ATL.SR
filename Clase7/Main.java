package Clase7;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner cargaDeDatos = new Scanner(System.in);
       //1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos
        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = cargaDeDatos.nextInt();
        }

        System.out.println("Los números ingresados son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //2) Agregar que muestre el número mayor y el número menor.
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        //3) Ahora, hay que mostrar el promedio

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio es: " + promedio);
    }
}

