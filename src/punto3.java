import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingresa el radio");
        String radioString = dato1.nextLine();
        double radio = Double.parseDouble(radioString);
        System.out.println("El área del circulo es: "+Math.PI * Math.pow (radio, 2));
    }
}
