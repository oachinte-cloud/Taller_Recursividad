import java.util.Scanner;

/** 8. Copiar una cadena en otra. */
public class Ejercicio08 {

    // Copia carácter a carácter desde 'origen[i]' hacia 'destino[i]'
    static void copiar(String origen, char[] destino, int i) {
        if (i == origen.length()) return;   // caso base
        destino[i] = origen.charAt(i);
        copiar(origen, destino, i + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese una cadena: ");
        String origen = sc.nextLine();
        char[] destino = new char[origen.length()];
        copiar(origen, destino, 0);
        System.out.println("Cadena copiada: " + new String(destino));
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
