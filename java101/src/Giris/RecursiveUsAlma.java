package Giris;

import java.util.Scanner;

public class RecursiveUsAlma {

	
	
	
	static int UstAlma(int a, int b) {
		
		if(a==1 || b==0) {
			
			return 1;
		}
		
		return a*UstAlma(a, b-1);
		
	}
	public static void main(String[] args) {

		
		Scanner input =new Scanner(System.in);
		System.out.print("Taban değerini giriniz: ");
		int sayi1=input.nextInt();
		System.out.print("Üs değerini giriniz: ");
		int sayi2=input.nextInt();
		System.out.println("Sonuç:"+UstAlma(sayi1, sayi2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
