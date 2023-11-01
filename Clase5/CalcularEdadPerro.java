package Clase5;

import java.util.Scanner;

/*Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a
7 años de perro).

*/
public class CalcularEdadPerro {
    public static void main(String[] args) {

        int edadH,edadP;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad : ");
        edadH = teclado.nextInt();

        edadP = edadH * 7;

        System.out.println("La edad de su perro es : " + edadP);
    }
}
