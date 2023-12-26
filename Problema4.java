import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        double radio, altura;
        final double PI = 3.1416;
        
        System.out.println("----Cálculo del Volumen de un Cilindro----");
        
        System.out.println("Ingrese el radio de la base del cilindro: ");
        radio = entrada.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        altura = entrada.nextDouble();

        double volumen = PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
