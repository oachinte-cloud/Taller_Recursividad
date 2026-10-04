import java.util.Scanner;

/** 7. M.C.D. con el algoritmo de Euclides. */
public class Ejercicio07 {

    static int mcd(int m, int n) {
        if (n == 0) return m;               // MCD(M, 0) = M
        return mcd(n, m % n);               // MCD(M, N) = MCD(N, M % N)
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese M: ");
        int m = Math.abs(sc.nextInt());
        System.out.print("Ingrese N: ");
        int n = Math.abs(sc.nextInt());
        System.out.println("MCD(" + m + ", " + n + ") = " + mcd(m, n));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
