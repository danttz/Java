package ValorPositivoOuNegativo;

import java.util.Scanner;
public class ValorPositivoOuNegativo {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Digite um número:");
            int valor = t.nextInt();
        if(valor <0){
            System.out.println("Seu valor é negativo!");
        }else{
            System.out.println("Seu valor é positivo!");
        }
        
        t.close();
    }
    
}
