package logica;
public class Salario {
    public double bruto;
    public double neto;
    //Constructor
    public Salario(double numeroHoras, double valorHora, double porcentaje){
         bruto = numeroHoras*valorHora;
         neto = bruto - (bruto*porcentaje/100);
    }
}

