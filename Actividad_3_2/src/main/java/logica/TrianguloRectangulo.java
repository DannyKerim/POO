package logica;
public class TrianguloRectangulo {
    float base; // Atributo que define la base de un triangulo rectangulo
    float altura; // Atributo que define la altura de un triangulo rectangulo
    // Constructor que recibe la base y la altura de un triangulo rectangulo
    public TrianguloRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    // Metodo que calcula el area de un triangulo rectangulo
    public double calcularArea() {
        return (base * altura / 2);
    }
    // Metodo que calcula el perimetro de un triangulo rectangulo
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al metodo calcular hipotenusa */
    }
    // Metodo que calcula la hipotenusa de un triangulo rectangulo
    public double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    // Metodo que determina el tipo de triangulo rectangulo
    public String determinarTipoTriangulo() {
        String tipoTriangulo;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            tipoTriangulo = "Es un triángulo equilátero"; // Todos sus lados son iguales
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            tipoTriangulo = "Es un triángulo escaleno"; // Todos sus lados son diferentes
        else
            tipoTriangulo = "Es un triángulo isósceles"; // De otra manera, es isosceles
        return tipoTriangulo;
    }
}
