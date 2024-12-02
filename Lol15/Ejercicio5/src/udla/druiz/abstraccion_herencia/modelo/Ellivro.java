package udla.druiz.abstraccion_herencia.modelo;

import java.util.ArrayList;
import java.util.List;

public class Ellivro {
    private List<Leaf> paggs;
    private Persona4 aut0r;
    private String eltitu;
    private Gerero genero;

    public Ellivro(List<Leaf> paggs, Persona4 aut0r, String eltitu, Gerero genero) {
        this.aut0r = aut0r;
        this.eltitu = eltitu;
        this.genero = genero;
        this.paggs = new ArrayList<>();
    }
    public Ellivro addPagg(Leaf pagg){
        paggs.add(pagg);
        return this;
    }

    public String printt() {
        StringBuilder xd = new StringBuilder("Titulo : ");
        xd.append(this.eltitu).append("\n")
                .append("Autor: ").append(this.aut0r).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Leaf pagg : this.paggs) {
            xd.append(pagg.printt()).append("\n");
        }
        return xd.toString();
    }

}
