package SalarioFuncionario ;

import java.util.Scanner;
public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);

        //Exercicío 4
        double numFun,horasTrab,pagamentoHora,salarioFun;
        
        System.out.print("Digite o código do funcionário:");
            numFun = t.nextDouble();
            
        System.out.print("Digite a quantidade de horas tralbahadas pelo funcionário:");
            horasTrab = t.nextDouble();
            
        System.out.print("Digite o valor do pagamento por hora do funcionário:");
            pagamentoHora = t.nextDouble();
        
        salarioFun = horasTrab * pagamentoHora;
        
        System.out.printf("O salário do funcionário é:R$%.2f%n",salarioFun);
        
        t.close();
        
    }
    
}
