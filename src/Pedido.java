import java.util.Scanner;

public class Pedido {
  public static void main(String[] args) {
		
		//VARIAVEIS
		String nome;
		String cpf;
		String endereco;
		String verificacao;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("SISTEMA DE PEDIDOS DE JORGE E LUIZA");
		System.out.println("Qual seu nome :");
		nome = entradaDados.nextLine();
		
		System.out.printf("Seu nome está correto, %s? (S) - Sim | (N) - Não :", nome);
		verificacao = entradaDados.nextLine();
		
		switch ( verificacao ) {
			case "S" :
				System.out.print("OK");
				break;
			case "N" :
				System.out.print("Repita seu nome :");
				nome = entradaDados.nextLine();
		}
		
		System.out.println("Qual seu CPF :");
		cpf = entradaDados.nextLine();
		
		System.out.printf("Seu CPF está correto? %s (S) - Sim | (N) - Não :", cpf);
		verificacao = entradaDados.nextLine();
		
		switch ( verificacao ) {
			case "S" :
				System.out.print("OK");
				break;
			case "N" :
				System.out.print("Repita seu CPF :");
				nome = entradaDados.nextLine();
		}
		
		System.out.println("Qual seu endereço :");
		endereco = entradaDados.nextLine();
		
		System.out.printf("Seu endereço está correto? %s (S) - Sim | (N) - Não :", endereco);
		verificacao = entradaDados.nextLine();
		
		switch ( verificacao ) {
			case "S" :
				System.out.print("OK");
				break;
			case "N" :
				System.out.print("Repita seu endereço :");
				nome = entradaDados.nextLine();
		}
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("x        CARDÁPIO        x");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("1. Água - R$100,00");
		System.out.println("2. Suco - R$300,00");
		System.out.println("3. Pizza - R$2,00");
		System.out.println("Escolha o número do pedido: ");
		int pedido = entradaDados.nextInt();
		
		switch (pedido) {
		case 1:
			System.out.println("Ok, mais alguma coisa");
		}
	}
}
