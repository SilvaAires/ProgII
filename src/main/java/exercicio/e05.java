package exercicio;

import java.util.Scanner;

/*Escreva um algoritmo que leia uma distância em quilômetros, a categoria do veículo 
e imprima o consumo estimado de combustível, considere que um veículo tipo C faz 8km 
com um litro de combustível, um tipo B faz 14 km/L e o tipo A, 18 km/L.*/
public class e05 {
    public static void main(String []args){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite a distância em quilômetros: ");
        double d = e.nextDouble();
        System.out.println("Digite a categoria do veículo (C ou B ou A): ");
        String c = e.next();
        if((c.equalsIgnoreCase("C"))){
            System.out.println("Consumo estimado de combustível: " +(d/8));
        }else{
            if((c.equalsIgnoreCase("B"))){
                System.out.println("Consumo estimado de combustível: " +(d/14));
            }else{
                if((c.equalsIgnoreCase("A"))){
                    System.out.println("Consumo estimado de combustível: " +(d/18));
                }
            }System.out.println("Erro.");
        }
    }
}
