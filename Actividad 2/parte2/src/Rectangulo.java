public class Rectangulo {
    int base; // Atributo que define la base de un rectangulo
    int altura; // Atributo que define la altura de un rectangulo
    
    // Constructor que recibe la base y la altura de un rectangulo
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
   
    // Metodo que calcula el area de un rectangulo
    public double calcularArea() {
        return base * altura;
    }
   
    // Metodo que calcula el perimetro de un rectangulo
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
