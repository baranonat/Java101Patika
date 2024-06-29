package Giris;

public class Fighter {
	
	String name;
	int damage;
	int healty;
	int weight;
	int dodge;
	
	
	
	public Fighter(String name, int damage,int healty,int weight,int dodge) {
		
		this.name=name;
		this.damage=damage;
		this.healty=healty;
		this.weight=weight;
		if(dodge>=0 && dodge<=100) {
			this.dodge=dodge;
		}	
		
		
	}
	
	int hit(Fighter foe ) {
		System.out.println(this.name + "=>" + foe.name+" "+this.damage+ " hasar vurdu");
		if(foe.isDodge()) {
			System.out.println(foe.name+" hasarı blokladı");
			return foe.healty;
		}
		if(foe.healty-this.damage<0) {
		return 0;
	}
		return foe.healty-this.damage;
		
	}

	
	
	boolean isDodge() {
		
		 double randomNumber=Math.random()*100;
		 return randomNumber<=this.dodge;
	}
	
	
	
	
	
}
