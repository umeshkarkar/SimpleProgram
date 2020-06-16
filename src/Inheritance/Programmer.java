package Inheritance;

class Programmer extends Employee{
	
	int bonus= 40000;
	
	void subclass(){
		System.out.println("Subclass");
	}
	
	public static void main(String[] args){
		
		Programmer p = new Programmer();
		
	 System.out.println("Salary "+p.f);
	 System.out.println("Bonus "+p.bonus);
		
	 p.display();
	 p.subclass();
	}
}