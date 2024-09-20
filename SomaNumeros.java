import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5]; 
        int soma = 0;

       
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ler.nextInt();
        }

      
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

      
    }// fim main
}// fim clss