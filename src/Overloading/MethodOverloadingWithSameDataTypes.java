package Overloading;

public class MethodOverloadingWithSameDataTypes {

	 void sum(int a, int b){
		System.out.println("sum1");
	}
	
	void sum(long a, long b){
		System.out.println("sum2");
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingWithSameDataTypes m = new MethodOverloadingWithSameDataTypes();
	
	m.sum(2, 2);
    m.sum(2, 2);
		
		//Static method calling
	/*MethodOverloadingWithSameDataTypes.sum(11, 11);
	MethodOverloadingWithSameDataTypes.sum(11, 11, 11);*/
		
		
	}

}
