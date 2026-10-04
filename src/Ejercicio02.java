import java.util.Scanner;

/** 2. Invertir un número entero (123 -> 321). */
public class Ejercicio02 {

    // 'acum' va construyendo el número invertido
    static long invertir(long n, long acum) {
        if (n == 0) return acum;            // caso base
        return invertir(n / 10, acum * 10 + n % 10);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un entero: ");
        long n = sc.nextLong();
        long r = invertir(Math.abs(n), 0);
        System.out.println("Invertido: " + (n < 0 ? -r : r));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
