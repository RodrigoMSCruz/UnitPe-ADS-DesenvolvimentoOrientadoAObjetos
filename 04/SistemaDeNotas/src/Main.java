//A aplicação deve receber quatro valores de 0 a 10, caso algum valor fora do intervalo seja informado
// deverá escrever uma mensagem informando que a nota é inválida.
//
//Após os 4 valore corretos deverá informar qual a média do aluno e informar se o mesmo foi:
//- reprovado (até 4)
//- recuperação (maior ou igual a 4 e menor que 7)
//- aprovado (7 ou mais)
//
//Ao final deve perguntar se o usuário deseja informar outra sequencia de Notas sendo 1 = sim e 2 = não
// caso algum valor diferente seja informado, o usuário deverá receber uma  mensagem informando que o valor é inválido e pedindo um novo valor até que 1 ou 2 seja informado.
//
//Para a entrega basta enviar o código digitado no VsCode ou no https://onecompiler.com/java/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float nota, media = 0;
        float[] notas = new float[4];

        for(int i = 0; i < notas.length; i++){
            do{
                System.out.print("\nDigite a " + (i + 1) +"a nota: ");
                nota = ler.nextFloat();
                if((nota < 0f) || nota > 10f){
                    System.out.println("Valor inválido. A nota tem que ser entre 0 e 10.");
                }
            }while(nota < 0f || nota > 10f);
            notas[i] = nota;
        }
        for(int i = 0; i < notas.length; i++){
            media = media + notas[i];
        }
        media = media/notas.length;
        if(media >= 0f && media <= 4f){
            System.out.println("O aluno foi reprovado!");
        }
        if(media >= 4f && media < 7f){
            System.out.println("O aluno foi reprovado!");
        }
        if(media >= 7f){
            System.out.println("A média do(a) aluno(a) é: " + media + ".");
            System.out.println("O aluno foi aprovado!");
        }
    }
}
