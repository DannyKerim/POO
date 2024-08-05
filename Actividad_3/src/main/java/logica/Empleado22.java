package logica;
public class Empleado22 {
    public String nombre;
    public double salarioMensual;
    public double salarioHora;
    public double horas;
    //Constructor
    public Empleado22(String nombre, double salarioHora, double horas){
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horas = horas;
        salarioMensual = salarioHora*horas;
    }
}
