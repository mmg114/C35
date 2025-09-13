package clase6;

import java.util.ArrayList;
import java.util.List;

public class MainCiclos {
    public static void main(String[] args) {

        int contador =0;

        while (contador<=5){
            System.out.println(contador);
            contador++;
        }

        contador =0;

        do {
            System.out.println(contador);
            contador++;
        } while (contador<=5);
        System.out.println("----------------");


        List<String> nombreLista = new ArrayList<>();
        nombreLista.add("Mauricio");
        nombreLista.add("carlos");
        nombreLista.add("Juan");
        nombreLista.add("Pedro");
        int[] numeros= new int[3];

        System.out.println("El tamaño es de: "+nombreLista.size());
        System.out.println("El tamaño es de: "+ numeros.length);
        System.out.println("----------------");
        //TODO ESTE ES EL FOR MAS LARGO Y ESPECIFICO
        for (int cont = 0; cont < nombreLista.size() ; cont+=2) {
            System.out.println(nombreLista.get(cont));

        }

        System.out.println("----------------");
       for(String tmp:nombreLista){
           System.out.println(tmp);
        }


    }



}
