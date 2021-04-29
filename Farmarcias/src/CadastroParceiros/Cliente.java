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
    public boolean validarCodigo(){
    	boolean validado = false;
    	if(this.getCodigo()<=0 || this.getCodigo()>1000){
    		validado = false;
    	}else{
    		validado = true;
    	}
    	
    	return validado;
    }

    @Override
    public boolean validarNome(){
    	boolean validado = false;
    	if(this.getNome().indexOf(" ") == -1 || this.getNome().substring(0,this.getNome().indexOf(" ")).length() < 2 || this.getNome().substring(this.getNome().lastIndexOf(" ") + 1).length() < 2){
    		validado = false;
    	}else{
    		validado = true;
    	}
    	
    	return validado;
    }
    @Override
    public boolean validarTelefone(){
    	boolean validado = false;
    	if(this.getTelefone().length() != 10){
    		validado = false;
    	}else{
    		validado = true;
    	}
    	
    	return validado;
    }
    @Override
    public boolean validarEmail(){
    	boolean validado = false;
    	if((this.getEmail().split("@", -1).length-1) != 1){
    		validado = false;
    	}else{
    		validado = true;
    	}
    	
    	return validado;
    }
    
    public boolean validarCelular(){
        boolean validado = false;
        if(this.getCelular().length() != 11){
            validado = false;
        }else{
            validado = true;
        }
        
        return validado;
        
    }
    
    public boolean validarRg(){
        boolean validado = false;
        if((this.getRg().length() < 8) || (this.getRg().length() > 11)){
           validado = false;
        }else{
            validado = true;
        }
        return validado;
        
    }
    public boolean validarCpf(){
        boolean validado = false;
              if(this.getCpf().equals("00000000000")||
                 this.getCpf().equals("11111111111")||
                 this.getCpf().equals("22222222222")||
                 this.getCpf().equals("33333333333")||
                 this.getCpf().equals("44444444444")||
                 this.getCpf().equals("55555555555")||
                 this.getCpf().equals("66666666666")||
                 this.getCpf().equals("77777777777")||
                 this.getCpf().equals("88888888888")||
                 this.getCpf().equals("99999999999")||
                 this.getCpf().length()!=11){
             validado = false;
         }else{
             validado = true;
         }
         return validado;
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
