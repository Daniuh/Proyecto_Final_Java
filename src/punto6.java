import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {
        /*
        Igual que en el punto 5, en este primer metodo, lo que se hace es imprimir los numeros del 1 al 100.
        haciendo alusión de que se imprimen los números impares y pares.
         */
        int numero = 1;
        for (int i = 0; i <= 100; i ++){
            System.out.println(numero);
            numero++;
        }
    }
}

/*
Es este metodo, lo que hace es solo imprimir los numeros pares del 1 al 100

int numero = 1;
        for (int i = 0; i <= 100; i ++){
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }
 */
/*
Este siguiente metodo imprime solamente los numero impares del 1 al 100

int numero = 1;
        for (int i = 0; i <= 100; i ++){
            if(numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }

 */
/*
En el siguiente metodo ya lo que hace, es que le da al usuario la oportunidad de que imprima o los numero pares o los impares del 1 al 100.
Scanner miScanner = new Scanner(System.in);

        int numElegido;

        int numero = 1;



        do{

            System.out.println("Pulse 1 para imprimir los números pares o pulse 2 para imprimir los números impares: ");

            numElegido = miScanner.nextInt();

            if(numElegido == 1){

                for (int i = numero; i <= 100; i ++){

                    if(numero % 2 == 0){

                        System.out.println(numero);

                    }

                    numero++;

                }

            }

            if(numElegido == 2){

                for(int i = numero; i <= 100; i ++){

                    if(numero % 2 != 0) {

                        System.out.println(numero);

                    }

                    numero++;

                }

            }

        }while(numElegido != 1 && numElegido != 2);
 */
