package exercicio;

public class e01 {
    public static void main (String []args){
        int vetor [] = {10,10,10,1,2};
        int soma = 0;
        for (int i = 0; i <vetor.length; i++){
            if (vetor[i] > 5){
                soma += vetor[i];
            }
        }
        System.out.println(soma);
    } 
}
