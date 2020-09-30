package ImpostoRenda;

import java.util.Scanner;
public class ImpostoRenda {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        double salario;
        System.out.print("Digite seu salário:"); salario = t.nextDouble();
        if(salario >= 0 && salario <= 2000){
            System.out.println("Isento!");
        }if(salario >= 2000.01 && salario <= 3000){
            salario = 8 * salario / 100;
            System.out.println("8% de imposto num total de R$"+salario);
        }if(salario >= 3000.01 && salario <= 4500){
            salario = 18 * salario /100;
            System.out.println("18% de imposto num total de R$"+salario);
        }if(salario >= 4500){
            salario = 28 * salario / 100;
            System.out.println("28% de imposto num total de R$"+salario);
        }
        t.close();
    }
    
}
