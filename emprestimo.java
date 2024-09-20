import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        double valorEmprestimo, parcela, salario;;
        int valorParcela;

        
        System.out.print("Digite o valor do empréstimo: ");
         valorEmprestimo = ler.nextDouble();

         System.out.print("Digite o número de parcelas: ");
         valorParcela = ler.nextInt();

         System.out.println("Digite o salário");
         salario = ler.nextDouble();

         parcela = valorEmprestimo ;

         if (valorParcela <+ salario * 0.3) {
            System.out.println("Emprestimo Aprovado !");
         } else {
            System.out.println("Emprestimo Negado ! Você é pobre, quando você tiver dinheiro a gente conversa !");
            
         }

    }// fim main

}// fim class
