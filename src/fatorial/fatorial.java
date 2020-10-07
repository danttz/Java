package fatorial;

import java.util.Scanner;
public class fatorial {

    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
		int n = t.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
        t.close();
        }
}