package Giris;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		System.out.print("Basamak sayisi Giriniz: ");
		int sayi=input.nextInt();
		
		 for(int i=0; i<sayi; i++) {
            
               

             for(int j=1; j<=(2*(sayi-i)-1); j++)
                 System.out.print("*");

             System.out.println();
         }

		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
