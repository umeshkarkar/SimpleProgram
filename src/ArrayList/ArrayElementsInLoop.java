package ArrayList;

public class ArrayElementsInLoop {

	public static void main(String[] args) {
		
		int arr[] = new int[6];
		
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		arr[5]= 6;
		
	for(int i=0; i<arr.length; i++){
		
		System.out.println("The element at index is "+i+ ":" + arr[i]);
	}
		
	}
}
