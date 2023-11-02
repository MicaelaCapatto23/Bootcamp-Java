package Clase6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int nota1,nota2,nota3;
        float prom,sum;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 3 notas : ");
        nota1 = teclado.nextInt();
        nota2 = teclado.nextInt();
        nota3 = teclado.nextInt();

        sum = nota1 + nota2 + nota3;

        prom = sum / 3;

        System.out.println("El promedio es : " + prom);
    }
}
