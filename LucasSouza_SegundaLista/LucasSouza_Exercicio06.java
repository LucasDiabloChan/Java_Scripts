/*
 * Description: Calcula o preço final de uma venda de consumíveis.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio06{
    public static void main(String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            int qtdDePicoleDeLaranja, qtdDePicoleDeKiwi, qtdDePicoleDeRoma;
            float precoPicoleLaranja, precoPicoleKiwi, precoPicoleRoma, precoFinal;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            qtdDePicoleDeLaranja = qtdDePicoleDeKiwi = qtdDePicoleDeRoma = 0;
            precoPicoleLaranja = precoPicoleKiwi = precoPicoleRoma = precoFinal = 0.0f;
      
        /* RECEBE OS VALORES */
            System.out.println("Insira a quantidade de picolés de Laranja a ser comprado: ");
                qtdDePicoleDeLaranja = reader.nextInt();
      
            System.out.println("Insira a quantidade de picolés de Kiwi a ser comprado: ");
                qtdDePicoleDeKiwi = reader.nextInt();
      
            System.out.println("Insira a quantidade de picolés de Roma a ser comprado: ");
                qtdDePicoleDeRoma = reader.nextInt();
      
        /* CALCULA O VALOR TOTAL A PAGAR */
            precoFinal = (qtdDePicoleDeLaranja * precoPicoleLaranja) + (qtdDePicoleDeKiwi * precoPicoleKiwi) + (qtdDePicoleDeRoma * precoPicoleRoma);
      
        /* EXIBE O PREÇO FINAL */
            System.out.println("O valor total a ser pago é: " + precoFinal);
    }
}
