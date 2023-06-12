/*
 * Description: Diz se dois valores são iguais ou mostra qual é o maior.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio09{
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            float primeiroValor, segundoValor;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            primeiroValor = segundoValor = 0.0f;
      
        /* RECEBE OS VALORES */
            System.out.println("Insira um valor:");
                primeiroValor = reader.nextInt();
      
            System.out.println("Insira outro valor:");
                segundoValor = reader.nextInt();
      
        /* MOSTRA O MAIOR OU SE SÃO IGUAIS */
            if(primeiroValor > segundoValor){
                System.out.println("O primero é maior.");
            }else if(primeiroValor < segundoValor){
                System.out.println("O segundo é maior.");
            }else{
                System.out.println("Os números são iguais.");
            }
    }
}
