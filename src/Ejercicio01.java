import java.util.Scanner;

/** 1. Factorial de un número entero (recursivo). */
public class Ejercicio01 {

    static long factorial(int n) {
        if (n <= 1) return 1;               // caso base: 0! = 1! = 1
        return n * factorial(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un entero (n >= 0): ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El factorial no está definido para negativos.");
        } else if (n > 20) {
            System.out.println("n > 20 desborda el tipo long.");
        } else {
            System.out.println(n + "! = " + factorial(n));
        }
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
