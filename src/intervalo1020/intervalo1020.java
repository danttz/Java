package intervalo1020;

import java.util.Scanner;
public class intervalo1020 {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.print("N:");
        int n = t.nextInt();
        int in = 0,out = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Valor:");
                int valor = t.nextInt();
            if(valor >= 10 && valor <= 20){
                 in += 1;
             }else{
                out +=1;
            }
         }
        System.out.println(in+" in e "+out+" out");
        }
}