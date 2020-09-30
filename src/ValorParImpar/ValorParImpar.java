package ValorParImpar;

import java.util.Scanner;
public class ValorParImpar {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
    
        System.out.print("Digite um valor:");
            int valor = t.nextInt();
        if(valor % 2 != 0){
            System.out.println("O valor é ímpar!");
        }else{
            System.out.println("O valor é par!");
        }
        
        t.close();
    }
    
}
