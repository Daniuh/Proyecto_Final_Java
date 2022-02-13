import java.util.Scanner;

public class punto14 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int respuesta = numero.nextInt();
        for (int i = respuesta; i <= 1000; i = i + 2){
            System.out.println(i);
        }
    }
}
