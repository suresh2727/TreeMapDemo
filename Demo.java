import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		Player p1 = new Player("Virat", 18);
		Player p2 = new Player("Dhoni", 7);
		Player p3 = new Player("Rohit", 45);
		Player p4 = new Player("Rahul", 1);
		Player p5 = new Player("ABD", 17);
		
		Team t1 = new Team("RCB", "karnataka");
		Team t2 = new Team("CSK", "TAMILNADU");
		Team t3 = new Team("MI", "Maharastra");
		Team t4 = new Team("LSG", "UttarPradesh");
		
		Map<Player, Team> ipl = new TreeMap<>();
		ipl.put(p1, t1);
		ipl.put(p2, t2);
		ipl.put(p3, t3);
		ipl.put(p4, t4);
		ipl.put(p5, t1);
		
		System.out.println(ipl);
		Set<Map.Entry<Player, Team>> s =ipl.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	 
	}
}
