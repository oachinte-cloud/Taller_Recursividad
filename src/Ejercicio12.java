import java.util.Scanner;

/** 12. Matriz de m x n y suma de todos sus elementos. */
public class Ejercicio12 {

    // Recorre la matriz fila por fila usando (fila, columna)
    static int sumaMatriz(int[][] mat, int f, int c) {
        if (f == mat.length) return 0;                          // ya no hay filas
        if (c == mat[0].length) return sumaMatriz(mat, f + 1, 0); // siguiente fila
        return mat[f][c] + sumaMatriz(mat, f, c + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Número de columnas (n): ");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("m y n deben ser positivos.");
            return;
        }
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int[] fila : mat) {
            for (int x : fila) System.out.print(x + "\t");
            System.out.println();
        }
        System.out.println("Suma de los elementos: " + sumaMatriz(mat, 0, 0));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
