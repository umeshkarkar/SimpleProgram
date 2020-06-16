package ArrayList;

public class ArraySorting {

	public static void main(String[] args) {
		
		int[] arr = {10, 2, 5, 4, 6, 17, 11, 22};
		int temp=0;
		
		System.out.println("Elements of orignial aaray");
	
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		//Sort the array in ascending order
		for(int i=0; i<arr.length; i++)//i=0
		{
			for(int j=i+1; j<arr.length; j++) //j=1
			{
				if(arr[i]>arr[j]) //10>2
				{
					temp=arr[i]; //temp=10
					arr[i]=arr[j];//a[0]=2
					arr[j]=temp;//a[1]=10

				}

			}

		}
		
		System.out.println("\nelements of array sorting in ascending order");
		
		for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
		}
	}
	
}

















