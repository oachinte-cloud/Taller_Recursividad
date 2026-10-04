import java.util.Scanner;

/** 10. Multiplicación mediante sumas sucesivas. */
public class Ejercicio10 {

    // Solo para b >= 0
    static int multiplicar(int a, int b) {
        if (b == 0) return 0;               // caso base
        return a + multiplicar(a, b - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        int r = multiplicar(a, Math.abs(b));
        if (b < 0) r = -r;
        System.out.println(a + " x " + b + " = " + r);
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
