package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mapa de caracteres ASCII a código Morse
        HashMap<Character, String> asciiToMorse = new HashMap<>();
        asciiToMorse.put('A', ".-");
        asciiToMorse.put('B', "-...");
        asciiToMorse.put('C', "-.-.");
        asciiToMorse.put('D', "-..");
        asciiToMorse.put('E', ".");
        asciiToMorse.put('F', "..-.");
        asciiToMorse.put('G', "--.");
        asciiToMorse.put('H', "....");
        asciiToMorse.put('I', "..");
        asciiToMorse.put('J', ".---");
        asciiToMorse.put('K', "-.-");
        asciiToMorse.put('L', ".-..");
        asciiToMorse.put('M', "--");
        asciiToMorse.put('N', "-.");
        asciiToMorse.put('O', "---");
        asciiToMorse.put('P', ".--.");
        asciiToMorse.put('Q', "--.-");
        asciiToMorse.put('R', ".-.");
        asciiToMorse.put('S', "...");
        asciiToMorse.put('T', "-");
        asciiToMorse.put('U', "..-");
        asciiToMorse.put('V', "...-");
        asciiToMorse.put('W', ".--");
        asciiToMorse.put('X', "-..-");
        asciiToMorse.put('Y', "-.--");
        asciiToMorse.put('Z', "--..");
        asciiToMorse.put('1', ".----");
        asciiToMorse.put('2', "..---");
        asciiToMorse.put('3', "...--");
        asciiToMorse.put('4', "....-");
        asciiToMorse.put('5', ".....");
        asciiToMorse.put('6', "-....");
        asciiToMorse.put('7', "--...");
        asciiToMorse.put('8', "---..");
        asciiToMorse.put('9', "----.");
        asciiToMorse.put('0', "-----");
        asciiToMorse.put(' ', "/");

        // Escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase para traducir a Morse:");
        String input = scanner.nextLine().toUpperCase();

        StringBuilder morseTranslation = new StringBuilder();

        // Traducción de la frase a Morse
        for (char c : input.toCharArray()) {
            if (asciiToMorse.containsKey(c)) {
                morseTranslation.append(asciiToMorse.get(c)).append(" ");
            } else {
                morseTranslation.append("? "); // Caracter desconocido
            }
        }

        System.out.println("Traducción a Morse:");
        System.out.println(morseTranslation.toString().trim());
    }
}