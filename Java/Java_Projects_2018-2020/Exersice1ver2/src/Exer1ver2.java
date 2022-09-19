import java.util.ArrayList;

public class Exer1ver2 
{
    
	public static void main(String [] args)
	{	
		ArrayList <Proathlete> array = new ArrayList<Proathlete>();
		Athlete a1 = new Athlete("Andrew Kollins","Skydiving");
		Proathlete p1 = new Proathlete("Marianthi Kavalou","Volleyball","Olympiakos",4500);
		
		Athlete [] a = {a1,p1};
		
		System.out.println(a[0].getAthleteDetails()); 
		p1.ranking = 1;
		System.out.println(p1.ranking);
		System.out.println(a1.getAthleteDetails());
	
		if(a[0] instanceof Proathlete)
		{
			System.out.println("Good");
			array.add(p1);
		}
		
		if(a[1] instanceof Proathlete)
		{
			System.out.println("Wow");
			array.add(p1);
		}
		
		
	}

}
