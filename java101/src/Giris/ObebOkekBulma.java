package Giris;

import java.util.Scanner;

public class ObebOkekBulma {

	public static void main(String[] args) {

		
		
		int select;
		int n1;
		int n2;
		int obeb=1;
		Scanner input =new Scanner(System.in);
		System.out.println("1-Obeb Bulma:\n ");
		System.out.println("2-Ekok Bulma:\n");
		System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz: ");
		select=input.nextInt();
		switch (select) {
		case 1:
			System.out.print("Büyük olan sayıyı giriniz: ");
			n1=input.nextInt();
			System.out.print("Küçük olan sayıyı giriniz: ");
			n2=input.nextInt();
			for(int i=1; i<=n2;i++) {
				if(n1%i==0 && n2%i==0) {
					obeb=i;
				}
				
			}
			System.out.println("Obeb: "+ obeb);
			break;

		case 2:
			System.out.print("1. sayıyı giriniz: ");
			n1=input.nextInt();
			System.out.print("2. sayıyı giriniz: ");
			n2=input.nextInt();
			
			for(int i=1; i<=n1*n2; i++) {
				if(i%n1==0 && i%n2==0) {
					System.out.println("Ekokları: "+i);
					break;
				}
			}
			break;
		}
		
		
		
	}

}
