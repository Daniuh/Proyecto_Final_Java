import java.util.Scanner;

public class punto8 {
    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana");
        String dia = semana.next();

        switch(dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Jiernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana y si lo hiciste, revisa que la inicial sea en mayuscula y lo demas en minuscula");
        }
    }
}
