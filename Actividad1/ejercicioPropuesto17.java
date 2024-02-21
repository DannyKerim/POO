//Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia. 
import java.util.Scanner;
public class ejercicioPropuesto17 {
    public static void main(String[] args) {
        // Declaración de variables
        double radio, area, longitud;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el radio
        System.out.print("Ingresa el radio del círculo: ");
        radio = scanner.nextDouble();

        // Cálculos
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        // Mostramos los resultados redondeados a 2 decimales
        System.out.println("El área del círculo es: " + String.format("%.2f", area));
        System.out.println("La longitud de la circunferencia es: " + String.format("%.2f", longitud));
    }
}
