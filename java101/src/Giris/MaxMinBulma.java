package Giris;

import java.util.Scanner;

public class MaxMinBulma {

	public static void main(String[] args) {


		int sayi;
		int gir;
		Scanner input =new Scanner(System.in);
		
		while(true) {
			System.out.print("Kaç tane sayı gireceksiniz? ");
			sayi=input.nextInt();
			if(sayi>1) {
				System.out.print("1. Sayıyı giriniz: ");
				int max=input.nextInt();
				int min=max;
				
				for(int i=2; i<=sayi; i++) {
					System.out.print(i+"."+"Sayıyı Giriniz: ");
					gir=input.nextInt();
					
					if(gir > max) 
						max=gir;
						
					else if(gir< min)
						min=gir;
				}
				System.out.println("En büyük sayı: "+max);
				System.out.println("En küçük sayı: "+min);
				break;
			
			}else {
				System.out.println("Lütfen doğru sayı giriniz!!!");
			}
		
		}
	
	
	
	
	
	
	
		
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
