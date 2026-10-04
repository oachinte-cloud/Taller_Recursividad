import java.util.Scanner;

/** 3. Sumatoria 1 + 1/2 + 1/3 + ... + 1/n. */
public class Ejercicio03 {

    static double sumatoria(int n) {
        if (n == 1) return 1.0;             // caso base
        return 1.0 / n + sumatoria(n - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese n (n >= 1): ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1.");
        } else {
            System.out.println("1 + 1/2 + ... + 1/" + n + " = " + sumatoria(n));
        }
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
