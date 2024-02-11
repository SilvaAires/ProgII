package exercicio;

import java.util.Scanner;

/*Faça um programa que faz a leitura de uma matriz de 3 linhas e 4 colunas. Na matriz devem 
ser armazenados números inteiros. Após a leitura da matriz, 
leia um número inteiro e multiplique cada número da matriz por ele. Escreva a matriz resultante na tela.*/
public class e03 {
    public static void main(String []args){
        Scanner e = new Scanner (System.in);
        int matriz [][] = new int [3][4];
        for (int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.println("Digite um valor: ");
                matriz[i][j] = e.nextInt();
            }
        }
        for (int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
        System.out.println("Digite um número inteiro para multiplique cada número da matriz por ele");
        int mu = e.nextInt();
        for (int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                matriz[i][j] *= mu;
            }
        }
        for (int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
