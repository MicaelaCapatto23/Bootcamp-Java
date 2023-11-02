package Clase6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        String pais;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el país a buscar : ");
        pais = teclado.next();

        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
