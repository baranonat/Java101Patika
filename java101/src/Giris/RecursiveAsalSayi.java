package Giris;

import java.util.Scanner;

public class RecursiveAsalSayi {

	static String AsalMi(int a,int sinir) {
		
		if(a<2) {
			return a+" sayısı ASAL değildir!";
		}
		if(sinir==1) {
		return	a+" sayısı ASALDIR";
		}
		if(a%sinir==0) {
			return a+" sayısı ASAL değildir!";
		}
		return AsalMi(a, sinir-1);
	}
	public static void main(String[] args) {

		
		
		
		
		Scanner input =new Scanner(System.in);
		System.out.print("Sayı giriniz:");
		int sayi=input.nextInt();
		System.out.println(AsalMi(sayi, sayi/2));
		
		
		
	}

}
