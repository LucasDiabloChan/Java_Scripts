/*
 * Description: Diz se um valor é par ou ímpar.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio10{
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            int valorInserido;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            valorInserido = 0;
      
        /* RECEBE OS VALORES */
            System.out.println("Insira um valor:");
                valorInserido = reader.nextInt();
      
        /* MOSTRA O MAIOR OU SE SÃO IGUAIS */
            if((valorInserido % 2) == 0){
                System.out.println("É par.");
            }else{
                System.out.println("É ímpar.");
            }
    }
}
