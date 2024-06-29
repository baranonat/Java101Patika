package Giris;

import java.util.Arrays;
import java.util.Scanner;

public class Dizi1 {

	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
			System.out.print("Dizinin boyutu n : ");
			int n=input.nextInt();
			int sayi;
			System.out.println("Dizinin elemanlarını giriniz: ");
			int[] dizi=new int[n];
			for(int i=0; i<dizi.length; i++) {
				System.out.print((i+1)+". Elemanı: ");
				sayi=input.nextInt();
				dizi[i]=sayi;
			}
			
			System.out.print("Sıralama:");
			Arrays.sort(dizi);
			System.out.println(Arrays.toString(dizi));
			
	}

}
