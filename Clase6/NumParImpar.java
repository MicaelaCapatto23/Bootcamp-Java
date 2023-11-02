package Clase6;

import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero : ");
        num = teclado.nextInt();

        if(num%2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
}
