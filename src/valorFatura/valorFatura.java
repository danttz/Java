package valorFatura;

import java.util.Scanner;
public class valorFatura {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        int minutos = t.nextInt();
        
        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100)*2.0;
        }
        
        System.out.printf("Valor da conta = R$ %.2f%n",conta);
            t.close();
        }
}