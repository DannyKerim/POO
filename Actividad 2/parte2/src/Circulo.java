public class Circulo {
    int radio; // Atributo que define el radio de un círculo

    // Constructor que recibe el radio de un círculo
    Circulo(int radio) {
        this.radio = radio;
    }

    // Metodo para calcular el area de un circulo
    double CalcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    // Metodo para calcular el perimetro de un circulo
    double CalcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
