package session7Quiz;

import java.util.Scanner;

class Person{
	public String name;
	public int born_date;
	
	public Person(String name, int born_date){
		this.name = name;
		this.born_date = born_date;
	}
	
	public void sleep() {
		System.out.println("zzz..." + name + " is now sleeping.a");
	}
	
	public void print() {
		System.out.println("name: "+ name);
		System.out.println("born_date: "+ born_date);
	}
}

class Mahasiswa extends Person{
	public String student_id;
	public int point = 0;
	public Mahasiswa(String name, int born_date, String student_id) {
		super(name, born_date);
		this.student_id = student_id;
	}
	
	public void helpingDosen() {
		System.out.println("Shees," + name + " helped a dosen!");
		this.point += 10;
		System.out.println("New point: " + point);
	}
	
	public void print() {
		System.out.println("-=-=Student Stats=-=-");
		System.out.println("Name: " + name);
		System.out.println("Birth date: " + born_date);
		System.out.println("Student id: " + student_id);
		System.out.println("Point: " + point);
	}
}

class Dosen extends Person{
	public String code_dosen;
	
	public Dosen(String name, int born_date, String code_dosen){
		super(name, born_date);
		this.code_dosen = code_dosen;
	}
	
	public void selfDev() {
		System.out.println(name + " gained self development cookie! Wow!");
	}
	
	public void teach() {
		System.out.println("1 + 1 = 11. This is what" + name + " taught to the students");
	}
	
	public void p2m() {
		System.out.println("What's p2m?");
	}
	
	public void research() {
		System.out.println("Science!" + name + " has researched!");
	}
	
	public void otherWorks() {
		System.out.println(name + " is now doing odd jobs that is kinda sus...");
	}
	
	public void print() {
		System.out.println("-=-=Dosen Stats=-=-");
		System.out.println("Name: " + name);
		System.out.println("Birth date: " + born_date);
		System.out.println("Dosen id: " + code_dosen);
	}
}



public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input person:");
		String name;
		int birth_date;
		System.out.println("Name: ");
		name = sc.next();
		System.out.println("Birth date:");
		birth_date = sc.nextInt();
		
		Person p = new Person(name, birth_date);
		p.print();
		p.sleep();
		
		
		System.out.println("Input dosen:");
		System.out.println("Name: ");
		
		name = sc.next();
		System.out.println("Birth date (just the date): ");
		
		birth_date = sc.nextInt();
		System.out.println("Dosen code(numbers only): ");
		String code_dosen;
		code_dosen = sc.next();
		
		Dosen ds = new Dosen(name, birth_date, code_dosen);
		
		ds.selfDev();
		ds.teach();
		ds.p2m();
		ds.research();
		ds.otherWorks();
		ds.sleep();
		ds.print();
		
		System.out.println("Add a mahasiswa");
		System.out.println("Name: ");
		name = sc.next();
		System.out.println("Bith date (just the date): ");
		birth_date = sc.nextInt();
		System.out.println("student id: ");
		String studentId;
		studentId = sc.next();
		
		Mahasiswa ms = new Mahasiswa(name, birth_date, studentId);
		
		ms.print();
		ms.helpingDosen();
		ms.sleep();
	
		
	}

}
