/*
 * Description: Limpa o terminal
 * Author: Prof. Lucas
 * Created at: 10 jun. 2023
 * Updtated at: 10 jun. 2023
 */

package MeusTestes;

import java.io.IOException;

public class LimpaTela {
    public static void limpaTela() throws InterruptedException, IOException{
        //Limpa a tela no windows, no linux e no MacOS
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cls").inheritIO().start().waitFor();
            }else{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch(Exception ex){
            System.out.println("Ó u erro: " + ex.getMessage());
        }
  }
}
