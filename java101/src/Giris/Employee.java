package Giris;

public class Employee {
	
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	
	
	public Employee(String name,double salary,int workHours,int hireYear) {
		
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	
	double tax() {
		double maas = 0;
		if(this.salary<1000) {
			return this.salary ;
		}
		else {
			return maas=(this.salary*3)/100;
		}
		
		
	}
	int bonus() {
		if(this.workHours>40) {
			return (this.workHours-40)*30;
			
		}
	return workHours;
		
		
		
		
		
	}
	
	double raiseSalary() {
		int year=2021;
		
		if((year-this.hireYear)<10) {
			return this.salary=(this.salary*5)/100;
		}
		else if ((year-this.hireYear)>9 && (year-this.hireYear)<20) {
			return this.salary=(this.salary*10)/100;
		}
	
			return this.salary=(this.salary*15)/100;
		
		
	}
	
	void toStringg() {
		
		int bonus=bonus();
		double vergi=tax();
		double yeniMaas=(bonus-vergi)+this.salary;
		double toplamMaas=yeniMaas+raiseSalary();
		System.out.println("Adı: "+this.name);
		System.out.println("Maaşı: "+this.salary);
		System.out.println("Çalışma Saati: "+this.workHours);
		System.out.println("Başlangıç Yılı: "+this.hireYear);
		System.out.println("Vergi: "+tax());
		System.out.println("Bonus: "+bonus());
		System.out.println("Maaş Artışı: "+raiseSalary());
		System.out.println("Vergi ve bonuslar ile birlikte maaş: "+yeniMaas );
		System.out.println("Toplam Maaş: "+toplamMaas );
		
		
		
		
	}
	
	
	
}
