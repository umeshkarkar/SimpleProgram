package ArrayList;

public class ArrayTwoD {

	public static void main(String[] args) {

		String nam[][]=new String[3][2];

		nam[0][0]="Shreyas";

		nam[0][1]="Tapale";

		nam[1][0]="Shaun";

		nam[1][1]="Watson";

		nam[2][0]="James";

		nam[2][1]="Ponting";

		for (int j = 0; j < 3; j++) {  //0, 0, 1, 1, 2, 2

		for (int k = 0; k < 2; k++) {  //0, 1, 0, 1, 0, 1

			if(k==0){

				System.out.print(nam[j][k]);

			}else{

				System.out.print(" "+nam[j][k]);

				}

			}

		System.out.println();

		}

	}

}
