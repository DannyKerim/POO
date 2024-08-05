package logica;
public class Cuadrado {
    float lado; // Atributo que define el lado de un cuadrado
    // Constructor que recibe el lado de un cuadrado
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    // Metodos para calcular el area de un cuadrado
    public double calcularArea() {
        return lado*lado;
    }
    // Metodo para calcular el perimetro de un cuadrado
    public double calcularPerimetro() {
        return (4*lado);
    }
}
