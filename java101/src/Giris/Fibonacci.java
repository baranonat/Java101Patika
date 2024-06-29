package Giris;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		
		
		System.out.print("Bir sayı giriniz: ");
		int sayi= input.nextInt();
		int result=0;
		int a=0;
		int b=1;
		int c;
		System.out.print("0"+","+"1"+",");
			for(int i=2; i<sayi; i++) {
				c=a+b;
				a=b;
				b=c;
				System.out.print( c+",");
			}
			
		
		
		
		/*
		 * 0 1 1 2 3 5
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
