/*
 * Description: Exibe o maior dentre três valores inseridos
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

import java.util.Scanner;

// Todo seu código deve estar dentro dessa classe
public class LucasSouza_Exercicio02{
  
    // Todo seu código deve ser escrito/chamado aqui
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner read = new Scanner(System.in);
            float valor1, valor2, valor3, maiorValor;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            valor1 = valor2 = valor3 = 0.0f;
        
        /* RECEBENDO OS VALORES */
            System.out.println("Insira o primero valor: ");
            valor1 = read.nextFloat();
            
            System.out.println("Insira o segundo valor: ");
            valor2 = read.nextFloat();
            
            System.out.println("Insira o terceiro valor: ");
            valor3 = read.nextFloat();

        /* TRATAMENTO DOS DADOS */
            maiorValor = valor1;
            
            if (valor2 > maiorValor)
                maiorValor = valor2;
            
            if (valor3 > maiorValor)
                maiorValor = valor3;
            
        /* EXIBE O RESULTADO */
            System.out.println("\n= = = = = = = = = = = = = = =\n"); // Limpa a tela
            System.out.printf("Valores inseridos: \n(%.2f) | (%.2f) | (%.2f)", valor1, valor2, valor3); // Apenas embelezamentos
            System.out.println("\nMaior valor: " + (maiorValor));
    
        /* ENCERRA O LEITOR */
            read.close();
  }
}
