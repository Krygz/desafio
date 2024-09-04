package org.example.desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int prev= 0 , curr = 1 , sum , digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que você quer saber se pertence a sequencia de Fibonacci:");
        digit = sc.nextInt();
        for(int i = 0; i < 500; i++){
            sum = prev + curr;
            prev = curr;
            curr = sum;
            if (digit == prev || digit == curr){
                System.out.println("O numero informado pertence a sequencia de Fibonacci");
            break;
            }
            if(i == 499){
                System.out.println("o numero informado não pertence a sequencia de Fibonacci");
            break;
            }
        }
    }
}
