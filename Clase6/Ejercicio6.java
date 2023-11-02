package Clase6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int a,b,c,mayor,menor;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros : ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if(a>b && a>c){
            mayor = a;
        } else if (b>a && b>c) {
            mayor = b;
        }
        else{
           mayor = c;
        }

        if(a<b && a<c){
            menor = a;
        } else if (b<a && b<c) {
            menor = b;
        }else{
            menor = c;
        }

        System.out.println("El mayor es : " + mayor);
        System.out.println("El menor es : " + menor);
    }
}
