package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    //scanners
    public static Scanner objeto = new Scanner(System.in);
    
    public static void main(String[] args) {
       //  ejercicio1();
       //  ejercicio2();
       //  ejercicio3();
           ejercicio4(); 
    }
    public static void ejercicio1(){
        int nota1, nota2, nota3, total, promedio;
        //3 notas de un alumno
        System.out.println("Ingresa su 1 nota");
            nota1 = objeto.nextInt();
    
        System.out.println("Ingresa su 2 nota");
            nota2 = objeto.nextInt();
        
        System.out.println("Ingresa su 3 nota");
            nota3 = objeto.nextInt();
        
        //promedio del alumno
        total = nota1 + nota2 + nota3;
        promedio = total / 3;

        //condicional
        if(promedio < 11){
            System.out.println("DESAPROBADO");
        } else if(promedio > 11){
            System.out.println("APROBADO");
        } else{
            System.out.println("Verifique sus notas nuevamente y vuelva a ingresarlas");
        }
    }
    
    public static void ejercicio2(){
        
        float articulo, cantidad, importe, porcentaje, pagototal, descuento;

        //ingresar el articulo        
        System.out.println("Ingrese el precio de su articulo: ");
                articulo = objeto.nextFloat();
        // ingresar la cantidad
        System.out.println("Cuantos deseas comprar?");
               cantidad = objeto.nextInt();
               
        //total pagado de la persona
        importe = articulo;
        System.out.println("El total de precio de tus articulo es de : $/" + importe);
        
        //condicionales
       if(importe > 100){
           
           importe = articulo * cantidad;
           System.out.println("costo de cantidad:" + importe);
           
           descuento = (importe * 20)/100;
           System.out.println("su descuento es "+ descuento);
           
           pagototal = importe - descuento;
           System.out.println("Total a pagar es de: $/" + pagototal); 
          
       } else{
           importe = articulo * cantidad;
           System.out.println("costo de cantidad:" + importe);
           
           descuento = (importe * 5)/100;
           System.out.println("su descuento es "+ descuento);
           
           pagototal = importe - descuento;
           System.out.println("Total a pagar es de: $/" + pagototal); 
       }     
    }
    
    public static void ejercicio3(){
        int nota1, nota2, nota3, promedio, total;

        //3 notas
        System.out.println("Ingrese su 1 nota: ");
        nota1 = objeto.nextInt();
        
        System.out.println("Ingrese su 2 nota: ");
        nota2 = objeto.nextInt();
        
        System.out.println("Ingrese su 3 nota: ");
        nota3 = objeto.nextInt();
        
        //promedio
        System.out.println("SOLAMENTE SE PROMEDIARA LAS 2 PRIMERAS NOTAS: " + nota1 + " Y " +nota2);
        promedio = (nota1 + nota2) /2;
       
        //condicionales
        if(promedio >=13){
            System.out.println("aprobado");
        } else{
            System.out.println("desaprovado");
        }
    }
    
    public static void ejercicio4() {
        Scanner objeto = new Scanner(System.in);

        int salarioSemanal, salarioXhora, horasTrabajadas, horaExtra, seguro, pagoConSeguro, salarioConHorasExtras;
        
        // Calcular salario semanal
        System.out.println("Salario semanal del obrero");
        System.out.println("El obrero trabaja 8 horas por dia sin contar sabado y domingo");

        System.out.println("las horas trabajadas del obrero son:");
        horasTrabajadas = objeto.nextInt();

        salarioXhora = 16;
        salarioSemanal = horasTrabajadas * salarioXhora;

        System.out.println("Su salario semanal es de: " + salarioSemanal);

        // Calcular seguro
        seguro = (salarioSemanal * 25) / 100;
        pagoConSeguro = salarioSemanal + seguro;
        System.out.println("SALARIO SEMANAL MAS SEGURO :" + pagoConSeguro);

        horaExtra = 18;

        // Condicional
        if (horasTrabajadas > 40) {
            // Se le pagará 18 por cada hora extra trabajada
            int horasExtrasTrabajadas = horasTrabajadas - 40;
            salarioConHorasExtras = pagoConSeguro + (horasExtrasTrabajadas * horaExtra);

            System.out.println("Salario con horas extras: " + salarioConHorasExtras);
        } else {
            System.out.println("SALARIO SEMANAL MAS SEGURO :" + pagoConSeguro);
        }
        
    }

}

    
