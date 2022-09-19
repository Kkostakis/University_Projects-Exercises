
public class Proathlete extends Athlete
{
	private String team;
	private double salary;
	
	public Proathlete(String name,String sport,String team,double salary)
	{
		super(name,sport);
		this.team = team;
		this.salary = salary;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//@Override
	public String getAthleteDetails()
	{
		String s = new String(super.getAthleteDetails() + "\nTeam:" + team + "\nSalary:" + salary);
		return s;
	}
	
	public double incomeperyear()
	{
		return salary*12;
	}

}
