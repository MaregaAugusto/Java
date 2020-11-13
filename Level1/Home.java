package Java.Level1;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        String nom, dir, ciu;
        Boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        int key, edad;
        do {
            System.out.println("Ingrese \n1 - ejercicio1 \n2 - ejercicio2 \n3 - ejercicio3 \n4 - ejercicio4 \n5 - ejercicio5 \n6 - ejercicio6 \n7 - ejercicio7 \n8 - ejercicio8 \n9 - ejercicio9 \n10 - Salir");
            key = scan.nextInt();
            scan.nextLine();
            switch (key) {
                case 1:
                    System.out.println("Ingrese nombre de usuario");
                    ejercicio1(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros");
                    ejercicio2(scan.nextInt(), scan.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese un numeros");
                    ejercicio3(scan.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese un numeros");
                    ejercicio4(scan.nextInt());
                    break;
                case 5:
                    System.out.println("Ingrese dos numeros");
                    ejercicio5(scan.nextInt(), scan.nextInt());
                    break;
                case 6:
                    System.out.println("Ingrese dos numeros");
                    ejercicio6(scan.nextInt(), scan.nextInt());
                    break;
                case 7:
                    System.out.println("Ingrese una palabra");
                    ejercicio7(scan.nextLine());
                    break;
                case 8:
                    System.out.println("Ingrese nombre");
                    nom = scan.nextLine();
                    System.out.println("Ingrese edad");
                    edad = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Ingrese dirrecion");
                    dir= scan.nextLine();
                    System.out.println("Ingrese ciudad");
                    ciu = scan.nextLine();
                    ejercicio8(nom, edad, dir, ciu);
                    break;
                case 9:
                    System.out.println("Ingrese un numeros");
                    ejercicio9(scan.nextLine(), scan.nextLine());
                    break;
            
                default:
                    bandera=false;
                    scan.close();
                    break;
            }
        } while (bandera);
    }

    public static void ejercicio1(String nombre) {
        Usuario user = new Usuario(nombre);
        System.out.println(user.Saludar());
    }
    public static void ejercicio2(int x, int y) {
        Aritmetica aritmetica = new Aritmetica(x, y);
        System.out.println(aritmetica.mostrarTodo());
    }
    public static void ejercicio3(int x) {
        Aumentar aumentar = new Aumentar(x);
        System.out.println(aumentar.crecer());
    }
    public static void ejercicio4(int x) {
        Factoreal factoreal = new Factoreal(x);
        System.out.println(factoreal.factor());
    }
    public static void ejercicio5(int x, int y) {
        Multiplicar multiplicar = new Multiplicar(x, y);
        System.out.println(multiplicar.multi());
    }
    public static void ejercicio6(int x, int y) {
        Elevar dato = new Elevar(x, y);
        System.out.println(dato.eleva());
    }
    public static void ejercicio7(String text) {
        Letra l = new Letra(text);
        System.out.println(l.mayuscula());
    }
    public static void ejercicio8(String nombre, int edad, String direccion, String ciudad) {
        Persona persona = new Persona(nombre, edad, direccion, ciudad);
        System.out.println(persona.mostrar());
    }
    public static void ejercicio9(String x, String letra) {
        char l = letra.charAt(1);
        canLetras taxt = new canLetras(x);
        System.out.println("la frase tiene "+ taxt.cantidad(l)+ "-"+ l);
    }

}
