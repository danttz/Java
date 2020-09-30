package ContaIntervalo;

import java.util.Scanner;
public class ContaIntervalo {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("Digite um valor e descubra seu intervalo:");
            double valor = t.nextDouble();
        if(valor >=0 && valor <= 25){
            System.out.println("Intervalo entre [0,25]");
        }else{
            if(valor >=25.1 && valor <=50){
                System.out.println("Intervalo entre [25,50]");
            }else{
                if(valor >= 50.1 && valor <= 75){
                    System.out.println("Intervalo entre [50,75]");
                }else{
                    if(valor >= 75.1 && valor <= 100){
                        System.out.println("Intervalo entre [75,100]");
                    }else{
                        System.out.println("Fora de intervalo!");
                    }
                }
            }
        }
        t.close();
    }
    
}
