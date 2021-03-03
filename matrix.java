import java.util.Scanner;
class matrix
{
	public static void main(String args[])
	{
		int a,b,i,j;
		int array[][]=new int[10][10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows of matrix:");
		a=in.nextInt();
		System.out.println("Enter the columns of matrix:");
		b=in.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				array[i][j]=in.nextInt();
				//System.out.println(array[a][b]+" ");
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				
				System.out.print(array[i][j]+" \t");
			}
			System.out.println();
		}
	}
}
