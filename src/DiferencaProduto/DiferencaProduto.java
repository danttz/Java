package DiferencaProduto;

import java.util.Scanner;
public class DiferencaProduto {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        //Exercício 3
        int a,b,c,d,r;
        
        System.out.print("Digite o valor de A:");
            a = t.nextInt();
        System.out.print("Digite o valor de B:");
            b = t.nextInt();
        System.out.print("Digite o valor de C:");
            c = t.nextInt();
        System.out.print("Digite o valor de D:");
            d = t.nextInt();
            
        r = a*b-c*d;
        
        System.out.println("A diferença do produto de A e B com C e D é:"+r);
        
        t.close();
    }
    
}
