// Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.
public class ejercicioPropuesto12 {
    public static void main(String[] args) {
        // Declaración de variables
        double horasTrabajadas = 48;
        double valorHora = 5000;
        double porcentajeRetencion = 12.5;
        double salarioBruto, retencionFuente, salarioNeto;

        // Cálculos
        salarioBruto = horasTrabajadas * valorHora;
        retencionFuente = (salarioBruto * porcentajeRetencion) / 100;
        salarioNeto = salarioBruto - retencionFuente;

        // Resultados
        System.out.println("El salario bruto del trabajador es: " + salarioBruto);
        System.out.println("La retención en la fuente es: " + retencionFuente);
        System.out.println("El salario neto del trabajador es: " + salarioNeto);
    }
}
