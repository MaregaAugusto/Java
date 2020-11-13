package Java.practica1;
import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int i;
        int aux;
        int calificacion;
        String [] dias = {"Domingo", "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        Boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        int key;
        do {
            System.out.println("Ingrese \n 1 - ejercicio1 \n 2 - ejercicio2 \n 3 - ejercicio3 \n 4 - ejercicio4 \n 5 - Salir");
            key = scan.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Ingrese 3 numeros");
                    a = scan.nextInt();
                    b = scan.nextInt();
                    c = scan.nextInt();
                    System.out.println("El primer numero es: "+ a);
                    System.out.println("El segundo numero es: "+ b);
                    System.out.println("El tercer numero es: "+ c);
                    break;
                case 2:
                    System.out.println("Ingrese la clasificacion");
                    calificacion = scan.nextInt();
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
                    break;
                case 3:
                    System.out.println("Ingrese un numero del 1 al 7");
                    i = scan.nextInt();
                    i--;
                    try {
                        System.out.println(dias[i]);
                    } catch (Exception e) {
                        System.out.println("ingresaste un valor mayor a 7 o menor que 1");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un numero");
                    i = scan.nextInt();
                    aux = 0;
                    for (int j = 1; j <= 10; j++) {
                        aux = i * j;
                        System.out.print(i);
                        System.out.print("*");
                        System.out.print(j);
                        System.out.print("=");
                        System.out.println(aux);
                    }
                    break;
            
                default:
                    System.out.println("Chau");
                    bandera=false;
                    scan.close();
                    break;
            }
        } while (bandera);

    }
}
