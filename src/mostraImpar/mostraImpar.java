package mostraImpar;

import java.util.Scanner;
public class mostraImpar {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Digite o valor de x:");
            int x = t.nextInt();
            
        
        for(int i = 1; i <= x; i = i + 2 ){
            System.out.println(i);
        }
        t.close();
        }
}