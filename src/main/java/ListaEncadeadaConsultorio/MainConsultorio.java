package ListaEncadeadaConsultorio;

import java.util.Scanner;

public class MainConsultorio {
    static Scanner e = new Scanner(System.in);
            
    public static void main(String[] args) {
        Metodos met = new Metodos(); 
        int opcao = 0;
        while(opcao != 7) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Inserir e status dados da consulta.");// teria que implentar umm modo de escolha.
            System.out.println("-> 2 - Inserir e status dados da medico.");// teria que implentar umm modo de escolha.
            System.out.println("-> 3 - Inserir e status dados da paciente.");
            System.out.println("-> 4 - Inserir e status dados da anamnese.");
            System.out.println("-> 5 - Inserir e status dados da CID.");
            System.out.println("-> 6 - Inserir e status dados da especialidade.");
            System.out.println("-> 7 - Listar dados consulta.");
            System.out.println("-> 8 - Sair.");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
            
            case 1: 
                met.AmzCons();//id é auto incrementado.
                System.out.println("\nStatus\n");
                met.StatusCons();
                break;

            case 2:
                System.out.println("Digite o CRM e o nome: ");
                met.AmzMed();
                System.out.println("\nStatus\n");
                met.StatusMed();
                break;
           
            case 3:
                System.out.println("Digite o CPF e o nome");
                met.AmzPac();
                System.out.println("\nStatus\n");
                met.StatusPac();
                break;
            
            case 4:
                System.out.println("Digite a descrição: ");
                met.AmzAna();
                System.out.println("\nStatus\n");
                met.StatusAna();
                break;

            case 5:
                System.out.println("Digite o CID e a doença: ");
                met.AmzCID();
                System.out.println("\nStatus\n");
                met.StatusCID();
                break;
                
            case 6:
                System.out.println("Digite o nome: ");
                met.AmzEsp(); // o id é auto incrementado.
                System.out.println("\nStatus\n");
                met.StatusEsp();
                break;
            
            case 7:
                System.out.println("\nStatus da Consulta\n");
                met.StatusCons();
                break;
            
            case 8:
                System.out.println("Saindo...");
                break;
                
            default:
                System.out.println("\nOpção Inválida\n");
                break;
            }   
        }
    }
}