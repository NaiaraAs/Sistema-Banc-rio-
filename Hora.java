import java.util.Scanner;

public class Hora {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);
        int hora;
        System.out.println("Digita a hora: ");
        hora = ler.nextInt();

        if (hora >= 9 && hora <=18) {
            System.out.println("Está em horário comercial");
            
        } else {
            System.out.println("Não está em horário comercial");
       
        }// fim else








    }//fim main
}// fim class