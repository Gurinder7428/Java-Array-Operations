
public class arrayOperations {
	
	public static int sum(int arr1[])
	{
		
		int sum = 0;
		
		for(int i=0;i<arr1.length;i++)
		
			 sum += arr1[i];
			 return sum;		
	}
	
	public static int avg(int arr1[])
	{
		int av = sum(arr1)/arr1.length;
		return av;
	}
	
	public static int even(int arr1[])
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
			if(arr1[i]%2==0)
				count++;
		return count;
			
	}
	
	public static int odd(int arr1[])
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
			if(arr1[i]%2==1)
				count++;
		return count;
			
	}
	
	public static int count(int arr1[])
	{
		int counter=0;
		for(int i=0;i<arr1.length;i++)
			if(arr1[i]>avg(arr1))
				counter++;
		return counter;
			
	}
	
	
	
	
	

}
