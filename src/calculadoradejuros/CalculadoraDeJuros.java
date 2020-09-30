package calculadoradejuros;

import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculadoraDeJuros {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int op,loop = 0;
        double j,c,i,n;
        while(loop < 1){
            System.out.print("Qual operação deseja executar?\nJuros Simples(1)/"
            + "Calculo capital(2)/Calculo da taxa(3)/Calculo do prazo(4) e (0) para finalizar:");
                op = t.nextInt();
            switch(op){
                /*Calculo de Juros simples*/
                case 1:{
                    System.out.print("Digite o valor do Capital:");
                        c = t.nextDouble();
                    System.out.print("Digite o valor da Taxa:");
                        i = t.nextDouble();
                    System.out.print("Digite o valor do Prazo:");
                        n = t.nextDouble();

                    j = (c*i*n)/100;

                    System.out.println("O calculo do Juros simples é:"+j);
                    break;
                }
                /*Calculo do capital*/  
                case 2:{
                    System.out.print("Digite o valor do Juros:");
                        j = t.nextDouble();
                    System.out.print("Digite o valor da Taxa:");
                        i = t.nextDouble();
                    System.out.print("Digite o valor do Prazo:");
                        n = t.nextDouble();
                    
                    c = j/( i/100 * n);
                    
                    System.out.println("O calculo do Capital é:"+c);
                    break;
                }
                /*Calculo da taxa*/
                case 3:{
                    System.out.print("Digite o valor do Capital:");
                        c = t.nextDouble();
                    System.out.print("Digite o valor do Prazo:");
                        n = t.nextDouble();
                    System.out.print("Digite o valor do Juros:");
                        j = t.nextDouble();
                    
                    i = (j/c*n)*100;
                    
                    System.out.println("O valor da Taxa é:"+i);
                    break;
                }
                /*Calculo do prazo*/
                case 4:{
                    System.out.print("Digite o valor do Capital:");
                        c = t.nextDouble();
                    System.out.print("Digite o valor da Taxa:");
                        i = t.nextDouble();
                    System.out.print("Digite o valor do Juros:");
                        j = t.nextDouble();
                    
                    n = j/(c*(i/100));
                    
                    System.out.println("O valor do Prazo é:"+n);
                    break;
                }
                case 0:{
                    loop = 1;
                    break;
                }
                /*Ajuste erro de valor não coerente*/
                default:{
                    System.out.println("Valor inválido!!!");
                    break;
                }
            }
        }
        t.close();
    }
    
}