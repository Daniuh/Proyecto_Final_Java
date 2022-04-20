public class punto5 {
    public static void main(String[] args) {
        /*
        Este primer while imprime los números del 1 al 100.
        Haciendo alusión a imprimir números impares y pares.
         */
        int numero = 1;
        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }
    }
}
/*
Esta siguiente linea de código imprime solamente los numero pares
        int numero = 1;
        while (numero <= 100) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }
    }
 */
/*
Esta siguiente linea de código imprime solamente los numero impares
    int numero = 1;
    while(numero <= 100){
    if(numero % 2 != 0) {
        System.out.println(numero);
       }
    numero++;
    }
 }
 /*
El siguiente código ya lo que hace, es que le da al usuario la oportunidad de que le imprima o los numero pares o los impares del 1 al 100.

 public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        int numeroElegido;

        int numero = 1;



        do{

            System.out.println("Pulse 1 para imprimir los números pares o"

                    + " pulse 2 para imprimir los números impares: ");

            numeroElegido = miScanner.nextInt();

            if(numeroElegido == 1){

                while(numero <= 100){

                    if(numero % 2 == 0){

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

            if(numeroElegido == 2){

                while(numero <= 100){

                    if(numero % 2 != 0) {

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

        }while(numeroElegido != 1 && numeroElegido != 2);

    }
 */


