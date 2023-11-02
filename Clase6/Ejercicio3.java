package Clase6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String tel;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese telefono : ");
        tel = teclado.next();

        System.out.println("https://api.whatsapp.com/send?phone=" + tel);
    }
}
