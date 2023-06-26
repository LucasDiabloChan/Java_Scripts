// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //
/*
 * Descrição: Exibe N números e mostra os múltiplos de 10.
 * Autor: Prof. Lucas
 * Data de criação: 26/06/2023
 * Data de atualização: --/--/----
 */
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //

// Diz aos outros arquivos onde encontrar essa classe
package LucasSouza_Desafios; 

public class LucasSouza_Desafio01{
	public static void main(String[] args){
      	/* Declaração da variáveis */
			int contadorMultiploDeDez = 0;
		
      	/* Imprime os N números */
        	for (int contador = 0; contador <= 200; contador++){
          	
				// Verifica se o 'contadorMultiploDeDez' chegou a dez (10)
	          	if(contadorMultiploDeDez == 10){
	          		System.out.println("O número '" + contador + "' é múltiplo de dez!");
	          		contadorMultiploDeDez = 0; // Zera o contador
	          	}else{
	          		System.out.println(contador);
	          	}
          		    
          		contadorMultiploDeDez++;
    		} 
	}
}
