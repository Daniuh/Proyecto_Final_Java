import java.util.Scanner;

public class punto7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero");
            numero = dato.nextInt();
        } while (numero <= 0);
        System.out.println(numero);
        dato.close();
    }
}
