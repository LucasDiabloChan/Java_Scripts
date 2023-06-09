import java.util.Scanner;

public class LucasSouza_Exercicio03{
  public static void main(String[] args){
    /* CRIAÇÃO DAS VARIÁVEIS */
      Scanner read = new Scanner(System.in);
      float cotacaoAtualDoDolar, valorParaSerConvertido, valorConvertidoParaReal;

    /* INICIALIZAÇÃO DAS VARIÁVEIS */
      cotacaoAtualDoDolar = valorConvertidoParaReal = 0f;

    /* RECEBENDO OS VALORES */
      System.out.println("Insira o valor para ser convertido para Dólar: ");
      valorParaSerConvertido = read.nextFloat();
      System.out.println("Insira o valor atual do Dólar: ");
      cotacaoAtualDoDolar = read.nextFloat();

    /* EXIBE A CONVERSÃO */
      System.out.println("Resultado: U$D" + (valorParaSerConvertido/cotacaoAtualDoDolar));
  }
}
