package logica;
public class Estudiante {
    public String numInscripcion;
    public String nombres;
    public double matricula;
    double matriculaBase = 50000;
    //Constructor
    public Estudiante(String numInscripcion, String nombres, double estrato, double patrimonio){
        this.numInscripcion = numInscripcion;
        this.nombres = nombres;  
        if (estrato > 3 && patrimonio > 2000000){
            matricula = matriculaBase + 0.03*patrimonio;
        }else{
            matricula = matriculaBase;
        }
    }
}
