package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	
		
	static int sum(int a,int b) {
		 int result= a+b;
		 System.out.println("Toplam: "+ result);
		return result;
	}
	
	static int minus(int a,int b) {
		 int result= a-b;
		 System.out.println("Çıkarma: "+ result);
		 return result;
	}
	static int times(int a,int b) {
		 int result= a*b;
		 System.out.println("Çarpma: "+ result);
		 return result;
	}
	static int divided(int a,int b) {
		
		 if(b==0) {
			 System.out.println("İkinci sayi 0 olamaz");
			 return 0;
		 }
		 int result= a/b;
		 System.out.println("Bölme: "+ result);
		 return result;
	}
	static int power(int a,int b) {
		int result=1;
		for(int i=0; i<b; i++) {
			result*=a;
		}
		System.out.println("Üs hesabı: "+result);
		return result;
	}
	
	static int mod(int a,int b) {
		int sonuc;
		sonuc=a%b;
		System.out.println("Mod: "+sonuc);
		return sonuc;
	}
	static void calc(int a, int b) {
		int cevre = 2*(a+b);
		System.out.println("Dikdörtgen Çevresi: "+cevre);
		int alan = a*b;
		System.out.println("Dikdörtgen Alanı: "+ alan);
		
	}
	public static void main(String[] args) {

		
		
		
		String menu= "1-Toplama İşlemi\n"
				+ "2-Çıkarma İşlemi\n"
				+ "3-Çarpma İşlemi\n"
				+ "4-Bölme İşlemi\n"
				+ "5-Üslü Sayı Hesaplama\n"
				+ "6-Mod Alma\n"
				+ "7-Dikdörtgen Alan ve Çevre Hesaplama\n"
				+ "0-Çıkış";
		
		int select,sayi1,sayi2;

		System.out.println(menu);
		while(true) {
			
			System.out.print("Bir işlem seçiniz: ");
			Scanner input =new Scanner(System.in); 
			select=input.nextInt();
			if(select==0) {
				break;
			}
			System.out.print("1. sayıyı giriniz: ");
			sayi1=input.nextInt();
			System.out.print("2. sayıyı giriniz: ");
			sayi2=input.nextInt();
			
			
			
			switch (select) {
			case 1:
				sum(sayi1,sayi2);
				break;

			case 2:
				minus(sayi1,sayi2);
				break;
			case 3:
				times(sayi1, sayi2);
				break;
			case 4:
				divided(sayi1,sayi2);
				break;
			case 5:
				power(sayi1, sayi2);
			
			case 6:
				mod(sayi1, sayi2);
				break;
			case 7:
				calc(sayi1, sayi2);
				break;
			default:
				System.out.println("Yanlış rakam girdiniz!!!!!");
				break;
			}
		}
		
		System.out.println("Güle güle...");
		
	}

}
