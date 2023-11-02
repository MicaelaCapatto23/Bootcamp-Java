package Clase6;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcO = (int) (Math.random()*3);

        int opcH,contO,contH;

        contO = 0;
        contH = 0;

        System.out.println("Ingrese opcion [1-piedra,2-papel,3-tijera, 4-Salir]");
       opcH = teclado.nextInt();

        System.out.println("La maquina eligio : ");

        switch(opcO){
            case 1 :
                System.out.println("Piedra");
                if(opcH == 1){
                    System.out.println("Piedra");
                    System.out.println("Empate");
                }
                else if(opcH == 2){
                    System.out.println("Papel");
                    System.out.println("Ganaste!");
                    contH++;
                }
                else{
                    System.out.println("Tijera");
                    System.out.println("Perdiste..");
                    contO++;
                }
                break;
            case 2 :
                System.out.println("Papel");
                    if(opcH == 1){
                        System.out.println("Piedra");
                        System.out.println("Perdiste..");
                        contO++;
                    }
                    else if(opcH == 2){
                        System.out.println("Papel");
                        System.out.println("Empate");
                        contH++;
                    }
                    else{
                        System.out.println("Tijera");
                        System.out.println("Ganaste!");
                        contH++;
                    }
                break;
            case 3 :
                System.out.println("Tijera");
                if(opcH == 1){
                    System.out.println("Piedra");
                    System.out.println("Ganaste!");
                    contH++;
                }
                else if(opcH == 2){
                    System.out.println("Papel");
                    System.out.println("Perdiste..");
                    contO++;
                }
                else{
                    System.out.println("Tijeras");
                    System.out.println("Empate");
                }
            break;

        }


        System.out.println("Computadora : " + contO);
        System.out.println("Tu : " + contH);

        if(contH > contO){
            System.out.println("GANASTE!");
        }else{
            System.out.println("GANA LA COMPUTADORA!");
        }
    }
}
