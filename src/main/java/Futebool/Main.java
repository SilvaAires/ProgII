package Futebool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Jogo j[] = new Jogo[20];
        Jogo a = new Jogo();
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n------------------ MENU -----------------");
            System.out.println("-----------------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Gravar os resultados dos jogos: ");
            System.out.println("-> 2 - Imprimir o resultados dos jogos: ");
            System.out.println("-> 3 - Sair ");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {

                case 1:
                    if (a.getLimite() <= 20) {
                        for (int i = 0; i < j.length; i++) {
                            if (j[i] == null) {
                                j[i] = new Jogo();
                            }
                            e = new Scanner(System.in);
                            System.out.println("Nome do Time da casa: ");
                            j[i].setTimeCasa(e.nextLine());
                            System.out.println("Nome do Time visitante: ");
                            j[i].setTimeVisitante(e.nextLine());
                            System.out.println("Gols marcados da casa: ");
                            j[i].setGolsCasa(e.nextLine());
                            System.out.println("Gols marcados pelo visitante: ");
                            j[i].setGolsVisitante(e.nextLine());
                            j[i].ResultadosGravar();
                        }
                    }

                    break;

                case 2:
                    //for (int i = 0; i < 1; i++) {
                    if (a.vazia() == false) {
                        a.ler();
                    } else {
                        System.out.println("Esta Vazio");
                    }
                    //}
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpação inválida\n");
                    break;
            }
        }
    }
}
