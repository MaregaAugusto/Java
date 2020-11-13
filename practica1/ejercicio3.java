package Java.practica1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la clasificacion");
        Scanner scan = new Scanner(System.in);
        int calificacion = scan.nextInt();
        scan.close();
        if (calificacion < 60) {
            System.out.println("Desaprobado");
        } else if(calificacion < 75) {
            System.out.println("Bueno");
        } else if (calificacion < 85) {
            System.out.println("Distinguido");
        } else if(calificacion < 93){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Excelente");
        }

    }
}
