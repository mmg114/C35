package clase4;

public class Main {

    public static void main(String[] args) {
        int edad=12;
        Estudiante estudiante= new Estudiante(21,"Mauricio","Guzman",2000L,"Ingenieria de sistemas",'M');
        Estudiante estudiante2= new Estudiante();
        Estudiante estudiante3= new Estudiante("Wendy","Sierra");

        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());

        Colombiano mauricio = new Colombiano(1144765968L,"Mauricio","Guzman" );
        mauricio.setApellido("Muñoz");
        mauricio.setNombre("Carlos");
        System.out.println(mauricio.getNumeroDeCedula());
        System.out.println(mauricio.getNombre());
    }

}
