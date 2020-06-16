package Interface;

public class DefaultMethodsAndInterface implements PI1, PI2{
	
	 public void show(){
		System.out.println("Hello");
		PI1.super.show();
		PI2.super.show();
	}

	public static void main(String[] args){
		
		DefaultMethodsAndInterface d = new DefaultMethodsAndInterface();
		
		d.show();
	}
}
