import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu peso:");
        var weight = scanner.nextFloat();
        System.out.println("Informe sua altura:");
        var height = scanner.nextFloat();
        //System.out.printf("Altura: %s m e peso: %s kg \n" , height, weight);
        var imc = weight / (height * height);
        //System.out.printf("Seu IMC e: %.2f \n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III (Morbida)");
        }

        
    }

    /*
     Escreva um codigo onde o usuario entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado: 

     - se for menor ou igual a 18,5 "Abaixo do peso";
     - se for entre 18,6 e 24,9 "Peso ideal";
     - se for entre 25,0 e 29,9 "Levemente acima do peso";
     - se for entre 30,0 e 34,9 "Obesidade grau I"
     - se for entre 35,0 e 39,9 "Obesidade grau II (Severa)"
     - se for maior que 40,0 "Obesidade grau III (Morbida)"
     */
}
