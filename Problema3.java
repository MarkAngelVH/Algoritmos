
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, altura;
        
        System.out.println("Ingrese base mayor: ");
        n1 = entrada.nextInt();
        
        System.out.println("Ingrese base menor: ");
        n2 = entrada.nextInt();
        
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextInt();
        
        double area = ((n1 + n2) / 2.0) * altura;  
        
        System.out.println("El area del trapecio es: " + area);
    }
}
