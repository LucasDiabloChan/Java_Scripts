/*
 * Description: Exibe a soma de 4 valores
 * Author: Prof. Lucas
 * Created at: 27 jun. 2023
 * Updtated at: 27 jun. 2023
 */

package LucasSouza_QuartaLista;

import java.util.Scanner;

public class LucasSouza_Exercicio02{
	public static void main(String[] args){
		        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
        
        	Scanner leitor;
			int soma;
		
			leitor = new Scanner(System.in);
			soma = 0;
			
        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
            
        	while(true){
        	    
                System.out.println("Digite 3 valores: ");
				for (int i = 1; i <= 3; i++){
				    soma += leitor.nextInt();    
				}
    			
    			// Se 'soma' for igual a 48 ou 71
    			if(soma == 48 || soma == 71){
    			    // Para a execução do laço
    			    break; 
    			}
    			
    			soma = 0;
			}
			
			System.out.println("Acabou!");
			
        // - - - - - - - - - - - - - - - - - - - - - - - - - - //
	}
}
