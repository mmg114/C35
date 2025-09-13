package clase5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int edad=0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite su edad");
//
//        edad = scanner.nextInt();
//
//        if (edad>= 18 && edad <80){
//            System.out.println("puede entrar al bar");
//        }else{
//            System.out.println("Eres menor de edad");
//        }
//        scanner.close();

        System.out.println("---------------------------------");

        int diaDeLaSemana = 45;

        switch (diaDeLaSemana){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes ");
                break;
            default:
                System.out.println("Es otro dia ");
                break;
        }

    }
}
