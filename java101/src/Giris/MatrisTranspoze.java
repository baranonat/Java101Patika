package Giris;

import java.util.Arrays;

public class MatrisTranspoze {

	public static void main(String[] args) {

		
		System.out.println("Matris:");
		int[][] dizi1= {
				{2,3,4},
				{5,6,4},
				
							
		};
		int[][] dizi2=new int[3][3];
		
		for (int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(dizi1[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Transpoze:");
	
		for (int i=0; i<dizi1.length+1; i++) {
			for(int j=0; j<dizi1.length; j++) {
				dizi2[i][j]=dizi1[j][i];
				System.out.print(dizi2[i][j]+"  ");
			}
			System.out.println();
		}
		
			
		
		
		
		
		
		
		
		
	}

}
