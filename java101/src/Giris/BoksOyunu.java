package Giris;

public class BoksOyunu {

	public static void main(String[] args) {
		Fighter f1=new Fighter("Baran", 10, 75, 120,60);
		Fighter f2=new Fighter("Volkan", 20, 90, 95,80);
		
		
		Match m1= new Match(f1, f2, 95,120);
		m1.run();
		
	}

}
