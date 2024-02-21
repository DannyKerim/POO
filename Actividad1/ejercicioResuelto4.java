//A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
import java.util.Scanner;

public class ejercicioResuelto4 {
    public static void main(String[] args) {
        // Declaración de variables
        double edadJuan, edadAlberto, edadAna, edadMama;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese la edad de Juan
        System.out.print("Ingresa la edad de Juan: ");
        edadJuan = scanner.nextDouble();
        
        // Calculamos la edad de cada uno basándonos en las proporciones dadas
        edadAlberto = 2 * (edadJuan / 3);
        edadAna = 4 * (edadJuan / 3);
        edadMama = edadJuan + edadAlberto + edadAna;

        // Mostramos las edades
        System.out.println("La edad de Juan es: " + edadJuan);
        System.out.println("La edad de Alberto es: " + edadAlberto);
        System.out.println("La edad de Ana es: " + edadAna);
        System.out.println("La edad de la mamá es: " + edadMama);

        // Cerramos el scanner
        scanner.close();
    }
}
