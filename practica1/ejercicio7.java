package Java.practica1;
import java.util.Scanner;

public class ejercicio7 {    
    public static void main (String[] args) {
        System.out.println("Ingrese 3 numeros");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        imprimir(a, b, c);
        scan.close();
    };
    public static void imprimir(int a,int b,int c) {
        System.out.println("El primer numero es: "+ a);
        System.out.println("El segundo numero es: "+ b);
        System.out.println("El tercer numero es: "+ c);
    };
}
