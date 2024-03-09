public class Rombo {
    // Atributos que definen las diagonales y el lado de un rombo
    double diagonalMayor;
    double diagonalMenor;
    double lado;

    // Constructor que recibe las diagonales y el lado de un rombo
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    // Metodo para calcular el area de un rombo
    public double CalcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Metodo para calcular el perimetro de un rombo
    public double CalcularPerimetro() {
        return 4 * lado;
    }
}