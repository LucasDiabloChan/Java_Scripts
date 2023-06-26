// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //
/*
 * Descrição: Mostra X vezes um número X inserido pelo usuário
 * Autor: Prof. Lucas
 * Data de criação: 26/06/2023
 * Data de atualização: --/--/----
 */
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //

package LucasSouza_Desafios;
import java.util.Scanner;

public class LucasSouza_Desafio02{
	public static void main(String[] args){
		/* DECLARAÇÃO DE VARIÁVEIS */
    		Scanner leitor;
    		int numeroInserido;
        
        /* INICIALIZAÇÃO DE VARIÁVEIS */
    		leitor = new Scanner(System.in);
    		numeroInserido = 0;

        /* PEGA O VALOR DO USUÁRIO */
    		System.out.println("Insira um número inteiro positivo: ");
    		numeroInserido = leitor.nextInt();
		
		System.out.println("\nVeja a magia acontecer: \n"); // Efeito embelezante para o terminal

		// Mostra o número inserido pelo usuário X vezes
		for(int contador = 0; contador < numeroInserido; contador++){
			// Mostra o número digitado pelo usuário
			System.out.println(numeroInserido); 
		}
	}
}
