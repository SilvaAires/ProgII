package ListaEncadeadaConsultorio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Consulta c = new Consulta();
        Anamnese a = new Anamnese();
        CID ci = new CID();
        Especialidade esp = new Especialidade();
        Medico med = new Medico();
        Paciente pac = new Paciente();
        
        Scanner e = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n-------------- MENU -------------");
            System.out.println("---------------------------------");
            System.out.println("-- Digite a opção desejada:");
            System.out.println("-> 1 - Inserir e status dados da consulta.");
            System.out.println("-> 2 - Inserir e status dados da medico.");
            System.out.println("-> 3 - Inserir e status dados da paciente.");
            System.out.println("-> 4 - Inserir e status dados da anamnese.");
            System.out.println("-> 5 - Inserir e status dados da CID.");
            System.out.println("-> 6 - Inserir e status dados da especialidade.");
            System.out.println("-> 7 - Listar Elementos");
            System.out.println("-> 8 - Remover Elementos");
            System.out.println("-> 9 - Sair");
            System.out.print("-> Opção: ");
            opcao = e.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Inserir dados da consulta.");
                    
                    System.out.println("---------------------------------");
                    System.out.println("Dados da Anamnese, digite a descrição: ");
                    a.setDescricao(e.nextLine());
                    c.setAnamnese(a);
                    System.out.println("---------------------------------");
                    
                    System.out.println("---------------------------------");
                    System.out.println("Insira o CID: ");
                    ci.setCID(e.nextLine());
                    System.out.println("Nome da doença: ");
                    ci.setDoenca(e.nextLine());
                    c.setCid(ci);
                    System.out.println("---------------------------------");
                    
                    System.out.println("---------------------------------");
                    System.out.println("Digite o id de consulta: ");
                    c.setId(e.nextInt());
                    System.out.println("---------------------------------");
                    
                    System.out.println("---------------------------------");
                    System.out.println("Digite o CRM: ");
                    med.setCRM(e.nextLine());
                    System.out.println("Digite o nome do medico: ");
                    med.setNome(e.nextLine());
                    System.out.println("Digite o id de especialidade: ");
                    esp.setId(e.nextInt());
                    System.out.println("Digite o nome da especialidade: ");
                    esp.setNome(e.nextLine());
                    med.setEspec(esp);
                    c.setMedico(med);
                    System.out.println("---------------------------------");
                    
                    System.out.println("---------------------------------");
                    System.out.println("Digite o CPF do paciente");
                    pac.setCpf(e.nextLine());
                    System.out.println("Digite o nome do paciente");
                    pac.setNome(e.nextLine());
                    c.setPaciente(pac);
                    System.out.println("---------------------------------");
                    
                    lista.adicionar(c);
                    break;
                    
                case 2:
                    System.out.println("Inserir dados da medico.");
                    e = new Scanner(System.in);
                    med.setCRM(e.next());
                    med.setNome(e.next());
                    med.setEspec(esp);
                    break;
                
                case 3:
                    System.out.println("Inserir dados da paciente.");
                    e = new Scanner(System.in);
                    pac.setCpf(e.next());
                    pac.setNome(e.next());
                    break;
                 
                case 4:
                    System.out.println("Inserir dados da anamnese.");
                    e = new Scanner(System.in);
                    a.setDescricao(e.nextLine());
                    break;
                    
                case 5:
                    System.out.println("Inserir dados da CID.");
                    e = new Scanner(System.in);
                    ci.setCID(e.next());
                    ci.setDoenca(e.next());
                    break;
                
                case 6:
                    System.out.println("Inserir dados da especialidade.");
                    e = new Scanner(System.in);
                    esp.setId(e.nextInt());
                    esp.setNome(e.next());
                    break;
                
                case 7:
                    if (!lista.vazia()) {
                        lista.listar();
                    } else {
                        System.out.println("Lista Vazia.");
                    }
                    break;

                case 8:
                    System.out.print("Digite o cpf a remover: ");
                    e = new Scanner(System.in);
                    if (lista.remover(e.nextInt())) {
                        System.out.println("Elemento Removido.");
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;
            }
        }
    }

}
