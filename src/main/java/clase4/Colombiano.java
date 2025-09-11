package clase4;

public class Colombiano {

    private Long numeroDeCedula;
    private String nombre;
    private String apellido;

    public Colombiano() {
    }

    public Colombiano(Long numeroDeCedula, String nombre, String apellido) {
        this.numeroDeCedula = numeroDeCedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
