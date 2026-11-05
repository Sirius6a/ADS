package PessoaAgenda;

public class Main {
     public static void main(String[] args) {
          // b) Instanciação dos objetos
          Agenda agenda = new Agenda();

          Pessoa p1 = new Pessoa(1, "Ana Beatriz", "Rua Maria Josefina Pessoa 746");
          p1.adicionar(new MeioContato("BiahAna345@gmail.com", "E-mail"));
          p1.adicionar(new MeioContato("88 99999-1111", "WhatsApp"));

          PessoaFisica pf = new PessoaFisica(2, "Rayane Pimenta", "Rua Coronel Tibucio 355", "123.456.789-00", 2007);
          pf.adicionar(new MeioContato("Pimentinha786@gmail.com", "E-mail"));
          pf.adicionar(new MeioContato("88 99999-1313", "WhatsApp"));

          PessoaJuridica pj = new PessoaJuridica(3, "Francisco Weslei", "Rua Aluisio Furtado Girao 892",
                  "12.345.678/0001-99", "PixelCoders LTDA");
          pj.adicionar(new MeioContato("88 3412-0000", "Telefone Fixo"));

          // Adicionando à agenda
          agenda.adicionar(p1);
          agenda.adicionar(pf);
          agenda.adicionar(pj);

          // c) Teste do método mostrarDados() das três classes
          System.out.println("--- TESTE DO MÉTODO mostrarDados() ---");
          agenda.mostrarDados();

          // d) Teste do método getIdentificacao()
          System.out.println("\n--- TESTE DO MÉTODO getIdentificacao() ---");
          System.out.println("Identificação Pessoa (Nome): " + p1.getIdentificacao());
          System.out.println("Identificação Pessoa Física (CPF): " + pf.getIdentificacao());
          System.out.println("Identificação Pessoa Jurídica (CNPJ): " + pj.getIdentificacao());

          // e) Teste das duas versões de contemPessoa()
          System.out.println("\n--- TESTE DO MÉTODO contemPessoa() ---");

          // Consultas por ID
          System.out.println("Existe ID 2? " + agenda.contemPessoa(2)); // true
          System.out.println("Existe ID 10? " + agenda.contemPessoa(10)); // false

          // Consultas por identificação (Nome, CPF, CNPJ)
          System.out.println("Existe Nome 'Carlos Silva'? " + agenda.contemPessoa("Carlos Silva")); // true
          System.out.println("Existe CPF '123.456.789-00'? " + agenda.contemPessoa("123.456.789-00")); // true
          System.out.println("Existe CNPJ '12.345.678/0001-99'? " + agenda.contemPessoa("12.345.678/0001-99")); // true

          // Consulta com identificação inexistente
          System.out.println("Existe ID/Identificação 'Inexistente'? " + agenda.contemPessoa("Inexistente")); // false
     }
}
