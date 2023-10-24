
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Program";
		int start = 0;
		int end = str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(j == start)
				{
					System.out.print(str.charAt(start));
				}
				else if(j == end)
				{
					System.out.print(str.charAt(end));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			start++;
			end--;
		}
	}

}
