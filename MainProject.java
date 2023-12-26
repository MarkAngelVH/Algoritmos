import java.util.Scanner;

public class MainProject {

    
    public static void main(String[] args) {
        Scanner objscan = new Scanner(System.in);
        Byte n1,n2;
        float Promedio;
        System.out.println("Ingrese la nota 1: ");
        n1 = objscan.nextByte();
        
        System.out.println("Ingrese la nota 2: ");
        n2 = objscan.nextByte();
        
        System.out.println("Nota 1: " +n1);
        System.out.println("Nota 2: "+n2);
        
        Promedio = (n1+n2/2);
        System.out.println("El promedio es: "+ Promedio);
        
        
        }
}
    

