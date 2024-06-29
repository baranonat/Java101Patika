package Giris;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	int dodge;
	
	
	public Match(Fighter f1,Fighter f2, int minWeight,int maxWeight) {
		
		
		this.f1=f1;
		this.f2=f2;
		this.minWeight=minWeight;
		this.maxWeight=maxWeight;
		
		
	}
	
	void run() {
		if(ischeck()) {
			while(this.f1.healty>0 && this.f2.healty>0) {
				System.out.println("Yeni Raund=============");
				this.f2.healty=this.f1.hit(f2);
				if(isWin()) {
					break;
				}
				
				this.f1.healty=this.f2.hit(f1);
				if(isWin()) {
					break;
				}  
				System.out.println(this.f1.name+ " Sağlık:" + this.f1.healty);
				System.out.println(this.f2.name+ " Sağlık:" + this.f2.healty);
			}
		
		}else {
			System.out.println("Sporcuların sikletleri uymuyor.");
		}
		
	}
	boolean ischeck() {
		
		return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight); 
			
			
		
	}
	
	boolean isWin() {
		if(this.f1.healty==0) {
			System.out.println(this.f2.name+ " kazandı");
			return true;
		}
		if(this.f2.healty==0) {
			System.out.println(this.f1.name+ " kazandı");
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
}
