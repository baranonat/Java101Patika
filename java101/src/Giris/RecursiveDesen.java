package Giris;

import java.util.Scanner;

public class RecursiveDesen {

	
	
	static void desen1(int sayi,int temp) {
		if(sayi>0) {
			System.out.print(sayi+ " ");
			desen1(sayi-5, temp);
		}
		else if(sayi<=0){
			desen2(sayi, temp);
		}
	}
	static void desen2 (int sayi,int temp) {
	
		if(temp>=sayi) {
			System.out.print(sayi+" ");
			desen2(sayi+5, temp);
		}
	}
	
	public static void main(String[] args) {
			
		
		int temp;
		Scanner input =new Scanner(System.in);
		System.out.print("Bir sayı girin: ");
		int sayi=input.nextInt();
		temp=sayi;
		desen1(sayi, temp);
		
		
		
	}

}
