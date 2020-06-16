package Integer;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		
		/*int num= 1234, reversed= 0;
		
		//1234 !=0
		while(num !=0){
			
			int digit= num % 10; //(1234/10)= 123.4//123/10=12.3
			
			reversed = reversed*10 + digit;    // rev= 0*10+4= 4// 0*10+3= 3
			
			num /= 10; // 1234/10 = 123// 123/10= 12
		}
	System.out.println("Reversed number is " +reversed);*/
	
	int n=123, r, s=0;
	int t=n;
	
	while(n>0)
	{
		r = n%10; //123/10 = 3
		n = n/10; //123/10= 12
		s = s*10+r;
	}
		if(t==s){
			System.out.println("Number is palindrome");
		}else{
			System.out.println("Number is not Palindrome");
		}
			
	}
	
	}



