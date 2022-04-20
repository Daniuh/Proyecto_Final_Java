import java.util.HashMap;
import java.util.Scanner;

public class punto11 {
    public static void main(String[] args) {
        Scanner longitud = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = longitud.nextLine();
        long total = frase.chars().filter(ch -> ch != ' ').count();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
        for (int x = 0; x < frase.length(); x++) {
            char letraActual = frase.charAt(x);
            if (esVocal(letraActual)) {
                String clave = String.valueOf(letraActual).toLowerCase();
                hashMap.put(clave, hashMap.get(clave) + 1);
            }
        }
        System.out.printf("Resultados para '%s':\n", frase);
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("Y tiene una longitud la frase de: "+ total);
        longitud.close();
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
}

//Este punto lo realice con ayuda.