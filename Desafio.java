import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Lua Belli";
        String tipoConta = "Corrente";
        double saldo = 7700.98;
        int opcao = 0;
        
        String menu = """
               -- Digite sua opção --
               1 - Consulte o seu saldo
               2 - Tranferir valor 
               3 - Receber valor
               4 - Sair
        
        
               """;
               
        System.out.println("__________________________________");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da conta corrente: " + saldo);
        System.out.println("\n__________________________________");
        
    
        while (opcao != 4) {
           System.out.println(menu);
           opcao = leitura.nextInt();
           
           
           if (opcao == 1) {
               System.out.println("O saldo atualizado é " + saldo);
           } else if (opcao == 2) {
               System.out.println("Qual o valor que deseja transferir");
               double valor = leitura.nextDouble();
               if (valor > saldo) {
                   System.out.println("Não há saldo para poder transferir");
               } else {
                   saldo -= valor;
                   System.out.println("Novo Saldo" + saldo);
               }
           } else if (opcao == 3) {
               System.out.println("valor recebido: ");
               double valor = leitura.nextDouble();
               saldo += valor;
               System.out.println("Novo Saldo" + saldo);
           } else if (opcao == 4) {
               System.out.println("Obrigada por utilizar o nosso banco!");
           } else {
               System.out.println("Erro!");
           }
    
        }
  }
}