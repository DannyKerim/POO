public class Rombo {
    double diagonalMayor;
    double diagonalMenor;
    double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double CalcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double CalcularPerimetro() {
        return 4 * lado;
    }
}