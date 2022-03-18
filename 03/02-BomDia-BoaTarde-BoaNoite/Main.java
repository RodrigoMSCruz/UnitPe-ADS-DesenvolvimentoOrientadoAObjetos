import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int hora;
        System.out.print("Digite a hora: ");
        hora = ler.nextInt();
        if((hora < 0) || (hora > 23)){
            System.out.println("Hora inválida!");
        }
        else if(hora < 5){
            System.out.println("Boa madrugada!");
        }
        else if(hora < 12){
            System.out.println("Bom dia!");
        }
        else if(hora < 18){
            System.out.println("Boa tarde!");
        }
        else if(hora <= 23){
            System.out.println("Boa noite!");
        }
        ler.close();
    }
}