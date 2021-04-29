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
      System.out.println("SELECIONE A OPÇÃO APROPRIADA [1] FUNCIONÁRIO [2] CLIENTE [3] FORNECEDOR: ");
      
      opcao = scan.nextInt();
      
      while (opcao >=0 && opcao <=3 && cont < max){
          switch(opcao){
              case 1:{
                 
                   Funcionario funcionario = new Funcionario();
                   funcionario.validacao();
                   cont++;
                   funcionario.imprimir();
                   
                   break;
              }case 2:{
              
              Cliente cliente = new Cliente();
              cliente.validacao();
              cont ++;
              cliente.imprimir();
              break;   
          }  case 3:{
               Fornecedor fornecedor = new Fornecedor();
               fornecedor.validacao();
               cont++;
               fornecedor.imprimir();
               
               break;
          }
          default:
              break;
      }
        System.out.print("\nEXECUTAR OUTRA OPERAÇÃO > SELECIONE A OPÇÃO APROPRIADA [1] FUNCIONÁRIO [2] CLIENTE [3] FORNECEDOR: \n");
            opcao = scan.nextInt();
            if(cont==max){
                System.out.println("\n==================================");
				System.out.println("ERRO: LIMITE DE CADASTROS ATINGIDO");
			}  
      }
    }
    
}
