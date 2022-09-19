import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; /* Arrays.binarysearch() works for arrays which can be of primitive data type also. */
public class Exer5 {

	@SuppressWarnings({"deprecation", "resource"})
	public static void main(String[] args) {
		
		int array[] = new int[10];
		Random rns = new Random();
		int temp,i;
		
		for(i=0;i<10;i++)
		{
			array[i] = new Integer(rns.nextInt(40)+1);
		}
		
		for(i=0;i<10;i++)
		{
			System.out.printf("Array[%d]:%d\n",i,array[i]);
		}
		
		int j;
		
		for(i=0;i<9;i++ )
		{
			for(j=0;j<9-i;j++)
			{
				if(array[j] < array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
        
		System.out.print("\n");
		
		for(i=0;i<10;i++)
		{
			System.out.printf("The elements of the sorted array are:%d\n",array[i]);
		}
		
		int key;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n");
		
		Arrays.sort(array);  // Binary Search procedure
		do
		{
			System.out.print("User please insert the key number:");
			key = input.nextInt();
		}while(key <= 0); // we use do...while in case the number the user inserts is non-positive!!
		
		System.out.print("\n");
		
		int found = Arrays.binarySearch(array,key);
		
		if (found >= 0) 
		{
            System.out.println(key + " found at index = "+ found);
            
		}   
        else
        {
            System.out.println(key + " Not found"); 
        }

		
	}
}