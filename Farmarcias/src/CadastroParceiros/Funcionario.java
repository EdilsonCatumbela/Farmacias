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
    public void validacao(){
        System.out.println("========== Ficha de Cadastro de Funcionáriorio===============");
      
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
        System.out.println("Informe o número de CTPS:");
        setNumCtps(scan.nextInt());
        while(getNumCtps()<=0 || ( getNumCtps()>5000)) {
            System.out.println("NÃºmero de CTPS Invalido! O nÃºmero de CTPS deve começar em 1!");
            setNumCtps(scan.nextInt());
        }
        scan.nextLine();
        
        System.out.println("Informe a série do CTPS:");
        setSerCtps(scan.nextLine());
        while(getSerCtps().length()==0){
            System.out.println("Digite a série do CTPS");
            setSerCtps(scan.nextLine());
        }
        
    }

    @Override
    public void imprimir() {
         System.out.println("\n-----------------+++++++++++++++------------------------ ");
            System.out.println("FUNCIONÁRIO CADASTRADO COM SUCESSO!");
            System.out.println("Codigo: "+getCodigo());
            System.out.println("Nome: "+getNome());
            System.out.println("Telefone: "+FormatTel(getTelefone(), true));
            System.out.println("E-mail: "+getEmail());
            System.out.println("Número de CTPS: " +getNumCtps());
            System.out.println("Série de CTPS: " +getSerCtps());
            
            
   
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
}
