package Giris;

import java.util.Scanner;

public class YildizlarUcgenYapimi {

	public static void main(String[] args) {

		
		
		
		
		int sayi;
		System.out.print("Bir sayi giriniz:");
		Scanner input =new Scanner(System.in);
		sayi=input.nextInt();
		
		
		
		for(int i=1; i<=sayi; i++) {
			for(int k=1; k<=(sayi-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
