import java.util.Scanner;

/** 9. Cociente de la división entera con restas sucesivas. */
public class Ejercicio09 {

    // Solo para a >= 0 y b > 0
    static int cociente(int a, int b) {
        if (a < b) return 0;                // caso base
        return 1 + cociente(a - b, b);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el dividendo: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("No se puede dividir entre cero.");
            return;
        }
        int q = cociente(Math.abs(a), Math.abs(b));
        if ((a < 0) != (b < 0)) q = -q;     // signo del resultado
        System.out.println(a + " / " + b + " = " + q);
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
