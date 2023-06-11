/*
 * Description: Calcula a área de um triângulo
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */


import java.util.Scanner;

// Todo seu código deve estar dentro dessa classe
public class LucasSouza_Exercicio03{
  
    // Todo seu código deve ser escrito/chamado aqui
    public static void main(String[] args) throws InterruptedException, IOException{
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner read = new Scanner(System.in);
            float base, altura, area;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            base = altura = area = 0.1f;

        /* RECEBENDO OS VALORES */
            System.out.println("Insira o valor da base: ");
            base = read.nextFloat();
            
            System.out.println("Insira o valor da altura: ");
            altura = read.nextFloat();
        
        /* TRATAMENTO DOS DADOS */
            area = (base * altura) / 2;
        
        /* EXIBE O RESULTADO */
            System.out.println("A área equivale a aproximadamente: " + area);
            System.out.println("\n= = = = = = = = = = = = = = =\n"); // Embelezamento
    
        /* ENCERRA O LEITOR */
            read.close();
    }
}
