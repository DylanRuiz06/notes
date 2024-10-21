import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Mainmain {
    public static void main(String[] args) throws IOException {
        //instanciar:
        Loscarro carrillo = new Loscarro("BMW", "2Xd", "negro", 233);
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
    /*carrillo.setModelo("2Xd");
    carrillo.setColor("Blanco");
    carrillo.setCilindraje(4);*/
        //metodo para imprimir:
        System.out.println("Info: " + carrillo.verDetalle());
    /*set - get ó constructos con parametros, los dos estan bien, elegir el que mas te pinte
    otro obejto on las mismas carcateristicas pero no es igual al primero "carillo":     */
        String v1;
        System.out.println("Ingrese el modelo");
        v1 = rr.readLine();
        System.out.println("");
        carrillo.setModelo(v1);
        System.out.println("El modelo del auto es " + v1);

        int v2;
        System.out.println("Cilindraje: ");
        v2 = Integer.parseInt(rr.readLine());
        System.out.println("");
        carrillo.setCilindraje(Integer.parseInt(String.valueOf(String.valueOf(v2))));
        System.out.printf("Cilindraje " + v2);

        Loscarro carrillo2 = new Loscarro("BMW2",v1);
        //whitout set, de puro poner constructores
        carrillo2.setColor("Blanco");
        carrillo2.setCilindraje(v2);
        System.out.println("carrillo.verDetalle() = " + carrillo2.verDetalle());
        int cc=0;
        int lim;
        System.out.println("Ingrese le tope xd");
        Scanner ingreso = new Scanner(System.in);
        lim = ingreso.nextInt();
        while (cc <= lim){
            System.out.println("lol");
            cc +=1;
        }
    }


}
