import java.util.Arrays;
import java.security.SecureRandom;

public class Comeback1 
{
	
	public static void main(String args[]) 
	{

		SecureRandom rand = new SecureRandom();
		int array[] = new int[20];
		
		int x;
		
		for(x=0;x<array.length;x++)
		{
			array[x] = rand.nextInt(100);
		}
		
		for(x=0;x<array.length;x++)
		{
			System.out.printf("The element array[%d] of the array is:%d\n",x,array[x]);
		}
		
		System.out.println();
		Arrays.sort(array);
		
		for(x=0;x<array.length;x++)
		{
			System.out.printf("The element array[%d] of the sorted array is:%d\n",x,array[x]);
		}
		
		System.out.println();
		 
		ModifyArray(array); //The method can directly access the elements of the array and thus the method is able to actually memorize the value and send it back to main
		
		for(x=0;x<array.length;x++)
		{
			System.out.printf("The element array[%d] of the modified array is:%d\n",x,array[x]);
		}
		
		System.out.println();
		
		System.out.printf("The element array[5] of the array is:%d\n",array[5]);
		
		ModifyElement(array[5]); //The method cannot directly access the elements of the array and thus it only changes the value of a copy of the original element
		
		System.out.printf("The modified element array[5] of the array is:%d\n",array[5]);
		
		Arrays.fill(array,12);
		
		System.out.println();
		
		for(x=0;x<array.length;x++)
		{
			System.out.printf("The element array[%d] of the array is:%d\n",x,array[x]);
		}
		
		
	}		
	
	public static void ModifyArray(int array[])
	{
		int y;
		
		for(y=0;y<array.length;y++)
		{
			array[y] = array[y] * 2;
		}
		
	}
	
	public static void ModifyElement(int element)
	{
		element = 100;
		System.out.printf("The modified element inside the method is:%d\n",element);
	}
		
		
}