// Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo. 
import java.util.Scanner;
public class ejercicioPropuesto14 {
    public static void main(String[] args) {
        // Declaración de variables
        double numero, cuadrado, cubo;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el número
        System.out.print("Ingresa el número: ");
        numero = scanner.nextDouble();

        // Cálculos
        cuadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);

        // Mostramos los resultados
        System.out.println("El cuadrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);
    }
}
