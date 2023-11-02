package Clase6;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso : ");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        num = teclado.nextInt();

        if(num == 2){
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: ");
            System.out.println("1) Entras por la puerta de la izquierda");
            System.out.println("2) Optas por la puerta de la derecha");
            num = teclado.nextInt();
             if(num == 1){
                 System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\");\n" +
                         "       ");
             }
        }


    }
}
