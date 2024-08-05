package logica;
public class Triangulo {
    public double altura;
    public double area;
    public double perimetro;
    //Constructor
    public Triangulo(double valorLado){
         perimetro = 3*valorLado;
         area = Math.pow(valorLado, 2) * Math.sqrt(3) / 4;
         altura = valorLado * Math.sqrt(3) / 2;
    }
}
