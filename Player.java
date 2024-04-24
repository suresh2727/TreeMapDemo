
public class Player  implements Comparable<Player>{
	String name;
	int jerseyNo;
	public Player(String name, int jerseyNo) {
		this.name = name;
		this.jerseyNo = jerseyNo;
	}
	
	@Override
	public String toString() {
		
		return this.name + " " + this.jerseyNo;
	}

	@Override
	public int compareTo(Player o) {
		
		return this.name.compareTo(o.name);
	}


/*	public int compareTo(Player arg0) {
		Integer i = this.jerseyNo;
		return i.compareTo(arg0.jerseyNo);
	}
	*/
	
	
	
	
}
