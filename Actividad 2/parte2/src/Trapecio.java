public class Trapecio {
    double baseMayor;
    double baseMenor;
    double altura;
    double lado1;
    double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double CalcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double CalcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}