package udla.druiz.herencia;

public class Alumno extends Persona5{
    private String carrera;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    public Alumno(String nombree, String lastnombree){
        super(nombree, lastnombree);
    }
}
