/* Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la
fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/


package Clase5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {

        double precioO,desc,precioF;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio original de un producto : ");
        precioO = teclado.nextDouble();

        System.out.println("Ingrese porcentaje de descuento : ");
        desc = teclado.nextDouble();

        precioF = precioO - (precioO * desc/100);

        System.out.println("El precio final es : " + precioF);


    }
}
