package Giris;

import java.util.Scanner;

public class Palindrom {
	
	
	static void isPalindrom(int number) {
		
		
		int temp; int reverseNumber=0, lastNumber;
		temp=number;
		while(temp!=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		if(reverseNumber==number) {
			System.out.print("Palindrom sayidir");
		}
		else {
			System.out.print("Palindrom sayi değildir");
		}
	}
	
	

	public static void main(String[] args) {
			
			System.out.print("Bir sayı giriniz: ");
			Scanner input =new Scanner(System.in);
			int sayi=input.nextInt();
		    isPalindrom(sayi);
		
		
		
		
		
		
	}

}
