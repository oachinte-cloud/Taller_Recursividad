import java.util.Scanner;

/** 11. Leer n valores en un arreglo y sumar sus elementos. */
public class Ejercicio11 {

    static int sumaArreglo(int[] v, int i) {
        if (i == v.length) return 0;        // caso base
        return v[i] + sumaArreglo(v, i + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("¿Cuántos valores desea ingresar?: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n debe ser positivo.");
            return;
        }
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.println("Suma de los elementos: " + sumaArreglo(v, 0));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
