package Giris;



public class Student {
	
	Course c1;
	Course c2;
	Course c3;
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	
	
	public Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3) {
		
		this.name=name;
		this.stuNo=stuNo;
		this.classes=classes;
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		avarage=0.0;
		isPass=false;
		
	}
	
	void addBulkExamNote(int note1,int note2,int note3) {
		if(note1>=0 && note1<=100) {
			this.c1.note=note1;
		}
		if(note2>=0 && note2<=100) {
			this.c2.note=note2;
		}
		if(note3>=0 && note3<=100) {
			this.c3.note=note3;
		}
	
		
		
	}
	void calcAvarage() {
		
		this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
	}
	void isPass() {
		printNote();
		if(this.avarage>=55) {
			System.out.println("Sınıfı geçti");
			isPass=true;
		}
		else {
			System.out.println("Sınıfta kaldı");
			isPass=true;
		}
		
	}
	
	void printNote() {
		System.out.println(this.c1.name+" dersi notu: "+this.c1.note);
		System.out.println(this.c2.name+" dersi notu: "+this.c2.note);
		System.out.println(this.c3.name+" dersi notu: "+this.c3.note);
		System.out.println("Ortalama:"+this.avarage);
		
	}
	
}
