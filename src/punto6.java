import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {
        /*
        Igual que en el punto 5, en este primer método, lo que se hace es imprimir los números del 1 al 100.
        Haciendo alusión de que se imprimen los números impares y pares.
         */
        int numero = 1;
        for (int i = 0; i <= 100; i ++){
            System.out.println(numero);
            numero++;
        }
    }
}

/*
Es este método, lo que hace es solo imprimir los números pares del 1 al 100

int numero = 1;
        for (int i = 0; i <= 100; i ++){
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }
 */
/*
Este siguiente método imprime solamente los numero impares del 1 al 100

int numero = 1;
        for (int i = 0; i <= 100; i ++){
            if(numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }

 */
/*
En el siguiente método ya lo que hace, es que le da al usuario la oportunidad de que imprima o los numero pares o los impares del 1 al 100.
Scanner miScanner = new Scanner(System.in);

        int numeroElegido;

        int numero = 1;



        do{

            System.out.println("Pulse 1 para imprimir los números pares o pulse 2 para imprimir los números impares: ");

            numeroElegido = miScanner.nextInt();

            if(numeroElegido == 1){

                for (int i = numero; i <= 100; i ++){

                    if(numero % 2 == 0){

                        System.out.println(numero);

                    }

                    numero++;

                }

            }

            if(numeroElegido == 2){

                for(int i = numero; i <= 100; i ++){

                    if(numero % 2 != 0) {

                        System.out.println(numero);

                    }

                    numero++;

                }

            }

        }while(numeroElegido != 1 && numeroElegido != 2);
 */
