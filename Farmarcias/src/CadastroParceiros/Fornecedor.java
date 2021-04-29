package CadastroParceiros;

import java.util.Scanner;

public class Fornecedor extends Parceiro {
	private String razaoSocial;
	private String IE;
	private String cnpj;

	Scanner scan = new Scanner(System.in);

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String IE) {
		this.IE = IE;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public boolean validarRazaoSocial() {
		boolean validado = false;
		if (this.getRazaoSocial().split(" ", -1).length < 2) {
			validado = false;
		} else {
			validado = true;
		}

		return validado;

	}

	public boolean validarIE() {
		boolean validado = false;

		if ((this.getIE().length() < 1) || (this.getIE().length() > 15)) {
			validado = false;
		} else {
			validado = true;
		}
		return validado;

	}

	public boolean validarCNPJ() {
		boolean validado = false;

		if (this.getCnpj().length() != 14) {
			validado = false;
		} else {
			validado = true;
		}
		return validado;
	}

	@Override
	public void imprimir() {
		System.out
				.println("\n-----------------+++++++++++++++------------------------ ");
		System.out.println("FORNECEDOR CADASTRADO COM SUCESSO!");
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Nome: " + getNome());
		System.out.println("Telefone: " + FormatTel(getTelefone(), true));
		System.out.println("E-mail: " + getEmail());
		System.out.println("Razão Social: " + getRazaoSocial());
		System.out.println("EI: " + getIE());
		System.out.println("CNPJ: " + FormatCNPJ(getCnpj(), true));

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

	private String FormatCNPJ(String C, boolean Mascara) {
		if (Mascara) {
			return (C.substring(0, 2) + "." + C.substring(2, 5) + "."
					+ C.substring(5, 8) + "/" + C.substring(8, 12) + "-" + C
						.substring(12, 14));
		} else {
			C = C.replace(".", ".");
			C = C.replace(".", ".");
			return C;
		}
	}
}
