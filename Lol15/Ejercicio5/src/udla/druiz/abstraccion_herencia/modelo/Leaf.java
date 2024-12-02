package udla.druiz.abstraccion_herencia.modelo;

abstract public class Leaf {
    protected String content; //protected: manera de acceder a los atributos sin ocupar geter y seters

    public Leaf(String content) {
        this.content = content;
    }

    abstract public String printt(); // una clase abstracta puede o no tener metodos abstractos
    // si se crea un metdo abstract, la clase necesita se abstract


}

