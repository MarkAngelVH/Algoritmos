import java.util.Scanner;

public class Problema2 {
    
    public static void main(String[] args){
        
        int n1,n2,n3;
        
        Scanner producto = new Scanner(System.in);
        
        System.out.println("Ingrese el 1er Numero: ");
                n1 = producto.nextInt();
        
        System.out.println("Ingrese el 2do Numero: ");
                n2 = producto.nextInt();

        System.out.println("Ingrese el 3er Numero: ");
                n3 = producto.nextInt();
                
        int suma = n1 + n2 + n3;
        System.out.println("la suma seria: "+ suma);
    
        int productos = n1 * n2 * n3;
        System.out.println("el producto seria: " + productos);
        
        
        

    }
}