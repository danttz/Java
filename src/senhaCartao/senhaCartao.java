package senhaCartao;

import java.util.Scanner;
public class senhaCartao {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
            int i = 0;
        while(i < 1){
            System.out.print("Senha:");
            int senha = t.nextInt();
            if(senha == 2002){
                System.out.println("Senha correta!");
                i++;
            }else{
                System.out.println("Senha incorreta!");
            }
        }
        t.close();
        }
}