package ValorConta;

import java.util.Scanner;
public class ValorConta {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        double cod,valor = 0,quantidade;
        
        System.out.print("Digite o código do item:");
            cod = t.nextInt();
            
        System.out.print("Digite a quantidade de itens:");
            quantidade = t.nextInt();
        
            if(cod == 1){
                valor = 4;
                valor = valor * quantidade;
            }else{
                if(cod == 2){
                    valor = 4.50;
                    valor = valor * quantidade;
                }else{
                    if(cod == 3){
                        valor = 5;
                        valor = valor * quantidade;
                    }else{
                        if(cod == 4){
                            valor = 2;
                            valor = valor * quantidade;
                        }else{
                            if(cod == 5){
                                valor = 1.50;
                                valor = valor * quantidade;
                            }
                        }
                    }
                }
            }
            System.out.println("O valor da compra é:R$"+valor);
    }
    
}
