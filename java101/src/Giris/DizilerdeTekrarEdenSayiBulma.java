package Giris;

import java.util.DuplicateFormatFlagsException;

public class DizilerdeTekrarEdenSayiBulma {
	
	
	static boolean isFind(int[] dumplite,int value) {
		
		for(int i:dumplite) {
			if(i==value) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		
		
		
		
		int[] dizi= {1,2,3,3,4,5,5,9,9,9,9,13,23};
		int[] dumplicate=new int[dizi.length];
		int startindex=0;
		
		for(int i=0; i<dizi.length; i++) {
			for(int j=0; j<dizi.length; j++) {
				if((i!=j) && (dizi[i]==dizi[j])) {
					if(!isFind(dumplicate,dizi[i])) {
						dumplicate[startindex++]=dizi[i];
					}
					break;
				}
				
			}
			
			
			
		}
		System.out.print("Tekrar eden sayilar:");
		
		for(int value:dumplicate) {
			if(value !=0) {
				System.out.print(value+",");
			}
		}
		
		
		

	}

}
