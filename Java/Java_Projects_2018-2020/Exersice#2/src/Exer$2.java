import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exer$2 {

	@SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) {
			
			int i,j;
			int array[][] = new int[10][7];
			int key;
			
			Random rns = new Random();
			Scanner input = new Scanner(System.in);
			
			for(i=0;i<10;i++)
			{
				for(j=0;j<7;j++)
				{
					array[i][j] = new Integer(rns.nextInt(10)+1);
					System.out.printf("The elements of the 2d array are:%d\t",array[i][j]);
				}
				System.out.print("\n");
			}
		
			System.out.print("\n");
			
			do
			{
			   JOptionPane.showMessageDialog(null,"User please insert the key number:");
			   key = input.nextInt();
			}while(key < 0 || key > 10);
			
		    int count = 0;
		    
		    for(i=0;i<10;i++)
		    {
		    	for(j=0;j<7;j++)
		    	{
		    		if(array[i][j] == key)
		    		{
		    			count = count + 1;
		    			break;
		    		}
		    	}
		    }
		    
		    System.out.printf("The number of lines the key was found is:%d\n",count);

	}

  }