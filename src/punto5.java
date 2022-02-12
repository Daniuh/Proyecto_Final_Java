public class punto5 {
    public static void main(String[] args) {
        /*
        Este primer while imprime los numeros del 1 al 100.
        Haciendo alusión a imprimir numeros impares y pares.
         */
        int num=1;
        while (num<=100) {
            System.out.println(num);
            num++;
        }
    }
}
/*
Esta siguiente linea de codigo imprime solamente los numero pares
        int num = 0;
        while (num <= 100) {
            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
 */
/*
Esta siguiente linea de codigo imprime solamente los numero impares
    int numero = 0;
    while(numero <= 100){
    if(numero % 2 != 0) {
        System.out.println(numero);
       }
    numero++;
    }
 }
 /*
El siguiente codigo ya lo que hace, es que le da al usuario la oportunidad de que le imprima o los numero pares o los impares del 1 al 100.

 public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        int numElegido;

        int numero = 0;



        do{

            System.out.println("Pulse 1 para imprimir los números pares o"

                    + " pulse 2 para imprimir los números impares: ");

            numElegido = miScanner.nextInt();

            if(numElegido == 1){

                while(numero <= 100){

                    if(numero % 2 == 0){

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

            if(numElegido == 2){

                while(numero <= 100){

                    if(numero % 2 != 0) {

                    System.out.println(numero);

                    }

                    numero++;

                }

            }

        }while(numElegido != 1 && numElegido != 2);

    }
 */


