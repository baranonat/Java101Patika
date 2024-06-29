package Giris;

public class Course {
	
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	
	
	
	
	
	public Course(String name,String code,String prefix) {
		
		this.name=name;
		this.code=code;
		this.prefix=prefix;
	
		
		
		
		
	}
	void addTeacher(Teacher teacher) {
		this.teacher=teacher;
	}
	
	void printTeacher() {
		System.out.println();
	}

}
