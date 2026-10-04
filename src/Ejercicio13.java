import java.util.Scanner;

/** 13. Serie de Fibonacci hasta el límite leído. */
public class Ejercicio13 {

    static long fib(int n) {
        if (n == 0) return 0;               // Fib(0) = 0
        if (n == 1) return 1;               // Fib(1) = 1
        return fib(n - 1) + fib(n - 2);
    }

    // Imprime Fib(i), Fib(i+1), ..., Fib(limite)
    static void imprimir(int i, int limite) {
        if (i > limite) return;             // caso base
        System.out.print(fib(i) + (i < limite ? ", " : ""));
        imprimir(i + 1, limite);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el límite de la serie (n >= 0): ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El límite debe ser mayor o igual a 0.");
            return;
        }
        System.out.print("Fibonacci hasta Fib(" + n + "): ");
        imprimir(0, n);
        System.out.println();
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
