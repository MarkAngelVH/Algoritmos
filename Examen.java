package examen;

import java.util.Scanner;
import java.lang.Math;

public class Examen {

    public static void main(String[] args) {
        //calcularPromedio();
        //perimetro();
        velocidad();
    }

    public static void calcularPromedio() {
        Scanner promedio = new Scanner(System.in);

        System.out.println("Promedios");
        System.out.println("-------------------");

        byte n1, n2, n3, n4, n5, n6, resultado, division;

        System.out.println("Ingrese la primera nota: ");
        n1 = promedio.nextByte();

        System.out.println("Ingrese la segunda nota: ");
        n2 = promedio.nextByte();

        System.out.println("Ingrese la tercera nota: ");
        n3 = promedio.nextByte();

        System.out.println("Ingrese la cuarta nota: ");
        n4 = promedio.nextByte();

        System.out.println("Ingrese la quinta nota: ");
        n5 = promedio.nextByte();

        System.out.println("Ingrese la sexta nota: ");
        n6 = promedio.nextByte();

        System.out.println("----------------------");

        resultado = (byte) (n1 + n2 + n3 + n4 + n5 + n6);
        division = (byte) (resultado / 6);
        System.out.println("El promedio es:" + division);
    }

    public static void perimetro() {
        
        Scanner perimetro = new Scanner(System.in);
        
        int ladoA, ladoB, ladoC, ladoAA, resultado;

        System.out.println("Calcular el perímetro");
        System.out.println("----------------------");

        System.out.println("Ingrese la longitud del lado A: ");
        ladoA = perimetro.nextInt();

        System.out.println("Ingrese la longitud del lado B: ");
        ladoB = perimetro.nextInt();

        System.out.println("Ingrese la longitud del lado C: ");
        ladoC = perimetro.nextInt();

        System.out.println("Ingrese la longitud del lado AA: ");
        ladoAA = perimetro.nextInt();

        resultado = ladoA + ladoB + ladoC + ladoAA + 70;
        
        System.out.println("El perímetro es: " + resultado);  
    }
    
    
  

    public static void velocidad() {
        double velocidadInicial = 0;
        double aceleracion = 8;
        double distancia = 12;

        double velocidadFinal = Math.sqrt(Math.pow(velocidadInicial, 2) + 2 * aceleracion * distancia);

        System.out.println("Velocidad Inicial: " + velocidadInicial);
        System.out.println("Aceleración: " + aceleracion);
        System.out.println("Distancia: " + distancia);
        System.out.println("La velocidad final es: " + velocidadFinal);
    }
}
