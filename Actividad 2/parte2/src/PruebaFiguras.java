public class PruebaFiguras {

    // Metodo principal
    public static void main(String args[]) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    Rombo figura5 = new Rombo(8,4,5);
    Trapecio figura6 = new Trapecio(4,5,6,7,8);

    // Imprime el area y el perímetro de cada figura
    System.out.println("El area del circulo es = " + figura1.CalcularArea());
    System.out.println("El perimetro del circulo es = " + figura1.CalcularPerimetro());
    System.out.println();

    System.out.println("El area del rectangulo es = " + figura2.calcularArea());
    System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
    System.out.println();

    System.out.println("El area del cuadrado es = " + figura3.CalcularArea());
    System.out.println("El perimetro del cuadrado es = " + figura3.CalcularPerimetro());
    System.out.println();

    System.out.println("El area del triangulo es = " + figura4.CalcularArea());
    System.out.println("El perimetro del triangulo es = " + figura4.CalcularPerimetro());
    figura4.DeterminarTipoTriangulo();
    System.out.println();

    System.out.println("El area del rombo es = " + figura5.CalcularArea());
    System.out.println("El perimetro del rombo es = " + figura5.CalcularPerimetro());
    System.out.println();

    System.out.println("El area del trapecio es = " + figura6.CalcularArea());
    System.out.println("El perimetro del trapecio es = " + figura6.CalcularPerimetro());
    System.out.println();
    }
}