package clase7;


import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {


          Animal animal = new Animal("Animalito");
            Gato    gato = new Gato("MICHI");
            Perro perro  = new Perro("FIRULAIS");

        System.out.println(gato.nombre);
            animal.hacerSonido();
            gato.hacerSonido();
            perro.hacerSonido();

    }
}
