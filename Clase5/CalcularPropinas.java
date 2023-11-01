/*Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula:
propina = totalCuenta * (porcentajePropina / 100).
*/
package Clase5;

import java.util.Scanner;

public class CalcularPropinas {
    public static void main(String[] args) {

        float cuenta, porc,propina;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese total de la cuenta : ");
        cuenta = teclado.nextFloat();

        System.out.println("Ingrese porcentaje de propina : ");
        porc = teclado.nextFloat();

        propina = cuenta * (porc / 100);

        System.out.println("La propina es : " + propina);

    }
}
