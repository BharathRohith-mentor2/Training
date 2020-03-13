import java.util.*;
class Best
{
	public int getMinReplacements(int n)
    {
		if(n == 1)
		{
		    return 0;
		}
		else
		{
		    if( n%2 == 0)
		    {
				return 1 + getMinReplacements( n/2 );
		    }
		    return 1 + Math.min(getMinReplacements(n+1),getMinReplacements(n-1));
		}
    }
    
	public static void main (String[] args)
	{
		// your code goes here
		best run  = new Best();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minReplacements = run.getMinReplacements( n );
		System.out.println(minReplacements);
	}
}
