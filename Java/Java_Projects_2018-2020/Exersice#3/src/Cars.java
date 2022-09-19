import java.util.Scanner;  
import java.util.InputMismatchException;

public class Cars {

	public static final String ANSI_CYAN  = "\u001B[36m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ArithmeticException {
		
		boolean found = true;
		Scanner input = new Scanner(System.in);
		int division;
		
    do
    {
		try
		{
			
			System.out.print(ANSI_GREEN + "User enter the first integer:" + ANSI_RESET);
			int x = input.nextInt();
			
			System.out.print(ANSI_GREEN + "User enter the second integer:" + ANSI_RESET);
			int y = input.nextInt();
			
			division = x / y;
			
			found = false;
		}
		
		catch(InputMismatchException inputmismatchexception)
		{
			System.err.printf("Exception: %s%n" , inputmismatchexception);
			System.out.println();
			input.nextLine();
		}
		
		catch(ArithmeticException arithmeticexception)
		{
			System.err.printf("Exception: %s%n" , arithmeticexception);
			System.out.println();
			input.nextLine();
		}
		
		finally
		{
			if(found == true)
			{
			   System.out.println(ANSI_CYAN + "User please try again!!" + ANSI_RESET);
			}
			else 
			{
				System.out.println(ANSI_CYAN + "The exception has been dealt with!!" + ANSI_RESET);
			}
		}
		
    }while(found != false);
		
		input.close();
		
	}

}
