package udla.druiz.abstraccion_herencia.modelo;

public class Paperr extends Leaf {
    private String autoOr;
    private String editoOr;


    //super: de la super clase, hereda el contenido de los atributos de la clase padre/super
    //con la palabra resevada final, ya no puedo usar abstractos :(
    public Paperr(String autoOr, String editoOr, String content) {
        super(content); //si el cosntructor de la clase padre esta vacio, no hace falta esta vaina
        //si tengo un constructor en la main que reciba uno o mas parametros, se debe poner el contructor en las hijas
        this.autoOr = autoOr;
        this.editoOr = editoOr;
    }

    @Override //existe un metodo al cual voy a reeutilizar segun lo que ocupe
    public String printt() {
        return "Informe escrito por: " + this.autoOr +
                "\nRevisado por: " + this.editoOr +
                "\n" + this.content; //se puede usar porque es protected
    } //clic derecho, generar, metodo
}
