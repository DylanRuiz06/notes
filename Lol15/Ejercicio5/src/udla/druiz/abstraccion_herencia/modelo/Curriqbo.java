package udla.druiz.abstraccion_herencia.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curriqbo extends Leaf{
    private String persona5;
    private String carrera;
    private List<String> xp; //lista de java



    // ojo: el constructor y el metodo
    public Curriqbo(String persona5, String carrera, String content) {
        super(content);
        this.persona5 = persona5;
        this.carrera = carrera;
        this.xp = new ArrayList<>();
    }

    public Curriqbo xp(String xpp){
        xp.add(xpp);
        return this;
        //llamar a la clase y devolviendola, establecer la info, poniendo en la lista lo que se ocupe
        //hacer recursiva a la clase
    }

    @Override
    public String printt() {
        StringBuilder xd = new StringBuilder("El nombre: ");
        xd.append(persona5).append("\n")
                .append("Summary: ").append(this.content).append("\n")
                .append("Profesion: ").append(this.carrera).append("\n")
                .append("Experiencia: ").append("\n");
        for(String xpp:this.xp){ //una forma de recorrer una lista
            xd.append("- ").append(xpp).append("\n");
        }

        return xd.toString();
    }
}
