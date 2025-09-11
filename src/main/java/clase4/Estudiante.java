package clase4;

public class Estudiante {

    private int edad;
    private String nombre;
    private String apellido;
    private Long id;
    private String curso;
    private char genero;
    public  String actividadesExtra;

    Estudiante(){

    }


    Estudiante(Long id, String apellido){
        this.apellido=apellido;
        this.id=id;
    }

    Estudiante(String nombre, String apellido){
        this.apellido=apellido;
        this.nombre=nombre;
    }


    Estudiante(int edad,String nombre, String apellido,Long id,String curso,char genero){
        this.apellido=apellido;
        this.edad=edad;
        this.nombre=nombre;
        this.id=id;
        this.curso=curso;
        this.genero=genero;
    }

    public boolean estudiar(){
        return true;
    }

    public static String matricularse(){
        return "El estudiante se matriculo con éxito.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
