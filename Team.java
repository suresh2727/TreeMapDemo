
public class Team {
	String name;
	String state;
	public Team(String name, String state) {
		this.name = name;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.state;
	}
	
	
	
	
}
