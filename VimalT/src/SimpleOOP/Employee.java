package SimpleOOP;

import java.util.Scanner;

public class Employee {
	
	//with fields name, designation, age, place of birth
	static int age;
	String name, designation, POB;
	float salary;
	//static int sum = 0;
	
	public void getAge() {
		System.out.println("Employee Age "+age);
	}

	public void setAge(int age) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		this.age = age;                 //refer instance variable of current class
		     
	}
	
	

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPOB() {
		return POB;
	}

	public void setPOB(String pOB) {
		POB = pOB;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}*/

	
	
	/*public void display() {
		System.out.println("Employee Name " +age);
		System.out.println("Employee Designation "+designation);
		System.out.println("Employee Place of Birth "+ POB);
		System.out.println("Age of employee" + age);
		System.out.println("Salary of employee "+salary);
	}*/
	
	public static void main(String args[]) {
		int sum= 0;
		Employee E[]=new Employee[5];
		for (int i =0; i<5; i++) {
			E[i]= new Employee();
			E[i].setAge(i);
			E[i].getAge();
			sum = sum + age;
		}
		
		System.out.println("Sum of age="+sum);
		
		
		}
		//E.setAge(24);
		//System.out.println("Age of employee" +E.getAge());
		//System.out.println(Ë.getAge());
		/*E.setDesignation("Consultant");
		E.setName("Trisha");
		E.setPOB("Orissa");
		E.setSalary(10567.89f);*/
		
		//E.display();
		
	}


