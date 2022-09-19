import java.util.ArrayList; 
import java.util.Arrays;
import java.security.SecureRandom;

public class Search {
	
	public static void main(String[] args) {
		
		int [] array = new int [20];
		int j;
		SecureRandom rand = new SecureRandom();
		
		
		
		for(j=0;j<array.length;j++)
		{
			array[j] = rand.nextInt(120);
		}
		
	    System.out.println("Display the elements of the array!!!");
	    System.out.println();
	    
		for(j=0;j<array.length;j++)
		{
			System.out.printf("Element[%d]:%d\t",j,array[j]);
		}
		
		System.out.println();
		
		boolean found = false;
		int key = array[12];
		
		for(int element:array)
		{
			if(element == key)
			{
				System.out.println("The element " + key + " was found!!");
				found = true;
				break;
			}
			else
			{
		       System.out.println("The element was not found!!Repeat the process!!!\n");
			}
		}
		
		System.out.println();
		
		Arrays.sort(array);
		System.out.println("The elements of the sorted array are:");
		
		for(j=0;j<array.length;j++)
		{
			System.out.println("Element[" + j + "]:" + array[j]);
		}
		
		
	}
}
