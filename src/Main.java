import java.util.InputMismatchException;
import java.util.Scanner;

/** Menú principal del Taller de Recursividad. Ejecute esta clase. */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n===== TALLER DE RECURSIVIDAD =====");
            System.out.println(" 1. Factorial");
            System.out.println(" 2. Invertir un número");
            System.out.println(" 3. Sumatoria 1 + 1/2 + ... + 1/n");
            System.out.println(" 4. Suma de dígitos");
            System.out.println(" 5. Sumatoria hasta n");
            System.out.println(" 6. Potencia");
            System.out.println(" 7. M.C.D. (Euclides)");
            System.out.println(" 8. Copiar una cadena");
            System.out.println(" 9. Cociente (restas sucesivas)");
            System.out.println("10. Multiplicación (sumas sucesivas)");
            System.out.println("11. Suma de un arreglo");
            System.out.println("12. Suma de una matriz");
            System.out.println("13. Serie de Fibonacci");
            System.out.println("14. Función de Ackermann");
            System.out.println(" 0. Salir");
            System.out.print("Elija una opción: ");
            try {
                op = sc.nextInt();
                sc.nextLine(); // limpiar el salto de línea
                System.out.println();
                switch (op) {
                    case 1  -> Ejercicio01.ejecutar(sc);
                    case 2  -> Ejercicio02.ejecutar(sc);
                    case 3  -> Ejercicio03.ejecutar(sc);
                    case 4  -> Ejercicio04.ejecutar(sc);
                    case 5  -> Ejercicio05.ejecutar(sc);
                    case 6  -> Ejercicio06.ejecutar(sc);
                    case 7  -> Ejercicio07.ejecutar(sc);
                    case 8  -> Ejercicio08.ejecutar(sc);
                    case 9  -> Ejercicio09.ejecutar(sc);
                    case 10 -> Ejercicio10.ejecutar(sc);
                    case 11 -> Ejercicio11.ejecutar(sc);
                    case 12 -> Ejercicio12.ejecutar(sc);
                    case 13 -> Ejercicio13.ejecutar(sc);
                    case 14 -> Ejercicio14.ejecutar(sc);
                    case 0  -> System.out.println("¡Hasta luego!");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, intente de nuevo.");
                sc.nextLine();
                op = -1;
            }
        } while (op != 0);
    }
}
