package Giris;

public class DizilerdeOrtalamaBulma {

	public static void main(String[] args) {
		
		
		
		int[] liste= {1,2,3,4,5};
		
		double sum=0;
		for(int i=0; i<liste.length; i++) {
			sum+=liste[i];
		}
		double ortalama=sum/liste.length;
		
		System.out.println("Ortalama: "+ortalama);
		
		
	}

}
