package Emprestimo_Livro;

public class Main {
    public static void main(String [] args){
        Emprestimo em = new Emprestimo();
        em.setCodId(1);
        em.setDataDevolucao(23);
        em.setDataRetirada(26);
        Livro li =new Livro();
        li.setAnoLanca(2010);
        li.setAutor("Thiago");
        li.setCod(0001);
        li.setEditora("Livro M");
        li.setGenero("Ação");
        li.setTitulo("Monstros");
        li.setValor(20);
        em.setL(li);
        Pessoa pe = new Pessoa();
        pe.setAnoNascc(2001);
        pe.setCPF("00011122233");
        pe.setEndereco("rua nove");
        pe.setNome("Ryan");
        em.setP(pe);
        
        System.out.println("Status");
        System.out.println(em.getL());
        System.out.println("");
        System.out.println(em.getP());
        System.out.println("");
        System.out.println(em.getCodId());
        System.out.println("");
        System.out.println(em.getDataDevolucao());
        System.out.println("");
        System.out.println(em.getDataRetirada());
    }
}
