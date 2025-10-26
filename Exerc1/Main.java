package Exerc1;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero:");
        var number = scanner.nextInt();
        //System.out.printf("O numero informado foi %s \n", number);

        for (var i = 1; i <= 10; i++) {
            System.out.printf("%s + %s = %s \n",number, i, i + number);
            
        }

        System.out.println("=============================");

        for (var i = 1; i <= 10; i++) {
            System.out.printf("%s - %s = %s \n",number, i, number - i);
        }

        System.out.println("=============================");

        for (var i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s \n",number, i, i * number);
        }

        System.out.println("=============================");

        for (float i = 1; i <= 10; i++) {
            System.out.printf("%s / %s = %s \n",number, i, number / i);
        }
            
    }

    /*
     Escreva um codigo onde o usuario entre com um numero e seja gerada a tabuada de 1 ate 10 desse numero
     */
}