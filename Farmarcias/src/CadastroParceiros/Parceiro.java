package CadastroParceiros;

public abstract class Parceiro {
    private int codigo;
	private String nome;
	private String telefone;
	private String email;
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public abstract boolean validarCodigo();
    public abstract boolean validarNome();
    public abstract boolean validarTelefone();
    public abstract boolean validarEmail();
    
    public abstract void imprimir();
       
    
}
