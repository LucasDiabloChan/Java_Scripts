/*
 * Description: Mostra o antecessor e sucessor de um número.
 * Author: Prof. Lucas
 * Created at: 11/06/2023
 * Updated at: 11/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio05{
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner leia;
            int numeroInserido;

        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            leia = new Scanner(System.in);
            numeroInserido = 0;

        /* RECEBE O NÚMERO */
            System.out.println("Insira um valor numérico inteiro:");
            numeroInserido = leia.nextInt();

        /* MOSTRA: ANTECESSOR // NUMERO // SUCESSOR */
            System.out.println("Antecessor: " + (numeroInserido - 1));
            System.out.println("Número escolhido: " + numeroInserido);
            System.out.println("Sucessor: " + (numeroInserido + 1));
    }
}
