package Giris;

import java.util.Scanner;

public class ArmstrongSayiBulma {

	public static void main(String[] args) {

		
		
		int sayi;		
		int basamakSayisi=0;
		int basValue;
		int result=0;
		int basPow;
		System.out.print("Bir sayı giriniz: ");
		Scanner input =new Scanner(System.in);
		sayi=input.nextInt();
		int tempSayi=sayi;
		
		while(tempSayi!=0) {
		tempSayi=tempSayi/10;
		basamakSayisi++;
	
		
	}
		tempSayi=sayi;
	
		while(tempSayi!=0) {
			basValue=tempSayi%10;
			tempSayi=tempSayi/10;
			basPow=1;
			for(int i=1; i<=basamakSayisi; i++) {
				basPow*=basValue;
			}
			result+=basPow;
		}		
		if(sayi==result) {
			System.out.println("Girdiğiniz sayi bir amstrong sayidir");
		}else {
			System.out.println("Girdiğiniz sayi bir amstrong sayı değildir.");
		}
		
		
		
		
		
		
		
}

}