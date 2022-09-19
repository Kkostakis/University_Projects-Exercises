
public class Athlete {
	
	
	private String name;
	private String sport;
	public int ranking;
	
	public Athlete(String name,String sport)
	{
		this.name = name;
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
	public String getAthleteDetails()
	{
		String s = new String("Name:" + name + "\nSport:" + sport + "\nRanking:" + ranking);
		return s;
	}

}
