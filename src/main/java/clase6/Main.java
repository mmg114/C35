package clase6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numero =2;
        System.out.println(numero);
        String[] nombres= new String[11];
        System.out.println(nombres.length);


        nombres[0]="Mauricio";
        nombres[3]="carlos";
        nombres[5]="Carolina";
        nombres[6]="Elkin";
        nombres[9]="Edison";
        nombres[10]="Diana";
        Arrays.stream(nombres).forEach(System.out::println);

        System.out.println("----------------------------------");
        //ASI SE CREA UNA LISTA<ACA VA EL TIPO DE DATO>
        List<String> nombreLista = new ArrayList<>();
        nombreLista.add("Mauricio");
        nombreLista.add("carlos");
        nombreLista.forEach(System.out::println);

        System.out.println(nombreLista.stream().filter(n-> n.contains("M")).count());



    }
}
