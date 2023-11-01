/*Genera un número aleatorio entre 1 y 100.
 Pídele al usuario que adivine el número.*/
package Clase5;

import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        int numA = (int)(Math.random() * 100);

        int num;

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero : ");
            num = teclado.nextInt();
            if (num > numA) {
                System.out.println("El numero a adivinar es menor");
            }else if(num < numA) {
                System.out.println("El numero a adivinar es mayor");
            }

        }while(num != numA);
            System.out.println("Haz acertado!");




    }
}