package Java.practica1;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int i = scan.nextInt();
        int aux = 0;
        scan.close();
        for (int j = 1; j <= 10; j++) {
            aux = i * j;
            System.out.print(i);
            System.out.print("*");
            System.out.print(j);
            System.out.print("=");
            System.out.println(aux);
        }

    }
}
