package udla.druiz.abstraccion_herencia.modelo;

public class Pagg extends Leaf{
    //constructor
    public Pagg(String content) {
        super(content);
    }
    //metodo abstracto
    @Override
    public String printt() {
        return.this.content;
    }
}
