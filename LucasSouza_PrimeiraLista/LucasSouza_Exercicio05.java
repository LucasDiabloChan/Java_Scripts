/*
 * Description: Exibe a classificação etária de uma pessoa pela idade
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio05{
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner read = new Scanner(System.in);
            short idade;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            idade = 0;
        
        /* RECEBENDO OS VALORES */
            System.out.println("Insira sua idade: ");
            idade = read.nextShort();
            
        /* EXIBE A CONVERSÃO */
            if(idade >= 65)
                System.out.println("Tu é idoso.");
            else if(idade >= 19)
                System.out.println("Tu é adulto.");
            else if(idade >= 12)
                System.out.println("Tu é adolescente.");
            else if(idade >= 0)
                System.out.println("Tu é um bebê.");
            else
                System.out.println("Para de mentir macho, tu tem " + idade + " anos?");    
    
        /* ENCERRA O LEITOR */
            read.close();
    }
}
