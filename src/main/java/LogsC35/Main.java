package LogsC35;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        int edad=22;

        if (edad >18) {
            log.info("es mayor de edad");
            throw new RuntimeException("ES Mayor de edad");
        }else{
            log.info("es menor de edad");
        }
        Errores error = Errores.ERROR_EN_DIVICION_POR_0;

        try {
            int resultado=   dividir(10,0);
            log.info("Esto es el resultado "+resultado);

        }catch (Exception e){
            log.log(Level.SEVERE,error.name() +e.getCause());
        }
        //DATOS FECHA

        System.out.println(new Date());
        System.out.println(LocalDateTime.now());
        System.out.println(Calendar.getInstance());

        LocalDate localDate = LocalDate.now();

        System.out.println(    localDate.getMonthValue());

        System.out.println(localDate.plusDays(4));
        System.out.println(localDate.minusDays(18));


        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(format));

    }

    private static int dividir(int num1, int num2) {
        return num1/num2;
    }
}
