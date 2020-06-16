package ArrayList;

public class Matrix {

	public static void main(String[] args) {

		String s1[][]=new String[3][2];

		s1[0][0]="Shreyas";

		s1[0][1]="Tapale";

		s1[1][0]="Shaun";

		s1[1][1]="Watson";

		s1[2][0]="James";

		s1[2][1]="Ponting";

		for (int i = 0; i < s1.length; i++) {

			StringBuilder sb=new StringBuilder();

			for (int j = 0; j < s1[i].length; j++) {

				if (j==0) {

					sb.append(" The Surname of ");

				} else {

					sb.append(" is ");

				}

				sb.append(s1[i][j]);

			}

			System.out.println(sb);

		}

		

	}



}