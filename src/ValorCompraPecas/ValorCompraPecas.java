package ValorCompraPecas;

import java.util.Scanner;
public class ValorCompraPecas {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);

        //Exercício 5
        double codPeca,numPeca,valorPeca,valorFinal;
        
         System.out.print("Digite o código da peça:");
            codPeca = t.nextDouble();
            
         System.out.print("Digite a quantidade de peça:");
            numPeca = t.nextDouble();
            
         System.out.print("Digite o valor da peça:");
            valorPeca = t.nextDouble();
            
            valorFinal = numPeca * valorPeca;
            
        System.out.print("Digite o código da peça 2:");
            codPeca = t.nextDouble();
            
         System.out.print("Digite a quantidade de peça 2:");
            numPeca = t.nextDouble();
            
         System.out.print("Digite o valor da peça 2:");
            valorPeca = t.nextDouble();
            
         valorFinal = valorFinal + (numPeca * valorPeca);
         
         System.out.println("O valor a ser pago é:R$"+valorFinal);

         t.close();
    }
    
}
