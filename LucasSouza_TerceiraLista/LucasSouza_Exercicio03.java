/*
 * Description: Calcula a média de N números inseridos pelo usuário.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio03{
    public static void main(String[] args){
        
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            int contador;
            float acumulador, valorInserido;
            
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            contador = 0;
            acumulador = valorInserido = 0.0f;    
        
		
        /* RECEBE OS VALORES */
            System.out.println("Para sair do programa, digite 0.");
		
			do{
			    // Pega um número
				System.out.println("Insira um número: ");
					valorInserido = reader.nextFloat();
                
                // Soma esse número com os anteriores				
				acumulador += valorInserido;
				
				// Se o usuário digitou um número válido, incrementa o contador
				if(valorInserido != 0)
					contador++;

            }while(valorInserido != 0);
        
        /* MOSTRA OS DADOS PROCESSADOS */
			System.out.println("Quantidade de notas inseridas: " + (contador));
			System.out.println("Soma das notas inseridas: " + (acumulador));
			System.out.println("Média das notas inseridas: " + (acumulador/contador));
    }
}
