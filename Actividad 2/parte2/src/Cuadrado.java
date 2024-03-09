public class Cuadrado {
    int lado; // Atributo que define el lado de un cuadrado

    // Constructor que recibe el lado de un cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Metodos para calcular el area de un cuadrado
    public double CalcularArea() {
        return lado*lado;
    }

    // Metodo para calcular el perimetro de un cuadrado
    public double CalcularPerimetro() {
        return (4*lado);
    }
}