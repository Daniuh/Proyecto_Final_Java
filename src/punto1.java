import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double dato1 = numero1.nextDouble();
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo numero");
        double dato2 = numero2.nextDouble();
        if(dato1 > dato2){
            System.out.println("El dato: "+dato1+" es el numero mayor.");
        }else if (dato2 > dato1){
            System.out.println("El dato: "+dato2+" es el numero mayor.");
        }else if (dato1 == dato2){
            System.out.println("Los numeros son iguales.");
        }else {
            System.out.println("Los datos ingresados no son validos");
        }
    }

}
