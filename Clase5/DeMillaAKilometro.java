/*Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
package Clase5;

import java.util.Scanner;

public class DeMillaAKilometro {
    public static void main(String[] args) {

        double milla, kilometro;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese distancia en milla : ");
        milla = teclado.nextDouble();

        kilometro = milla * 1.60934;

        System.out.println("La distancia en kilometro es : " + kilometro);
    }
}
