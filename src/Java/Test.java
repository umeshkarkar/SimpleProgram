package Java;


 public class Test {  
	 public static void main(String[] args){
		 
		 Employee e1 = new Employee();
		 Employee e2 = new Employee();
		 Employee e3 = new Employee();
		 
		 e1.insert(1, "Umesh", 45);
		 e2.insert(2, "karkar", 66);
		 e3.insert(3, "PKTTT", 77);
		 e3.insert(3, "PKTTT", 77);
		 e3.insert(3, "PKTTT", 77);
		 
		 e1.display();
		 e2.display();
		 e3.display();
		 e3.display();
		 e3.display();
		 
	 }
}