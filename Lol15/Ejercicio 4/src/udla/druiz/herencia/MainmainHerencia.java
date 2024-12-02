package udla.druiz.herencia;

public class MainmainHerencia {
    public static void main(String[] args) {
        Persona5 persona5 = new Persona5("Dylan", "ruiz");
        Alumno alumno = new Alumno("Dylan", "ruiz");
        alumno.setNombree("Dylan");
        alumno.setLastnombree("Ruiz");
        alumno.setCarrera("Sofware");
        alumno.setEdadd(18);
        alumno.setMaill("dylan.ruiz@udla.edu.ec");
        alumno.setNota1(8D);
        alumno.setNota2(8D);
        alumno.setNota3(8D);
        System.out.println("Datos alumno");
        System.out.println("Nombre y apellido" + alumno.getNombree()+alumno.getLastnombree());
        AlumnoNoNacional alumnoNoNacional = new AlumnoNoNacional();
        
        Professor professor = new Professor();
    }
}
