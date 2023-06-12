/*
 * Description: Mostra todos os número entre dois valores inseridos.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio02{
    public static void main(String[] args){
        
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            int primeiroValor, segundoValor;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            primeiroValor = segundoValor = 0;    
        
        /* RECEBE OS VALORES */
            System.out.println("Insira um número: ");
                primeiroValor = reader.nextInt();
            System.out.println("Insira outro número: ");
                segundoValor = reader.nextInt();
        
        /* MOSTRA TODOS OS NÚMEROS DE 0 A 1000 */
            if(primeiroValor < segundoValor){
               // O primeiro valor é maior
                    for(int i = (primeiroValor + 1); i < segundoValor; i++){
                        System.out.println(i);
                    }
                
            }else if(segundoValor < primeiroValor){
                // O segundo valor é maior
                    for(int i = (segundoValor + 1); i < primeiroValor; i++){
                        System.out.println(i);
                    }
                
            }else{
                
                // Os valores são iguais
                System.out.println("Valores iguais não contam bobão.");
            }
    }
}
