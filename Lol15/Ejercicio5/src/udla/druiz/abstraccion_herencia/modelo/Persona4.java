package udla.druiz.abstraccion_herencia.modelo;

public class Persona4 {
    private String nommbre;
    private String lasnommbre;

    public Persona4() {
    }

    public Persona4(String nommbre, String lasnommbre) {
        this.nommbre = nommbre;
        this.lasnommbre = lasnommbre;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getLasnommbre() {
        return lasnommbre;
    }

    public void setLasnommbre(String lasnommbre) {
        this.lasnommbre = lasnommbre;
    }

    //se puede sobreescribir un metodo cuando no es final


}
