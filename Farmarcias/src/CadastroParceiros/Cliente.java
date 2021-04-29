package CadastroParceiros;
import java.util.Scanner;

public class Cliente extends Parceiro {
    private String celular;
    private String rg;
    private String cpf;

   Scanner scan= new Scanner(System.in);
   
   public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void validacao(){
      System.out.println("========== Ficha de Cadastro de Cliente===============");
      
          System.out.println("Informe o codigo");
        setCodigo(scan.nextInt());
         while (getCodigo()<=0 || getCodigo()>1000) {
            System.out.println("Codigo Invalido! O código deve começar em 1! \n");
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
              System.out.println("Telefone Invalido, digite um telefone válido! \n");
         setTelefone(scan.nextLine());
        }
        
        System.out.println("Informe o Email:");
        setEmail(scan.nextLine());

        while((getEmail().split("@", -1).length-1) != 1){
              System.out.println("E-mail Invalido, digite um E-mail valido!");
              setEmail(scan.nextLine());
         }
     
        System.out.println("Informe o celular:");
        celular = scan.nextLine();
        
        while (getCelular().length() != 11)  {
              System.out.println("Celular Invalido, digite um celular válido!");
              celular = scan.nextLine();
        } 
        
        System.out.println("Informe o RG");
        rg = scan.nextLine();
        while ((getRg().length() < 8) || (getRg().length() > 11)){
            System.out.println("RG Invalido, o RG deve ter no minimo 8 e no máximo 11 carecteres!");
            rg = scan.nextLine();
        }
    
        System.out.println("Informe o CPF");
        cpf = scan.next();
        while(getCpf().equals("00000000000")||
                getCpf().equals("11111111111")||
                getCpf().equals("22222222222")||
                getCpf().equals("33333333333")||
                getCpf().equals("44444444444")||
                getCpf().equals("55555555555")||
                getCpf().equals("66666666666")||
                getCpf().equals("77777777777")||
                getCpf().equals("88888888888")||
                getCpf().equals("99999999999")||
                getCpf().length()!=11){
            System.out.println("CPF Inválido, digite um CPF válido!");
            cpf = scan.next();
        }

    }
        
    @Override
    public void imprimir(){
        System.out.println("\n-----------------+++++++++++++++------------------------ ");
        System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
            System.out.println("Codigo: "+getCodigo());
            System.out.println("Nome: "+getNome());
            System.out.println("Telefone: "+FormatTel(getTelefone(), true));
            System.out.println("E-mail: "+getEmail());
            System.out.println("Celular: "+FormatCel(getCelular(), true));
            System.out.println("RG: " +getRg());
            System.out.println("CPF: "+FormatCPF(getCpf(), true));
            
          
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
      private String FormatCel(String C, boolean Mascara){
          if (Mascara){
              return(C.substring(0, 0) + "(" + C.substring(0, 2) + ")" + C.substring(2, 7) + "-" + C.substring(7, 11));
          }else{
              C = C.replace(".", ".");
              C = C.replace(".", ".");
              return C;
          }
      }
      
      private String FormatCPF(String C, boolean Mascara){
          if (Mascara){
              return (C.substring(0, 3) + "." + C.substring(3, 6) + "." +
            C.substring(6, 9) + "-" + C.substring(9, 11));
          }else{
              C = C.replace(".", ".");
              C = C.replace(".", ".");
              return C;
          }
      }
   
}
