
public class vararg {
	static int var(int[]...a)
	{   int total=0;
		for(int x[]:a)
		{
			for(int x1:x)
				total+=x1;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {10,20,30};
        int[] b = {40,50};
        int[] c = {60,70,80};
        int[] d = {90,100};
        System.out.print(var(a,b,c,d));
	}

}
