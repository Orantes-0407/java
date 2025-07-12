// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\t");
        System.out.printf("Mi primer programa.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número (a);");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número (b);");
        int b = scanner.nextInt();
        //calcular la operación
        int resultado = a+b;
        System.out.print("El resultado es:"+ resultado);
        scanner.close();



        }
    }
