import java.util.Scanner;

/** 6. Potencia: base elevada al exponente. */
public class Ejercicio06 {

    static double potencia(double base, int exp) {
        if (exp == 0) return 1;                         // caso base
        if (exp < 0) return 1 / potencia(base, -exp);   // exponente negativo
        return base * potencia(base, exp - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente (entero): ");
        int exp = sc.nextInt();
        if (base == 0 && exp < 0) {
            System.out.println("0 no se puede elevar a un exponente negativo.");
        } else {
            System.out.println(base + " ^ " + exp + " = " + potencia(base, exp));
        }
    }

    public static void main(String[] args) {
        ejecutar(new Scanner(System.in));
    }
}
