package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mapas para la traducción Morse <-> ASCII
        HashMap<String, String> morseToAscii = new HashMap<>();
        HashMap<String, String> asciiToMorse = new HashMap<>();

        // Rellenar los mapas
        morseToAscii.put(".-", "A");
        morseToAscii.put("-...", "B");
        morseToAscii.put("-.-.", "C");
        morseToAscii.put("-..", "D");
        morseToAscii.put(".", "E");
        morseToAscii.put("..-.", "F");
        morseToAscii.put("--.", "G");
        morseToAscii.put("....", "H");
        morseToAscii.put("..", "I");
        morseToAscii.put(".---", "J");
        morseToAscii.put("-.-", "K");
        morseToAscii.put(".-..", "L");
        morseToAscii.put("--", "M");
        morseToAscii.put("-.", "N");
        morseToAscii.put("---", "O");
        morseToAscii.put(".--.", "P");
        morseToAscii.put("--.-", "Q");
        morseToAscii.put(".-.", "R");
        morseToAscii.put("...", "S");
        morseToAscii.put("-", "T");
        morseToAscii.put("..-", "U");
        morseToAscii.put("...-", "V");
        morseToAscii.put(".--", "W");
        morseToAscii.put("-..-", "X");
        morseToAscii.put("-.--", "Y");
        morseToAscii.put("--..", "Z");
        morseToAscii.put(".----", "1");
        morseToAscii.put("..---", "2");
        morseToAscii.put("...--", "3");
        morseToAscii.put("....-", "4");
        morseToAscii.put(".....", "5");
        morseToAscii.put("-....", "6");
        morseToAscii.put("--...", "7");
        morseToAscii.put("---..", "8");
        morseToAscii.put("----.", "9");
        morseToAscii.put("-----", "0");
        morseToAscii.put("/", " "); // Separador de palabras

        // Invertir morseToAscii para obtener asciiToMorse
        for (String key : morseToAscii.keySet()) {
            asciiToMorse.put(morseToAscii.get(key), key);
        }

        // Escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Traducir de ASCII a Morse");
        System.out.println("2. Traducir de Morse a ASCII");
        System.out.print("Introduce tu opción (1 o 2): ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (opcion == 1) {
            // Traducción de ASCII a Morse
            System.out.print("Introduce un mensaje en texto ASCII: ");
            String asciiInput = scanner.nextLine().toUpperCase();

            StringBuilder morseMessage = new StringBuilder();
            for (char c : asciiInput.toCharArray()) {
                String morse = asciiToMorse.get(String.valueOf(c));
                if (morse != null) {
                    morseMessage.append(morse).append(" ");
                } else {
                    morseMessage.append("? "); // Caracter desconocido
                }
            }
            System.out.println("El mensaje en Morse es: " + morseMessage.toString().trim());
        } else if (opcion == 2) {
            // Traducción de Morse a ASCII
            System.out.print("Introduce un mensaje en código Morse (separado por espacios): ");
            String morseInput = scanner.nextLine();

            String[] morseArray = morseInput.split(" ");
            StringBuilder asciiMessage = new StringBuilder();
            for (String morse : morseArray) {
                String ascii = morseToAscii.get(morse);
                if (ascii != null) {
                    asciiMessage.append(ascii);
                } else {
                    asciiMessage.append("?"); // Código Morse desconocido
                }
            }
            System.out.println("El mensaje en ASCII es: " + asciiMessage.toString());
        } else {
            System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
        }

        scanner.close();
    }
}