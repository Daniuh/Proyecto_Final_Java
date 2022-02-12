public class punto1 {
    public static void main(String[] args) {
        //Se declaran como double, por si el dato que se quiere con parte fraccionaria.
        double dato1 = 15;
        double dato2 = 15;
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
