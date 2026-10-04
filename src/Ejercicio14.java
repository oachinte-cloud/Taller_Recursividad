import java.util.Scanner;

/** 14. Función de Ackermann. */
public class Ejercicio14 {

    static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese m (>= 0): ");
        int m = sc.nextInt();
        System.out.print("Ingrese n (>= 0): ");
        int n = sc.nextInt();
        if (m < 0 || n < 0) {
            System.out.println("m y n deben ser no negativos.");
            return;
        }
        try {
            System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        } catch (StackOverflowError e) {
            System.out.println("Valores demasiado grandes: se desbordó la pila de recursión.");
        }
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
