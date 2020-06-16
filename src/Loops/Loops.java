package Loops;

public class Loops {



	static String[] Months={"January","February","March","April","March","May","June","July","August","September","Octomber","November","December"};

	public static void main(String[] args) {

		

		for (int i = 0; i < Months.length; i++) {

			System.out.print(" "+Months[i]);

		}

		

		System.out.println();

		for (String month : Months) {

			System.out.print(" "+month);

		}

		

		System.out.println();

		int cnt=0;

		while (cnt<Months.length) {

			System.out.print(" "+Months[cnt]);

			cnt++;

		}

		

		System.out.println();

		int cnt1=0;

		 do{

			System.out.print(" "+Months[cnt1]);

			cnt1++;

		}while (cnt1<Months.length);

	}

}
