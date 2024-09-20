import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        Scanner ler = new Scanner(System.in);
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        do {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = ler.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        } while (palpite != numeroSecreto);
    }
}