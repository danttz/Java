package CalculaAreaCirculo;

import java.util.Scanner;
public class CalculaAreaCirculo {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
       
        //Exercício 1
        int valor1,valor2,res;
        
        System.out.print("Digite o primeiro valor:");
            valor1 = t.nextInt();
        System.out.print("Digite o segundo valor");
            valor2 = t.nextInt();
        
        res = valor1 + valor2;
        System.out.println("A soma de "+valor1+" + "+valor2+" é = "+res);
        
        t.close();
    }
    
}
