package Giris;

public class OgrenciBilgiSistemi {

	public static void main(String[] args) {

	Teacher t1=new Teacher("baran", "050854843234", "TRH");
	Teacher t2=new Teacher("volkan", "05084859232", "FZK");
	Teacher t3=new Teacher("oguz", "06745684865849", "KMY");
	
	Course c1=new Course("Tarih", "101", "TRH");
	Course c2=new Course("Fizik", "102", "FZK");
	Course c3=new Course("Kimya", "103", "KMY");
	
	Student s1=new Student("zeynep", "2081", "4", c1, c2, c3);
	Student s2=new Student("birgül", "2086", "4", c1, c2, c3);
	Student s3=new Student("ali", "2085", "4", c1, c2, c3);
	
	s1.addBulkExamNote(100, 50, 30);
	s1.calcAvarage();
		s1.isPass();
	}

}
