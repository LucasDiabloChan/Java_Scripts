/*
 * Description: Calcula e mostra a conversão de Real para Dólar
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio03{
  public static void main(String[] args){
    /* CRIAÇÃO DAS VARIÁVEIS */
      Scanner read = new Scanner(System.in);
      float cotacaoAtualDoDolar, valorParaSerConvertido;

    /* INICIALIZAÇÃO DAS VARIÁVEIS */
      cotacaoAtualDoDolar = valorParaSerConvertido = 0f;

    /* RECEBENDO OS VALORES */
      System.out.println("Insira o valor para ser convertido para Dólar: ");
      valorParaSerConvertido = read.nextFloat();
      System.out.println("Insira o valor atual do Dólar: ");
      cotacaoAtualDoDolar = read.nextFloat();

    /* EXIBE A CONVERSÃO */
      System.out.println("Resultado: U$D" + (valorParaSerConvertido/cotacaoAtualDoDolar));
    
    /* ENCERRA O LEITOR */
      read.close();
  }
}
