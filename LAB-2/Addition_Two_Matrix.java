import java.util.Scanner;

public class Addition_Two_Matrix{
	public static void main(String[] args) {

		int row,column,i,j;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows For First Matrix : ");
		row = sc.nextInt();
		System.out.println("Enter Coulmns For First Matrix : ");
		column = sc.nextInt();

		int[][] matrix_1 = new int[row][column];


		
		System.out.println("Enter Elements Of First Matrix : ");
		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				matrix_1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter Number Of Rows For Second Matrix: ");
		row = sc.nextInt();
		System.out.println("Enter Number Of Coulmns For Second Matrix : ");
		column = sc.nextInt();

		int[][] matrix_2 = new int[row][column];

		System.out.println("Enter Elements Of Second Matrix : ");
		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				matrix_2[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		int[][] sum = new int[row][column];

		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
			}
		}
		System.out.println("Sum Of Matrix ");
		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

