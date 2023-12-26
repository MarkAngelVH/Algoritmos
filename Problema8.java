public class Problema8 {

    // Método para calcular la energía cinética
    public static double calcularEnergiaCinetica(double masa, double velocidad) {
        // Fórmula: Ec = (m * v^2) / 2
        return (masa * Math.pow(velocidad, 2)) / 2;
    }

    public static void main(String[] args) {
        // Datos del problema
        double velocidadKmHr = 60.0; // Velocidad en kilómetros por hora
        double masa =  // Ingresa la masa del objeto en kilogramos;

        // ¡Asegúrate de proporcionar un valor para la masa!
        // Por ejemplo:
        masa = 10.0; // Esto es solo un ejemplo, coloca el valor real de la masa

        // Convertir la velocidad a metros por segundo
        double velocidadMs = velocidadKmHr / 3.6;

        // Calcular la energía cinética llamando al método
        double energiaCineticaResultante = calcularEnergiaCinetica(masa, velocidadMs);

        // Imprimir el resultado
        System.out.println("La energía cinética es: " + energiaCineticaResultante + " julios");
    }
}
