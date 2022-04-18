import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        double precio = numero.nextDouble();
        final double iva = (21 * precio) / 100;
        System.out.println("El iva del precio: " + precio + " es: "+iva);
    }
}
