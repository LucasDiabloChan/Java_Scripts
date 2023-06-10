/*
 * Description: Exibe a soma do quadrado de quatro valores
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

// Chama a classe Scanner
import java.util.Scanner;

// Todo seu código deve estar dentro dessa classe
public class LucasSouza_Exercicio02{
  
  // Todo seu código deve ser escrito/chamado aqui
  public static void main(String args[]){
    
    /* CRIAÇÃO DAS VARIÁVEIS */
      Scanner reader = new Scanner(System.in);
      int valor1, valor2, valor3, valor4, soma;
    
    /* INICIALIZAÇÃO DAS VARIÁVEIS */
      valor1 = valor2 = valor3 = valor4 = soma = 0;
    
    /* RECEBE OS VALORES */
      System.out.println("Insira quatro valores inteiros: ");
      valor1 = reader.nextInt();
      valor2 = reader.nextInt();
      valor3 = reader.nextInt();
      valor4 = reader.nextInt();
    
    /* CALCULA A SOMA DOS (x²) */
      soma = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3) + (valor4 * valor4);
    
    /* EXIBE A SOMA */
      System.out.println("O resultado da soma dos quadrados é: " + soma);

    /* ENCERRA O LEITOR */
      reader.close();
  }
}
