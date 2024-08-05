package logica;
public class Circulo {
    float radio; // Atributo que define el radio de un círculo
    // Constructor que recibe el radio de un círculo
    public Circulo(float radio) {
        this.radio = radio;
    }
    // Metodo para calcular el area de un circulo
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    // Metodo para calcular el perimetro de un circulo
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
