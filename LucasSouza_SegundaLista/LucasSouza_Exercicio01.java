// Todo seu código deve estar dentro dessa classe
public class LucasSouza_Exercicio01{
  
  // Todo seu código deve ser escrito/chamado aqui
  public static void main(String[] args){
      /* CRIAÇÃO DAS VARIÁVEIS */
          Scanner read = new Scanner(System.in);
          float desconto, valor;
        
      /* INICIALIZAÇÃO DAS VARIÁVEIS */
          valor = 0.0f;
          desconto = 0.85f; // 1 - (15 / 100) = 0.85
        
      /* RECEBENDO OS VALORES */
          System.out.println("Insira o valor a ser descontado: ");
          valor = read.nextFloat();
            
      /* EXIBE O RESULTADO */
          System.out.println("Sem desconto: " + (valor));
          System.out.println("Com desconto: " + (valor * desconto));
  }
}
