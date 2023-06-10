/*
 * Description: Calcula o perímetro de um círculo
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

import java.util.Scanner;

public class LucasSouza_Exercicio06{
    public static void main (String[] args){
        /* CRIAÇÃO DAS VARIÁVEIS */
            Scanner read = new Scanner(System.in);
            float raio;
            double doisPi;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            raio = 0f;
            doisPi = Math.PI * 2;

        /* RECEBENDO OS VALORES */
            System.out.println("Insira o raio: ");
            raio = read.nextFloat();
            
        /* EXIBE O RESULTADO */
            System.out.println("O perímetro mede: " + (doisPi * raio));

        /* ENCERRA O LEITOR */
            read.close();
    }
}
