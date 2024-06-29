package Giris;

import java.util.Arrays;
import java.util.Scanner;


public class SayiTahminOyunu {

	
	
	
	public static void main(String[] args) { 
		
		Scanner input=new Scanner(System.in);
		int sayi;
		int count=5;
		int selected;
		int i=0;
		boolean isWin=false;
		boolean isWrong=false;
		int[] tahminler=new int[count];
		sayi=(int)(Math.random()*100);
		System.out.println("Gizli sayi:"+sayi);
			while(count>0) {
				System.out.print("Bir sayi tahmin ediniz:");
				selected=input.nextInt();
				if(selected>=0 && selected<=100) {
					if(sayi==selected) {
						System.out.println("Doğru Tahmin Tebrikler..");
						isWin=true;
						break;
					}
				else if(selected>sayi) {
						System.out.println(selected+" sayısı, gizli sayıdan büyüktür");
						count--;
						System.out.println("Kalan Hakkınız:"+count);
					}
					else if (selected<sayi) {
						System.out.println(selected+" sayısı ,gizli sayıdan küçüktür");
						count--;
						System.out.println("Kalan Hakkınız:"+count);
					}
				
						tahminler[i++]=selected;
				}
				else {
					System.out.println("Lütfen 0 ile 100 arasında bir sayı tahmin ediniz");
					if(isWrong) {
						count--;
						System.out.println("Birden fazla hatalı giriş yaptınız!");
						System.out.println("Kalan Hakkınız:"+count);
					}else {
						isWrong=true;
						System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir");
					}
				}
				
				
				if(count==0) {
					System.out.println("Kalan Hakkınız bitmiştir.");
					
					
					if(isWin==false && isWrong==false) {
						System.out.println("Kaybettiniz!!!");
						System.out.println("Tahminleriniz: "+Arrays.toString(tahminler));
						
					}
					
					
					
				}
				
			}
		
		
		
		
		
		
		
		
		
	}
	
	
}
