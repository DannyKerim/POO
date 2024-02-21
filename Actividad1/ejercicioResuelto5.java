public class ejercicioResuelto5 {
    public static void main(String[] args) {
        // Declaración de variables
        double suma = 0;
        double x = 20;
        double y = 40;

        // Operaciones
        suma = suma + x;
        x = x + Math.pow(y, 2);
        suma = suma + x/y;

        //Mostar resultado
        System.out.println("El valor de la suma es: " + suma);
    }
}
