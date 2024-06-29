package Giris;

public class AsalSayiYazdirma {

	public static void main(String[] args) {

		
		
		
		
		System.out.println("1-100 arasındaki asal sayılar...");
		
		
		
		
		
		

		for(int i=2; i<=100; i++) {
			boolean kontrol=false;
			for(int k=2; k<i; k++) {
				
				if(i%k==0) {
					kontrol=true;
					break;
				}
			}
		
		if(kontrol==false) {
			System.out.print(i+",");

		}
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
