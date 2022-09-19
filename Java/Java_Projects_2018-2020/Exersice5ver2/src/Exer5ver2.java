import java.util.Random;
import java.util.Scanner;
public class Exer5ver2 {

	int BinarySearch(int array[],int key,int size,int hold)
	{
		if(size >= 1)
		{
			int mid = hold + ((size - 1) / 2);
			
			if(array[mid] == key)
			{
				return mid;
			}
			
			else if(array[mid] > key)
			{
				return BinarySearch(array,key,mid-1,size);
			}
			
			else
			{
				return BinarySearch(array,mid+1,size,hold);
			}
		}
		
		return -1;
			
			
		}
		
	@SuppressWarnings({ "deprecation", "unused", "resource" })
	public static void main(String[] args) {
		
		int i ;
		int key;
		int goal;
		int array[] = new int[21];
		
		Exer5ver2 binarysearch = new Exer5ver2();
		Random rns = new Random();
		Scanner input = new Scanner(System.in);
		
		for(i=0;i<21;i++)
		{
			array[i] = new Integer(rns.nextInt(40)+1);
		}
		
		for(i=0;i<21;i++)
		{
			System.out.printf("Array[%d]:%d\t",i,array[i]);
			System.out.print("\n");
		}
		
		do
		{
			System.out.print("User please enter the integer key:");
			key = input.nextInt();
		}while(key <= 0);
		
		int size = array.length;
		goal = binarysearch.BinarySearch(array,key,size-1,0);
		
		if(goal == -1)
		{
			  System.out.println("Element not present");
		}
		else
		{
			 System.out.println("Element found at index " + goal); 
		}

	}

}
