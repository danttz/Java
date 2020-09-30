package diaSemana;

import java.util.Scanner;
public class diaSemana {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        int num;
        System.out.print("Escolha um número de 1 a 7:");
            num = t.nextInt();
            
        if(num == 1){
            System.out.println("Domingo");
        }if(num == 2){
            System.out.println("Segunda");
        }if(num == 3){
            System.out.println("Terça");
        }if(num == 4){
            System.out.println("Quarta");
        }if(num == 5){
            System.out.println("Quinta");
        }if(num == 6){
            System.out.println("Sexta");
        }if(num == 7){
            System.out.println("Sábado");
        }
        t.close();
        }
}