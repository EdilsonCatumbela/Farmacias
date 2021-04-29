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
    public void validacao(){
        System.out.println("==========Ficha de Cadastro de Fornecedor===============");
      
        System.out.println("Informe o codigo");
        setCodigo(scan.nextInt());
         while (getCodigo()<=0 || getCodigo()>1000) {
            System.out.println("Codigo Invalido! O c�digo deve come�ar em 1! \n");
            setCodigo(scan.nextInt());
         }
      
        scan.nextLine();
        
        System.out.println("Informe o nome:");
        setNome(scan.nextLine());
        
        while (getNome().indexOf(" ") == -1 || getNome().substring(0,getNome().indexOf(" ")).length() < 2 || getNome().substring(getNome().lastIndexOf(" ") + 1).length() < 2){
              System.out.println("Nome Invalido, o campo nome preceisa ter dois nomes e pelo menos 2 caracteres! \n");
              setNome(scan.nextLine());
         }
        
        System.out.println("Informe o Telefone:");
        setTelefone(scan.nextLine());
        while (getTelefone().length() != 10)  {
              System.out.println("Telefone Invalido, digite um telefone v�lido! \n");
         setTelefone(scan.nextLine());
        }
        
        System.out.println("Informe o Email:");
        setEmail(scan.nextLine());

        while((getEmail().split("@", -1).length-1) != 1){
              System.out.println("E-mail Invalido, digite um E-mail valido!");
              setEmail(scan.nextLine());
         }
        System.out.println("Informe a raz�o social:");
        setRazaoSocial(scan.nextLine());
        
        while(getRazaoSocial().split(" ", -1).length < 2){
              System.out.println("Raz�o social Invalido, o campo razão social preceisa ter duas palavras e pelo menos 2 caracteres!");
              setRazaoSocial(scan.nextLine());
        }
        
        
        System.out.println("Informe a IE:");
        setIE(scan.nextLine());
        while ((getIE().length()<1) || (getIE().length()>15)) {
             System.out.println("IE Inv�lido, o campo IE precisa ter pelos menos 1 caracter");
             setIE(scan.nextLine());
        }
        System.out.println("Informe a CNPJ:");
        setCnpj(scan.nextLine());
        while(getCnpj().length() !=14){
             System.out.println("CNPJ inv�lido! Digite um CNPJ v�lido!");
             setCnpj(scan.nextLine());
    }
    }
        @Override
    public void imprimir(){
        System.out.println("\n-----------------+++++++++++++++------------------------ ");
            System.out.println("FORNECEDOR CADASTRADO COM SUCESSO!");
            System.out.println("Codigo: "+getCodigo());
            System.out.println("Nome: "+getNome());
            System.out.println("Telefone: "+FormatTel(getTelefone(), true));
            System.out.println("E-mail: "+getEmail());
            System.out.println("Raz�o Social: "+getRazaoSocial());
            System.out.println("EI: "+getIE());
            System.out.println("CNPJ: "+FormatCNPJ(getCnpj(), true));
            
            
            
        
        
    }
    private String FormatTel(String C, boolean Mascara){
          if (Mascara){
              return(C.substring(0, 0) + "(" + C.substring(0, 2) + ")" + C.substring(2, 6) + "-" + C.substring(6, 10));
          }else{
              C = C.replace(".", ".");
              C = C.replace(".", ".");
              return C;
          }
      }
    
    private String FormatCNPJ(String C, boolean Mascara){
          if (Mascara){
              return(C.substring(0, 2) + "." + C.substring(2, 5) + "." + C.substring(5, 8) + "/" + C.substring(8, 12) + "-" + C.substring(12, 14));
          }else{
              C = C.replace(".", ".");
              C = C.replace(".", ".");
              return C;
          }
      }
}
