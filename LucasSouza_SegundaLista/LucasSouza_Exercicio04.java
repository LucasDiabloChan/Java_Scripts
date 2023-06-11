/*
 * Description: Troca os valores entre duas variáveis.
 * Author: Prof. Lucas.
 * Created at: 11/06
 * Updated at: 11/06/2023
 */

import java.util.Scanner; // Traz a classe Scanner

public class LucasSouza_Exercicio04 {
    public static void main(String[] a){
        
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner read = new Scanner(System.in);
        
            int valorA, valorB, backupDoA;
        
        /* PEGA OS VALORES */
            System.out.println("Insira dois números: ");
                valorA = read.nextInt();
                valorB = read.nextInt();
        
        /* ALTERA OS VALORES */
            backupDoA = valorA;
        
            valorA = valorB;
        
            valorB = backupDoA;
        
        /* RETORNO VISUAL */
            System.out.println("Valores invertidos: ");
            System.out.println(valorA);
            System.out.println(valorB);
    }
}
