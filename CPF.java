import java.util.Scanner;

public class CPF {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        String cpf;

        System.out.println("Digite seu CPF : ");
        cpf = ler.nextLine();

      if (cpf.length() != 11) {
        System.out.println("CPF inválido !");
      } else {
        System.out.println("CPF correto.");
      }// fim else













    }// im main
}// fim class