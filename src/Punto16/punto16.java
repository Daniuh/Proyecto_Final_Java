package Punto16;

import java.util.Locale;
import java.util.Scanner;

public class punto16 {
    public static class PersonaApp_Scanner {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            sc.useLocale(Locale.US);

            //Introducimos los datos
            System.out.println("Introduce el nombre");
            String nombre = sc.next();

            System.out.println("Introduce la edad");
            int edad = sc.nextInt();

            System.out.println("Introduce el sexo");
            char sexo = sc.next().charAt(0);

            System.out.println("Introduce el peso");
            double peso = sc.nextDouble();

            System.out.println("Introduce la altura");
            double altura = sc.nextDouble();

            //Creamos objetos con cada constructor
            Persona persona1 = new Persona();
            Persona persona2 = new Persona(nombre, edad, sexo);
            Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

            //Los datos que no estén completos los insertamos con los métodos set
            persona1.setNombre("Fernanda");
            persona1.setEdad(20);
            persona1.setSexo('M');
            persona1.setPeso(65);
            persona1.setAltura(1.67);

            persona2.setPeso(90.5);
            persona2.setAltura(1.80);

            //Usamos métodos para realizar la misma acción para cada objeto
            System.out.println("Persona1");
            MuestraMensajePeso(persona1);
            MuestraMayorDeEdad(persona1);
            System.out.println(persona1.toString());

            System.out.println("Persona2");
            MuestraMensajePeso(persona2);
            MuestraMayorDeEdad(persona2);
            System.out.println(persona2.toString());

            System.out.println("Persona3");
            MuestraMensajePeso(persona3);
            MuestraMayorDeEdad(persona3);
            System.out.println(persona3.toString());
        }

        public static void MuestraMensajePeso(Persona p) {
            int IMC = p.calcularIMC();
            switch (IMC) {
                case Persona.PESO_IDEAL -> System.out.println("La persona esta en su peso ideal");
                case Persona.PESO_BAJO -> System.out.println("La persona esta por debajo de su peso ideal");
                case Persona.SOBREPESO -> System.out.println("La persona esta por encima de su peso ideal");
                default -> System.out.println("I.M.C sin reconocer");
            }
        }

        public static void MuestraMayorDeEdad(Persona p) {

            if (p.esMayorDeEdad()) {
                System.out.println("La persona es mayor de edad");
            } else {
                System.out.println("La persona no es mayor de edad");
            }
        }

    }
}
class Persona {

    private final static char SEXO_DEFECTO = 'H';

    public static final int PESO_BAJO = -1;

    public static final int PESO_IDEAL = 0;

    public static final int SOBREPESO = 1;

    private String nombre;

    private int edad;

    private String DNI;

    private char sexo;

    private double peso;

    private double altura;

    public Persona() {
        this("", 0, SEXO_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    private void comprobarSexo() {

        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFECTO;
        }
    }

    private void generarDni() {
        final int divisor = 23;

        int numeroDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numeroDNI - (numeroDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);

        DNI = Integer.toString(numeroDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Según el peso, devuelve un código
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return PESO_BAJO;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = edad >= 18;
        return mayor;
    }

    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Información de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}

