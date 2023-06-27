/*
 * Description: Exibe a soma de 4 valores
 * Author: Prof. Lucas
 * Created at: 27 jun. 2023
 * Updtated at: 27 jun. 2023
 */

package LucasSouza_QuartaLista;

import java.util.Scanner;

public class LucasSouza_Exercicio03{
	public static void main(String[] args){
        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
        
        	Scanner leitor;
        	Random gerador;
			int somaDosInteiros;
			float somaDosQuebrados;
		
			leitor = new Scanner(System.in);
			gerador = new Random();
			somaDosInteiros = 0;
			somaDosQuebrados = 0.0f;
			
        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
            
        	for(int i = 0; i < 50; i++){
        	    
        	    /* GERA E ARMAZENA OS VALORES */
                    // inteiros
                    somaDosInteiros += gerador.nextInt();
                    // decimal
                    somaDosQuebrados += gerador.nextFloat();
            }
			
			if(somaDosQuebrados > somaDosInteiros){
			    System.out.println("A soma dos 'quebrados' é maior que a de 'inteiros'.");
			}else{
			    System.out.println("A soma dos 'inteiros' é maior que a de 'quebrados'.");
			}
			
			System.out.println("Soma dos inteiros: " + somaDosInteiros + "\nSoma dos quebrados: "  + somaDosQuebrados);
			
        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
	}
}
