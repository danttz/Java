package CalculaAreaFormas;

import java.util.Scanner;
public class CalculaAreaFormas {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);

        //Exercicio 6
        
        double a,b,c,areaTrianguloRetangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
        
        System.out.print("Digite o primeiro valor:");
            a = t.nextDouble();
        System.out.print("Digite o segundo valor:");
            b = t.nextDouble();
        System.out.print("Digite o terceiro valor:");
            c = t.nextDouble();
        
        areaTrianguloRetangulo = (a * c)/2;
        
        System.out.println("O valor da Área do triangulo retangulo é:"+areaTrianguloRetangulo);
        
        areaCirculo = Math.pow(c,2)* 3.14159;
        
        System.out.println("O valor da Área do circulo é:"+areaCirculo);
        
        areaTrapezio = ((a + b)/2)*c;
        
        System.out.println("O valor da Área do trapézio é:"+areaTrapezio);
        
        areaQuadrado = Math.pow(b,2);
        
        System.out.println("O valor da Área do quadrado é:"+areaQuadrado);
        
        areaRetangulo = a * b;
        
        System.out.println("O valor da Área do retangulo é:"+areaRetangulo);
        
        t.close();
    }
    
}
