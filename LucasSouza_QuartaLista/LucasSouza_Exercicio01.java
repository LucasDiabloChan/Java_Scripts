/*
 * Description: Exibe a soma de 4 valores
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

package LucasSouza_QuartaLista;

import java.util.Scanner;

public class LucasSouza_Exercicio01{
	public static void main(String[] args){
// - - - - - - - - - - - - - - - - - - - - - - - - - - //

		// Declaração 
		    Scanner leitor;
			int limiteDosNumeros, somaDasBases;
			
        // Inicialização
            leitor = new Scanner(System.in);
            somaDasBases = 0;
            
// - - - - - - - - - - - - - - - - - - - - - - - - - - //

        System.out.println("Insira um número: ");
		limiteDosNumeros = leitor.nextInt();
        
		for(int i = 1; i <= limiteDosNumeros; i++){
			int baseAoQuadrado = i * i;

			if(baseAoQuadrado % 4 == 0)
				somaDasBases += i;		
		}
		
		System.out.println("Soma das bases: ");
		System.out.println(somaDasBases);
		
// - - - - - - - - - - - - - - - - - - - - - - - - - - //
	}
}
