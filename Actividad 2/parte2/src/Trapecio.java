public class Trapecio {
    // Atributos que definen las caracteristicas de un trapecio
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    // Constructor que recibe las caracteristicas de un trapecio
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodo para calcular el area de un trapecio
    public double CalcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    // Metodo para calcular el perimetro de un trapecio
    public double CalcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}