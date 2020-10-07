package postoGasolina;

import java.util.Scanner;
public class postoGasolina {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
                int a = 0,b = 0,c = 0;

                System.out.print("1.Álcool /m 2.Gasolina /n 3.Diesel /n 4.Fim: ");
                    int cod = t.nextInt();
                    
                   while(cod != 4){
                       
                        if(cod == 1){
                            a += 1;
                        }else if(cod == 2){
                            b +=1;
                        }else if(cod == 3){
                            c += 1;
                        }
                    System.out.print("1.Álcool /m 2.Gasolina /n 3.Diesel /n 4.Fim: ");
                        cod = t.nextInt();
                   }

            System.out.println("Muito obrigado!");
            System.out.println("Álcool:"+a+" Gasolina:"+b+" Diesel:"+c);
            t.close();
        }
}