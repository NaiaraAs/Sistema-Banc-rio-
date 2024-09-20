import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) throws Exception {
     double salariofinal;
      
   Scanner ler = new Scanner(System.in);

   System.out.println("Digite o salário base do funcionario");
   double salarioBase = ler.nextDouble();

   System.out.println("Digite o desempenho do fuincionario");
   String desempenho = ler.next();

    double salarioBonus = 20;
    
    if (desempenho.equalsIgnoreCase("Òtimo")) {
        salarioBonus = salarioBase * 0.2;
    }else if (desempenho.equalsIgnoreCase("Bom")) {
        salarioBonus = salarioBase * 0.1;
    }else if (desempenho.equalsIgnoreCase("Regular")) {
        salarioBonus = salarioBase * 0.05;
    }
    salariofinal = salarioBonus + salarioBase;

    System.out.println("O salario final do funcionario é:" + salariofinal);





    }
}
