package Java;


class DefaultConstructor{  
	int id;  
	String name;  
	
	DefaultConstructor(int i, String n){
	
		id=i;
		name=n;
		
	}//method to display the value of id and name  
	void display(){
		System.out.println(id+" "+name);
		}  
	  
	public static void main(String args[]){  
	//creating objects  
		DefaultConstructor s1=new DefaultConstructor(1, "u");  
		DefaultConstructor s2=new DefaultConstructor(2, "k");  
	//displaying values of the object  
	s1.display();  
	s2.display();  
}  
}  