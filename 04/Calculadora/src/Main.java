//Desenvolver uma calculadora que realize as 4 operações básicas, recebendo 3 valores, os dois primeiros são os valores a ser calculados e o terceiro é o tipo de operação a ser realizada, de acordo com a regra abaixo:
//
// 1 - soma 
// 2 - subtração
// 3 - multiplicação
// 4 - divisão
//
//Para a entrega basta enviar o código realizado no vs code ou na plataforma https://onecompiler.com/java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float valor1, valor2, resultado;
        String operacao;
        
        System.out.println("Programa Calculadora");
        System.out.print("Entre com o primeiro valor: ");
        valor1 = ler.nextFloat();
        System.out.print("Entre com a operação: ");
        operacao = ler.next();
        System.out.print("Entre com o segundo valor: ");
        valor2 = ler.nextFloat();
        

        switch (operacao){
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            default:
                resultado = 0;
                System.out.println("\nOperação não disponível ou inválida!");
                break;    
        }
        System.out.println("Resultado " + resultado);
    }
}
