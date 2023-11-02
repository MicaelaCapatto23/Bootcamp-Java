package Clase7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        System.out.println("Ingrese numeros : ");

        Scanner teclado = new Scanner(System.in);

        for(int i=0; i<numeros.length;i++){
            numeros[i] = teclado.nextInt();
        }

        System.out.println("...............");

        for(int i=0;i<numeros.length;i++){
            System.out.println("Nro : " + numeros[i]);
        }

        System.out.println(".....................");

        int mayor = 0;
        int menor = 0;
        float sum = 0;
        float prom;

        for(int i=0; i<numeros.length;i++){
            if(numeros[i]>=mayor || i==0){
                mayor = numeros[i];
            }
            if(numeros[i]<= menor || i==0){
                menor = numeros[i];
            }
        }
        System.out.println("El mayor es : " + mayor);
        System.out.println("El menor es : " + menor);

        System.out.println(".......................");

        for(int i=0;i<numeros.length;i++){
            sum += numeros[i];


        }
        prom = sum/numeros.length;
        System.out.println("El promedio es : " + prom);
    }
}
