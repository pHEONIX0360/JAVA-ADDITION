import java.util.Scanner;
public class Additionofamatrix {

	public static void main(String[] args) {
		int row,column;
		Scanner sc = new Scanner(System.in);
		  int A[][] = new int[10][10];
		  int B[][] = new int[10][10];
		  int C[][] = new int[10][10];
				  System.out.println("Enter the no of rows of the matrix");
		 row = sc.nextInt();
		 System.out.println("Enter the number of columns");
		 column = sc.nextInt();
		 System.out.println("Enter first matrix ");
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<column;j++)
			 {
			 A[i][j] = sc.nextInt();
			 }}
			 System.out.println("Enter second matrix");
			 for(int i=0;i<row;i++)
			 {
				 for(int j=0;j<column;j++)
				 {
				 B[i][j] = sc.nextInt();
				 }}
			 System.out.print("The final matrix after addition is \n");
				 for(int i=0;i<row;i++)
				 {
					 for(int j=0;j<column;j++)
					 {
					 C[i][j]=A[i][j]+B[i][j];
					 System.out.print("\t"+C[i][j]);
				 }
					 System.out.println();
					 }
               
	}
	}
