import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad inicial (v0): ");
        double velocidadInicial = scanner.nextDouble();

        System.out.println("Ingrese la aceleración (a): ");
        double aceleracion = scanner.nextDouble();

        System.out.println("Ingrese el tiempo (t): ");
        double tiempo = scanner.nextDouble();

        double distancia = calcularDistanciaMRUV(velocidadInicial, aceleracion, tiempo);

        System.out.println("La distancia recorrida es: " + distancia);
    }

    public static double calcularDistanciaMRUV(double velocidadInicial, double aceleracion, double tiempo) {
        
        double distancia = velocidadInicial * tiempo + 0.5 * aceleracion * Math.pow(tiempo, 2);
        return distancia;
    }
}
