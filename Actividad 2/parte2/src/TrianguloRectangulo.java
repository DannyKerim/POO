public class TrianguloRectangulo {
    int base; // Atributo que define la base de un triangulo rectangulo
    int altura; // Atributo que define la altura de un triangulo rectangulo

    // Constructor que recibe la base y la altura de un triangulo rectangulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo que calcula el area de un triangulo rectangulo
    public double CalcularArea() {
        return (base * altura / 2);
    }

    // Metodo que calcula el perimetro de un triangulo rectangulo
    public double CalcularPerimetro() {
        return (base + altura + CalcularHipotenusa()); /* Invoca al metodo calcular hipotenusa */
    }

    // Metodo que calcula la hipotenusa de un triangulo rectangulo
    public double CalcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    // Metodo que determina el tipo de triangulo rectangulo
    public void DeterminarTipoTriangulo() {
        if ((base == altura) && (base == CalcularHipotenusa()) && (altura == CalcularHipotenusa()))
            System.out.println("Es un triángulo equilátero"); // Todos sus lados son iguales
        else if ((base != altura) && (base != CalcularHipotenusa()) && (altura != CalcularHipotenusa()))
            System.out.println("Es un triángulo escaleno"); // Todos sus lados son diferentes
        else
            System.out.println("Es un triángulo isósceles"); // De otra manera, es isosceles
    }
}


    