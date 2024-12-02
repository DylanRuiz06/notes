package udla.druiz.abstraccion_herencia;
import udla.druiz.abstraccion_herencia.modelo.*;

//las clases abstractas no se pueden instanciar pero si heredar
//abstracta: metodos abstractos o no, atributos - los metodos se relacionan
//interface: no puede tener atributos, solo puede tener metodos abstractos, no hay herencia, existe herencia solo entre interfaces - los metodos no siempre tienen porque relacionarse
//en un diagrama cuando se generliza es por la herencia
//los metodos abstractos no son implementados en la clase abstracta, solo en la clase donde se implementa
//Cada clase usa el metodo a su manera - polimorismo - sobrecarga

public class Mainmain {
    public static void main(String[] args) {
        Curriqbo cv = new Curriqbo("Dylan Ruiz", "Software", "Resumen Laboral :(");
        cv.xp("No hay :(");
        cv.xp("Minecraft"); // recursividad
        cv.xp("Genshin impact");
        cv.xp("Honkai SR");
        cv.xp("Lol (En proceso desde 2016)");
        Paperr paperr = new Paperr( "No Se", "La Agencia", "Contenido: " + "Lol");
        printt(cv); //metodo abstracto con polimorfismo
        printt(paperr); //polimorfismo
    }
    Ellivro ellivro = new Ellivro(new Persona4("ElRich", "MC"), "El Señor de la Bedrock", genero.Seinen);

    public static void printt(Leaf imprimi){//debido a que es una clase abrstracta ocupo un metodo
        System.out.println(imprimi.printt());
    }
}
