import java.util.Scanner;

public class punto15 {
    public static void main(String[] args) {
        Scanner hola = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

                System.out.println("Introduce un numero: ");
                opcion = hola.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Esta es la opción 1: Nuevo actor.");
                case 2 -> System.out.println("Esta es la opción 2: Buscar actor.");
                case 3 -> System.out.println("Esta es la opción 3: Eliminar actor.");
                case 4 -> System.out.println("Esta es la opción 4: Modificar actor.");
                case 5 -> System.out.println("Esta es la opción 5: Ver todos los actores.");
                case 6 -> System.out.println("Esta es la opción 6: Ver peliculas de los actores.");
                case 7 -> System.out.println("Esta es la opción 7: Ver categoria de las peliculas de los actores.");
                case 8 -> salir = true;
                default -> System.out.println("Las opciones son entre 1 y 8");
            }
        }
        System.out.println("Fin del menu");

    }
}
