package CadastroParceiros;

import java.util.Scanner;

public class Funcionario extends Parceiro {
	private int numCtps;
	private String serCtps;

	Scanner scan = new Scanner(System.in);

	public int getNumCtps() {
		return numCtps;
	}

	public void setNumCtps(int numCtps) {
		this.numCtps = numCtps;
	}

	public String getSerCtps() {
		return serCtps;
	}

	public void setSerCtps(String serCtps) {
		this.serCtps = serCtps;
	}

	@Override
	public boolean validarCodigo() {
		boolean validado = false;
		if (this.getCodigo() <= 0 || this.getCodigo() > 1000) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;
	}

	@Override
	public boolean validarNome() {
		boolean validado = false;
		if (this.getNome().indexOf(" ") == -1
				|| this.getNome().substring(0, this.getNome().indexOf(" "))
						.length() < 2
				|| this.getNome()
						.substring(this.getNome().lastIndexOf(" ") + 1)
						.length() < 2) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;
	}

	@Override
	public boolean validarTelefone() {
		boolean validado = false;
		if (this.getTelefone().length() != 10) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;
	}

	@Override
	public boolean validarEmail() {
		boolean validado = false;
		if ((this.getEmail().split("@", -1).length - 1) != 1) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;
	}

	public boolean validarNumCTPS() {
		boolean validado = false;
		if (getNumCtps() <= 0 || (getNumCtps() > 5000)) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;
	}

	public boolean validarSerCTPS() {
		boolean validado = false;
		if (this.getSerCtps().length() == 0) {
			validado = false;
		}
		return validado;
	}

	@Override
	public void imprimir() {
		System.out
				.println("\n-----------------+++++++++++++++------------------------ ");
		System.out.println("FUNCIONÁRIO CADASTRADO COM SUCESSO!");
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Telefone: " + FormatTel(getTelefone(), true));
		System.out.println("E-mail: " + getEmail());
		System.out.println("Número de CTPS: " + getNumCtps());
		System.out.println("Série de CTPS: " + getSerCtps());

	}

	private String FormatTel(String C, boolean Mascara) {
		if (Mascara) {
			return (C.substring(0, 0) + "(" + C.substring(0, 2) + ")"
					+ C.substring(2, 6) + "-" + C.substring(6, 10));
		} else {
			C = C.replace(".", ".");
			C = C.replace(".", ".");
			return C;
		}
	}
}
