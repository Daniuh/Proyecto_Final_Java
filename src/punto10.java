import java.util.Scanner;

public class punto10 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = texto.nextLine();
        System.out.println(frase.replaceAll("\\s",""));
    }
}
