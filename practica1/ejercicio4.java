package Java.practica1;

import java.util.Scanner;

public class ejercicio4 {
    

    public static void main(String[] args) {
        String [] dias = {"Domingo", "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int i = scan.nextInt();
        scan.close();
        i--;
        try {
            System.out.println(dias[i]);
        } catch (Exception e) {
            System.out.println("ingresaste un valor mayor a 7 o menor que 1");
        }
    }
}
