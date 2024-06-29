package Giris;

public class DizilerdeMinMaxBulma {

	
	
	
	
	public static void main(String[] args) {
		
		
		
		int[] liste= {56,34,1,8,-33,22};
		
		
		int min= liste[0];
		int max=liste[0];
		
		for(int i=0; i<liste.length; i++) {
			if(liste[i]<min) {
				min=liste[i];
			}
			if(liste[i]>max) {
				max=liste[i];
			}
			
			
		}
		System.out.println("Dizideki min değer: "+min);
		System.out.println("Dizideki max değer: "+max);
		
		
		
		
	}
}
