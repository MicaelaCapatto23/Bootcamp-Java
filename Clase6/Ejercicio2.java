package Clase6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String palabra;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese palabra a buscar : ");
        palabra = teclado.next();

        System.out.println("https://twitter.com/search?q=" + palabra);
    }
}
