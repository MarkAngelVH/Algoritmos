import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {

        Scanner valorW = new Scanner(System.in);

        int r, b;

        System.out.println("Valor de W: ");

        System.out.println("Ingrese el valor de R: ");
        r = valorW.nextInt();

        double W = ((double) (r + 1) / (r - 1)) - Math.pow(4, r);

        System.out.println("Ingrese el valor de B: ");
        b = valorW.nextInt();

        W += 3.0 / b;

        System.out.println("El resultado de toda la operacion es: " + W);
    }
}
