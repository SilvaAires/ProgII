package exercicio;

import java.util.Scanner;

/*Faça um algoritmo que faça a leitura de um número indeterminado de valores de 
vendas (sendo o máximo de 10 vendas). A cada venda o programa deve perguntar "Outra Venda(S/N)?", 
e encerrar quando for digitado "N" ou o limite máximo de vendas for atingido. 
Após finalizar as leituras de vendas o programa deve imprimir: Número de vendas realizadas: 
Valor total de vendas do dia: Valor médio das vendas: Venda de maior valor:*/
public class e04 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        String a = "";
        int aux = 0;
        double vetor [] = new double [10];
        while ((!a.equalsIgnoreCase("N")) ||(aux == 10)){
            System.out.println("Outra Venda(S/N)?");
            a = e.next();
            if ((a.equalsIgnoreCase("S"))){
                System.out.println("Valor da venda: ");
                vetor[aux] = e.nextDouble();
                aux ++;
            }else{
                System.out.println("Saiu");
            }
        }
        double soma = 0;
        double med = 0;
        double maior = 0;
        for ( int i = 0; i < vetor.length; i++){
            soma += vetor[i];
            med = soma/aux;
            if (vetor[i]>maior){
                maior = vetor[i];
            }
        }
        System.out.println("Número de vendas realizadas: " + aux); 
        System.out.println("Valor total de vendas do dia: " + soma); 
        System.out.println("Valor médio das vendas: " + med);
        System.out.println("Venda de maior valor: " + maior);
    }
}
