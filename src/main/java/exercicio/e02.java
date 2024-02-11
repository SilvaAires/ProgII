package exercicio;

import java.util.Scanner;

/*Escrever um algoritmo, utilizando switch case, que leia um código e três valores: a, b e c. 
Os códigos válidos são 1, 2, 3 e 4. Se o código for diferente destes, apresentar a mensagem "CÓDIGO INVÁLIDO" e
terminar o programa.- código = 1: multiplicar os três valores; - código = 2: somar os três valores;
- código = 3: subtrair os três valores; - código = 4: somar o quadrado dos 3 valores;*/
public class e02 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite um valor pra a: ");
        int a = e.nextInt();
        System.out.println("Digite um valor pra b: ");
        int b = e.nextInt();
        System.out.println("Digite um valor pra c: ");
        int c = e.nextInt();
        while (opcao != 4) {
            System.out.println("-> - código = 1: multiplicar os três valores");
            System.out.println("-> - código = 2: somar os três valores");
            System.out.println("-> - código = 3: subtrair os três valores");
            System.out.println("-> - código = 4: somar o quadrado dos 3 valores");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Multiplicação: " + (a * b * c));
                    break;
                case 2:
                    System.out.println("Soma: " + (a + b + c));
                    break;
                case 3:
                    System.out.println("Subtração: " + (a - b - c));
                    break;
                case 4:
                    System.out.println("Somar o quadrado dos 3 valores: " + ((a*a)+ (b*b) + (c*c)));
                    break;
                default:
                    System.out.println("\nOpação inválida\n");
                    break;
            }
        }
    }
}
