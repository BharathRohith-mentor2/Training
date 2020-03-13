import java.util.*;
class QueryXOR			// prog works fine
{
	public int[] getXorArray(int[] inputArray){
        int len = inputArray.length;
        int[] xorArray = new int[len];
        xorArray[0] = inputArray[0];
        for (int i=1 ; i<len ; i++ ){
            xorArray[i] = xorArray[i-1] ^ inputArray[i];
        } 
        return xorArray;
    }
    
    public int rangeResult(int left,int right,int[] xorArray){
        return xorArray[left-1] ^ xorArray[right];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		QueryXOR run = new QueryXOR();				
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inputArray = new int[n];
		for(int i=0; i<n ; i++){
		    inputArray[i] = sc.nextInt();
		}
		int[] xorArray = run.getXorArray(inputArray);
		int noq = sc.nextInt();
		for(int i=0 ; i<noq ; i++){
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    int result = run.rangeResult(left-1,right-1,xorArray);
		    System.out.println(result);
		}
		
	}
}
