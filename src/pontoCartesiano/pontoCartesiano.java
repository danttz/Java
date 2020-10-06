package pontoCartesiano;

import java.util.Scanner;
public class pontoCartesiano {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
                int i = 0;
                while(i < 1){
                System.out.print("Digite o primeiro ponto:");
                    int x = t.nextInt();
                
                System.out.print("Digite o segundo ponto:");
                    int y = t.nextInt();
                    
                    if(x > 0 && y > 0){
                        System.out.println("Primeiro quadrante!");
                    }if(x > 0 && y < 0){
                        System.out.println("Quarto quadrante!");
                    }if(x < 0 && y > 0){
                        System.out.println("Segundo quadrante!");
                    }if(x < 0 && y < 0){
                        System.out.println("Terceiro quadrante!");
                    }
                }
    }
}