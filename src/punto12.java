import java.util.Scanner;

public class punto12 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        String frase1 = palabras.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String frase2 = palabras.nextLine();
        if ((frase1.compareTo(frase2)) == 0) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("No son iguales, revisa bien las palabras");
        }
        palabras.close();
    }
}