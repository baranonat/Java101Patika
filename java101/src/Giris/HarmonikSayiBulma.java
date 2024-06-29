package Giris;

import java.util.Scanner;

public class HarmonikSayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		int sayi;
		System.out.print("Sayi gir:");
		Scanner input =new Scanner(System.in);
		sayi=input.nextInt();
		double toplam=0;
		for(double i=1; i<=sayi; i++) {
			toplam+=(1/i);
		}
	
		System.out.println(toplam);
		
				
	}

}
