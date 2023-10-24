import java.util.*;

public class main extends Thread{
	static int m1;
	static int n1;
	static int m2;
	static int n2;
	static int a[][];
	static int b[][];
	public void run()
	{
		int[][] c = new int [m1][n2];
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<m2;k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		for(int x[]:c)
		{
			for(int x1:x)
			{
				System.out.print(x1+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		m2 = sc.nextInt();
		n2 = sc.nextInt();
		a = new int [m1][n1];
		b = new int [m2][n2];
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		main m = new main();
		m.start();
	}
}
