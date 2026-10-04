import java.util.Scanner;

/** 5. Sumatoria de 1 hasta el número leído. */
public class Ejercicio05 {

    static long sumatoria(int n) {
        if (n <= 0) return 0;               // caso base
        return n + sumatoria(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un entero positivo: ");
        int n = sc.nextInt();
        System.out.println("1 + 2 + ... + " + n + " = " + sumatoria(n));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
