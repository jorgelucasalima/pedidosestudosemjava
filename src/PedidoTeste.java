import java.util.Scanner;

public class PedidoTeste {

  public static void main(String[] args) {

    //VARIAVEIS
    String nome;
    String verificacao;
    String cpf;
    String endereco;
    
    Scanner entradaDados = new Scanner(System.in);
    
    System.out.println("");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("X  SISTEMA DE PEDIDOS DE JORGE E LUIZA  X");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("");

    //DADOS NOME
    System.out.println("Qual seu nome :");
    nome = entradaDados.nextLine();
  
    System.out.printf("Seu nome está correto, %s? (s) - Sim | (n) - Não :", nome);
    verificacao = entradaDados.nextLine();

    while(verificacao.equals("n")) {
      System.out.print("Informe seu nome corrigido :");
      nome = entradaDados.nextLine();
      System.out.printf("Seu nome está correto, %s? (s) - Sim | (n) - Não :", nome);
      verificacao = entradaDados.nextLine();
    }

    //DADOS CPF

    System.out.println("Qual seu CPF :");
    cpf = entradaDados.nextLine();

    System.out.printf("Seu CPF está correto, %s? (s) - Sim | (n) - Não :", cpf);
    verificacao = entradaDados.nextLine();
   
    while(verificacao.equals("n")) {
      System.out.print("Informe seu CPF corrigido :");
      nome = entradaDados.nextLine();
      System.out.printf("Seu CPF está correto, %s? (s) - Sim | (n) - Não :", cpf);
      verificacao = entradaDados.nextLine();
    }
    
    //DADOS ENDEREÇO

    System.out.println("Qual seu Endereço :");
    endereco = entradaDados.nextLine();

    System.out.printf("Seu Endereço está correto, %s? (s) - Sim | (n) - Não :", endereco);
    verificacao = entradaDados.nextLine();
   
    while(verificacao.equals("n")) {
      System.out.print("Informe seu Endereço corrigido :");
      endereco = entradaDados.nextLine();
      System.out.printf("Seu Endereço está correto, %s? (s) - Sim | (n) - Não :", endereco);
      verificacao = entradaDados.nextLine();
    }


    
    
  }
}
