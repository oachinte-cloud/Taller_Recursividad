import java.util.Scanner;

/** 4. Suma de los dígitos de un número (123 -> 6). */
public class Ejercicio04 {

    static int sumaDigitos(long n) {
        if (n == 0) return 0;               // caso base
        return (int) (n % 10) + sumaDigitos(n / 10);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un entero: ");
        long n = sc.nextLong();
        System.out.println("Suma de dígitos: " + sumaDigitos(Math.abs(n)));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
