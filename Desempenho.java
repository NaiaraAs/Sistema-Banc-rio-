import java.util.Scanner;

public class Desempenho {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int funcionario1;
        
        System.out.println("Digite sua pontuação (Pontuações 0, 10, 50, 70 ou 100) ");
       funcionario1 = ler.nextInt();
       

       if (funcionario1 ==100){ 
        System.out.println("Ótimo desempenho !");
       }
       if (funcionario1 == 70){ 
        System.out.println("Bom desempenho");
       }
       if (funcionario1 == 50) {
        System.out.println("Desempenho regular");
       }
       if (funcionario1 == 10) {
        System.out.println("Desempenho insatisfatório ");
       } else {
        System.out.println("Desempenho horrível");
      
     }// fim else
        
        
       
      

        
      





    }// fim main
}// fim class
