package clase4;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int edad=12;
        edad=13;
        Estudiante estudiante= new Estudiante(21,"Mauricio","Guzman",2000L,"Ingenieria de sistemas",'M');
        Estudiante estudiante2= new Estudiante();
        Estudiante estudiante3= new Estudiante("Wendy","Sierra");

        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println("--------------------------------");
        Colombiano colombiano = new Colombiano(1144765968L,"Mauricio","Guzman" );
        colombiano.setApellido("Muñoz");
        colombiano.setNombre("Carlos");
        System.out.println(colombiano.getNumeroDeCedula());
        System.out.println(colombiano.getNombre() +"-"+ colombiano.getApellido());
        System.out.println("--------------------------------");
        Colombiano colombiano2 = new Colombiano();
        System.out.println(colombiano2.getNumeroDeCedula());
        System.out.println("--------------------------------");


        System.out.println(Estudiante.matricularse());
        Date date = new Date();
        System.out.println( date.toInstant());

        System.out.println(LocalDate.now());
    }

}
