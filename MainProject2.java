   import java.util.Scanner;

public class MainProject2 {
 
    public static void main(String[] args) {
               
        Scanner operacion = new Scanner(System.in);
       
        float n1,n2;
        float division,suma,resta,multiplicacion;
        System.out.println("Ingrese su primer numero: ");
        n1 = operacion.nextFloat();
        
        System.out.println("Ingrese el segundo numero: ");
        n2 = operacion.nextFloat();
        
        division = (n1/n2);
        System.out.println("La division de los 2 numeros es :"+division);
        
        suma = (n1+n2);
        System.out.println("La suma es : "+ suma);
        
        resta = (n1-n2);
        System.out.println("La resta es : "+ resta );
        
        multiplicacion = (n1*n2);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        
        
    }
    
}
