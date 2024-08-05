package logica;
public class Ecuacion {
    public double a;public double b;public double c;
    public double discriminante;
    public double x1R;public double x2R;public double xI;
    //Constructor
    public Ecuacion(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        discriminante = b * b - (4 * a * c);
        if (discriminante >= 0) {
            // Dos soluciones reales 
            x1R = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2R = (-b - Math.sqrt(discriminante)) / (2 * a);
            xI = 0;
        } else {
            // Soluciones imaginarias
            x1R = (-b) / (2 * a);
            x2R = x1R;
            xI = Math.sqrt(-discriminante) / (2 * a);
        }
    }
}
