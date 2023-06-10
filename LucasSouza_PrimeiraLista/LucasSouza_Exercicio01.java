/*
 * Description: Exibe a soma de 4 valores
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

import java.util.Scanner;

// Todo seu código deve estar dentro dessa classe
public class LucasSouza_Exercicio01{
  
  // Todo seu código deve ser escrito/chamado aqui
  public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner reader;
            int num, nois, nes, natro, soma;
      
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            num = nois = nes = natro = soma = 0;
        
        /* PEGANDO VALORES */
            System.out.println("Digite quatro números: ");
                num   = reader.nextInt();
                nois  = reader.nextInt();
                nes   = reader.nextInt();
                natro = reader.nextInt();
        
        /* SOMA OS QUATRO NÚMEROS */
            soma = num + nois + nes + natro;
            
        /* EXIBE O RESULTADO */
            System.out.println("O resultado é: " + soma);
        
        /* ENCERRA O LEITOR */
            reader.close();    
    }
}
