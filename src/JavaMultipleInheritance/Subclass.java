package JavaMultipleInheritance;

public class Subclass extends Parent1{

	 void show(){
		System.out.println("child class");
	}
	
	public static void main(String[] args){
		
		Parent1 p = new Parent1();
		
		p.show();
		
		Parent1 p1 = new Subclass();
		
		p1.show();
				
		
	}

	}

