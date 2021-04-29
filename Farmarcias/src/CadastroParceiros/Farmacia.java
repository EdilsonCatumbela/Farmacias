package CadastroParceiros;

import java.util.Scanner;

public class Farmacia {

	private static Scanner scan;

	public static void main(String[] args) {

		final int max = 50;
		int cont = 0;
		int opcao = 0;

		scan = new Scanner(System.in);
		System.out.println("==== SISTEMA DE CADASTRO DE PARCEIROS ====");
		System.out
				.println("SELECIONE A OPÇÃO APROPRIADA [1] FUNCIONÁRIO [2] CLIENTE [3] FORNECEDOR: ");

		opcao = scan.nextInt();
		Funcionario funcionario = new Funcionario();
		Cliente cliente = new Cliente();
		Fornecedor fornecedor = new Fornecedor();
		while (opcao >= 0 && opcao <= 3 && cont < max) {
			switch (opcao) {
			case 1: {

				System.out.println("Informe o codigo");
				funcionario.setCodigo(scan.nextInt());

				while (funcionario.validarCodigo() == false) {
					System.out
							.println("Codigo Invalido! O código deve começar em 1!");
					funcionario.setCodigo(scan.nextInt());
				}
				scan.nextLine();
				System.out.println("Informe o nome Completo");
				funcionario.setNome(scan.nextLine());

				
				while (funcionario.validarNome() == false) {
					System.out
							.println("Nome Invalido, o campo nome preceisa ter dois nomes e pelo menos 2 caracteres!");
					funcionario.setNome(scan.nextLine());
				}
				System.out.println("Informe o Telefone:");
				funcionario.setTelefone(scan.nextLine());

				while (funcionario.validarTelefone() == false) {
					System.out
							.println("Telefone Invalido, digite um telefone válido!");
					funcionario.setTelefone(scan.nextLine());
				}
				System.out.println("Informe o Email:");
				funcionario.setEmail(scan.nextLine());

				while (funcionario.validarEmail() == false) {
					System.out
							.println("E-mail Invalido, digite um E-mail valido!");
					funcionario.setEmail(scan.nextLine());
				}
				System.out.println("Informe o número de CTPS:");
				funcionario.setNumCtps(scan.nextInt());

				while (funcionario.validarNumCTPS() == false) {
					System.out
							.println("Número de CTPS Inválido, digite um número de CTPS válido!");
					funcionario.setNumCtps(scan.nextInt());
				}

				funcionario.setSerCtps(scan.nextLine());

				System.out.println("Informe a série do CTPS:");
				funcionario.setSerCtps(scan.nextLine());
				while (funcionario.getSerCtps().length() == 0) {
					System.out.println("Digite a série do CTPS");
					funcionario.setSerCtps(scan.nextLine());
				}

				cont++;
				funcionario.imprimir();

				break;

			}

			case 2: {

				System.out.println("FICHA DE CADASTRO DE CLIENTE");
				System.out.println("Informe o codigo");
				cliente.setCodigo(scan.nextInt());

				while (cliente.validarCodigo() == false) {
					System.out
							.println("Codigo Invalido! O código deve começar em 1! \n");
					cliente.setCodigo(scan.nextInt());
				}
				scan.nextLine();

				System.out.println("Informe o nome complento");
				cliente.setNome(scan.nextLine());
				while (cliente.validarNome() == false) {
					System.out
							.println("Nome Invalido, o campo nome preceisa ter dois nomes e pelo menos 2 caracteres! \n");
					cliente.setNome(scan.nextLine());
				}

				System.out.println("Informe o Telefone:");
				cliente.setTelefone(scan.nextLine());
				while (cliente.validarTelefone() == false) {
					System.out
							.println("Telefone Invalido, digite um telefone válido! \n");
					cliente.setTelefone(scan.nextLine());
				}

				System.out.println("Informe o Email:");
				cliente.setEmail(scan.nextLine());

				while (cliente.validarEmail() == false) {
					System.out.println("Digite um e-mail válido");
					cliente.setEmail(scan.nextLine());
				}
				System.out.println("Informe o número do Celular:");
				cliente.setCelular(scan.nextLine());
				while (cliente.validarCelular() == false) {
					System.out
							.println("Celular Invalido, digite um celular válido!");
					cliente.setCelular(scan.nextLine());
				}

				System.out.println("Informe o RG");
				cliente.setRg(scan.nextLine());
				while (cliente.validarRg() == false) {
					System.out
							.println("RG Invalido, o RG deve ter no minimo 8 e no máximo 11 carecteres!");
					cliente.setRg(scan.nextLine());
				}

				System.out.println("Informe o CPF");
				cliente.setCpf(scan.next());
				while (cliente.validarCpf() == false) {
					System.out.println("CPF inválido, digite um cpf válido!");
					cliente.setCpf(scan.next());
				}

				cont++;
				cliente.imprimir();
				break;
			}
			case 3: {
				System.out.println("FICHA DE CADASTRO DE FORNECIDOR");
				System.out.println("Informe o codigo");
				fornecedor.setCodigo(scan.nextInt());

				while (fornecedor.validarCodigo() == false) {
					System.out
							.println("Codigo Invalido! O código deve começar em 1! \n");
					fornecedor.setCodigo(scan.nextInt());
				}
				scan.nextLine();
				System.out.println("Informe o nome complento");
				fornecedor.setNome(scan.nextLine());
				while (fornecedor.validarNome() == false) {
					System.out
							.println("Nome Invalido, o campo nome preceisa ter dois nomes e pelo menos 2 caracteres! \n");
					fornecedor.setNome(scan.nextLine());
				}

				System.out.println("Informe o Telefone:");
				fornecedor.setTelefone(scan.nextLine());
				while (fornecedor.validarTelefone() == false) {
					System.out
							.println("Telefone Invalido, digite um telefone válido! \n");
					fornecedor.setTelefone(scan.nextLine());
				}

				System.out.println("Informe o Email:");
				fornecedor.setEmail(scan.nextLine());
				while (fornecedor.validarEmail() == false) {
					System.out.println("Digite um e-mail válido");
					fornecedor.setEmail(scan.nextLine());
				}
				System.out.println("Informe a razão social:");
				fornecedor.setRazaoSocial(scan.nextLine());

				while (fornecedor.validarRazaoSocial() == false) {
					System.out
							.println("Razão social Invalido, o campo razÃ£o social preceisa ter duas palavras e pelo menos 2 caracteres!");
					fornecedor.setRazaoSocial(scan.nextLine());
				}

				System.out.println("Informe a IE:");
				fornecedor.setIE(scan.nextLine());
				while (fornecedor.validarIE() == false) {
					System.out
							.println("IE Invalido, o campo IE precisa ter 1 á 15 caracteres");
					fornecedor.setIE(scan.nextLine());
				}
				System.out.println("Informe a CNPJ:");
				fornecedor.setCnpj(scan.nextLine());
				while (fornecedor.validarCNPJ() == false) {
					System.out.println("CNPJ inválido! Digite um CNPJ válido!");
					fornecedor.setCnpj(scan.nextLine());
				}

				cont++;
				fornecedor.imprimir();

				break;
			}
			default:
				break;
			}
			System.out
					.print("\nEXECUTAR OUTRA OPERAÇÃO > SELECIONE A OPÇÃO APROPRIADA [1] FUNCIONÁRIO [2] CLIENTE [3] FORNECEDOR: \n");
			opcao = scan.nextInt();
			if (cont == max) {
				System.out.println("\n==================================");
				System.out.println("ERRO: LIMITE DE CADASTROS ATINGIDO");
			}
		}
	}

}
