/*
 * Description: Exibe todos os números impares entre 0 e 1000.
 * Author: Prof. Lucas
 * Created at: 12/06/2023
 * Updated at: 12/06/2023
 */

public class LucasSouza_Exercicio03{
    public static void main(String[] args){
            
        /* EXIBE OS NÚMEROS IMPARES */
            for(int num = 0; num < 1000; num++){
                if((num % 2) != 0)
                    System.out.println(num);
            }  
    }
}
