package Giris;

import java.util.Scanner;

public class MukemmekSayi {

	public static void main(String[] args) {

		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi=input.nextInt();
		int toplam=0;
		for(int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				toplam+=i;
			}
			
		}
		if(toplam==sayi) {
			System.out.println(sayi+" sayisi"+" Mükemmel sayidir");
		}
		else {
			System.out.println(sayi+" sayisi"+" Mükemmel sayı değildir.");

		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
