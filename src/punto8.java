import java.util.Scanner;

public class punto8 {
    public static void main(String[] args) {
        Scanner semana = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana");
        String dia = semana.next();

        switch (dia) {
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> System.out.println("Es un dia laboral");
            case "Sabado", "Domingo" -> System.out.println("Es un dia festivo");
            default -> System.out.println("Introduce un dia de la semana y si lo hiciste, revisa que la inicial sea en mayúscula y lo demás en minúscula");
        }
        semana.close();
    }
}
