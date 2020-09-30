package ValorMultiplos;

import java.util.Scanner;
public class ValorMultiplos {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int valor1,valor2;
        System.out.print("Digite o 1º valor:");
            valor1 = t.nextInt();
        System.out.print("Digite o 2º valor:");
            valor2 = t.nextInt();

            if(valor1 % valor2 == 0 || valor2 == 0){
                System.out.println("São multiplos!");
        }else{
                System.out.println("Não são multiplos!");
            }
            t.close();
    }
    
}
