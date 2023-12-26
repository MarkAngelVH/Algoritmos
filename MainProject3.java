import static java.lang.Math.*;

import java.util.Scanner;

public class MainProject3 {
    
    
    public static void main(String[] args) {
        Scanner cono = new Scanner(System.in);
        
        int r,h;
        float vol;
        
        System.out.println("Volumen del cono: ");
                r = cono.nextInt();

        System.out.println("Ingrese el radio: ");
        
        System.out.println("Ingrese la altura");
        h = cono.nextInt();
    
        vol =(float)((1.0/3.0)*PI*pow(r,2)*h);
        System.out.println("El volumen es: "+vol);
    }
}
