package app;

import java.util.Scanner;

public class AppSquadBank {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcao = 0;
		int numero;
		String digite;
		String nome;
		String cpf;

		while (opcao != -1) {
			System.out.println("1: Conta Corrente");
			System.out.println("2: Conta Especial");
			System.out.println("3: Conta Poupança");
			System.out.println("4: Fazer um Saque");
			System.out.println("5: Fazer um Depósito");
			System.out.println("6: Fazer uma Transferência");
			System.out.println("7: Sair do Sistema");

			System.out.println("Escolha uma opção");

			digite = teclado.nextLine();
			opcao = Integer.parseInt(digite);

			switch (opcao) {

			case 1:
				System.out.println("Abertura de Conta Corrente");

				nomeTitular();

				nome = teclado.nextLine();

				cpfTitular();

				cpf = teclado.nextLine();

				numeroConta();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				numeroAgencia();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				System.out.println("Conta Criada com Sucesso");

				break;

			case 2:

				System.out.println("Abertura de Conta Especial");

				nomeTitular();

				nome = teclado.nextLine();

				cpfTitular();

				cpf = teclado.nextLine();

				numeroConta();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				numeroAgencia();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				System.out.println("Conta Criada com Sucesso");

				break;

			case 3:

				System.out.println("Abertura de Conta Poupança");

				nomeTitular();

				nome = teclado.nextLine();

				cpfTitular();

				cpf = teclado.nextLine();

				numeroConta();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				numeroAgencia();

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				System.out.println("Conta Criada com Sucesso");

				break;

			case 4:

				System.out.println("Qual o valor você deseja sacar? R$ :");

				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				break;

			case 5:

				System.out.println("Para qual Conta você deseja fazer o depósito?");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				break;

			case 6:

				System.out.println("Para qual Conta você deseja fazer a transferência?");
				digite = teclado.nextLine();
				numero = Integer.parseInt(digite);

				break;

			case 7:

				System.out.println("O sistema foi encerrado com sucesso");

				break;

			default:

				System.out.println("Opção inválida. Tente novamente");
				break;

			}

		}
		teclado.close();
	}

	public static void nomeTitular() {
		System.out.println("Digite o nome do titular da Conta");
	}

	public static void cpfTitular() {
		System.out.println("Digite o CPF do titular da Conta");
	}

	public static void numeroConta() {
		System.out.println("Digite o número da Conta");
	}

	public static void numeroAgencia() {
		System.out.println("Digite o número da Agência");
	}
}