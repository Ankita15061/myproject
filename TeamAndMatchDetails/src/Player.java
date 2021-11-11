
public class Player {
	private String name;
	private String skills;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Player(String name, String skills, String country) {
		super();
		this.name = name;
		this.skills = skills;
		this.country = country;
	}
	
	
	

}
