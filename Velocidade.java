
import java.util.Scanner;

public class Velocidade {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        Double distancia, tempo ,velocidadeMedia;


        System.out.print("Digite a distância percorrida em metros: ");
         distancia = ler.nextDouble();

        System.out.print("Digite o tempo gasto em segundos: ");
         tempo = ler.nextDouble();

         velocidadeMedia = distancia * tempo;

        if (velocidadeMedia < 5) {
            System.out.println("Movimento lento");

        } else if (velocidadeMedia >= 5 && velocidadeMedia <= 15) {

            System.out.println("Movimento moderado");
        } else {

            System.out.println("Movimento rápido");
        }//fim else

    }//fim main

}// fim class
















    }//fim main
}//fim class