package org.example.desafios;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        String frase = "";
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = scanner.nextLine();

        StringBuilder buffer = new StringBuilder();

        for (int i = frase.length() - 1;i >=0; i--){
            buffer.append(frase.charAt(i));
        }
        System.out.println(buffer);
    }
}
