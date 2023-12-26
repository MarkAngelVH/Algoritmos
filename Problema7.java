import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de y: ");
        double y = scanner.nextDouble();

        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();

        double numerador1 = y + Math.pow(A, B);
        double denominador1 = A - B;

        if (denominador1 == 0) {
            System.out.println("No se puede dividir por cero. Por favor, ingrese valores diferentes para A y B.");
            scanner.close();
            return;
        }

        double primerTermino = numerador1 / denominador1;

        double numerador2 = 100 - y;
        double denominador2 = 5 * B;

        if (denominador2 == 0) {
            System.out.println("No se puede dividir por cero. Por favor, ingrese un valor diferente para B.");
            scanner.close();
            return;
        }

        double segundoTermino = numerador2 / denominador2;

        double x = primerTermino - segundoTermino;

        System.out.println("El valor de x es: " + x);

        scanner.close();
    }
}
