package Punto17;

public class Electrodomestico {

    protected final static String COLOR_DEFECTO = "blanco";

    protected final static char CONSUMO_ENERGETICO_DEF = 'F';

    protected final static double PRECIO_BASE_DEF = 100;

    protected final static double PESO_DEF = 5;

    protected double precioBase;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    private void comprobarColor(String color) {

        //Colores disponibles
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {

            if (colores[i].equals(color)) {
                encontrado = true;
                break;
            }

        }

        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_DEFECTO;
        }


    }

    public void comprobarConsumoEnergetico(char consumoEnergetico) {

        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        }

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double precioFinal() {
        double plus = 0;
        switch (consumoEnergetico) {
            case 'A' -> plus += 100;
            case 'B' -> plus += 80;
            case 'C' -> plus += 60;
            case 'D' -> plus += 50;
            case 'E' -> plus += 30;
            case 'F' -> plus += 10;
        }

        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }

    public Electrodomestico() {
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

}
