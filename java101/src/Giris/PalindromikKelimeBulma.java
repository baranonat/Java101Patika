package Giris;

import java.util.Scanner;

public class PalindromikKelimeBulma {

	static String Palindromik(String kelime) {
		int a=0;
		int b=kelime.length()-1;
		
		while(a<b) {
			
			
			if(kelime.charAt(a)!=kelime.charAt(b)) {
				return kelime+" palindromik kelime değildir.";
			} 
			a++;
			b--;
		}
		
		return kelime+" palindromik kelimedir.";
		
	
	}
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		
	
		System.out.print("Kelime Giriniz:");
		String kelime=input.nextLine();
		
		System.out.println(Palindromik(kelime));
		
		
	}

}
