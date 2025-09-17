package claseFinal;

import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(claseFinal.Main.class.getName());
    public static void main(String[] args) {

        Dia hoy = Dia.MARTES;

        switch (hoy){
            case LUNES -> System.out.println("Inicio de semana");
            case MARTES-> System.out.println("Un dia mas, falta poco para que acabe");
            case DOMINGO-> System.out.println("Ya inicia de nuevo");
            default -> System.out.println("otro dia mas");

        }

        log.info("Usuario registrado");
        log.info("200-ID:USUARIO");
        log.info("Usuario registrado exitosamente");


    }
}
