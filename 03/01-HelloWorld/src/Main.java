import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("\nOlá, " + nome + ".");
        ler.close();
        
    }
}
