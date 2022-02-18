package ma.education.tp5.collections;
import java.util.HashSet;
import java.util.Set;
public class TestSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		set1.forEach(i-> System.out.println(i));
		//3
			Set<Integer> set3 = new TreeSet<>();
			set3.add(22);
			set3.add(11);
			set3.add(15);
			set3.add(9);
			set3.forEach(i-> System.out.println(i));
		
	
		
			//4
			Set<Client> set4 = new TreeSet<>();
			set4.add(new Client(1,"OMAR"));
			set4.add(new Client(3,"SAID"));
			set4.add(new Client(2,"HASSAN"));
			set4.forEach(i-> System.out.println(i));
			//5
			Comparator<Client> c = new CodeComparator();
			Set<Client> set4 = new TreeSet<>(c);
			set4.add(new Client(1,"OMAR"));
			set4.add(new Client(3,"SAID"));
			set4.add(new Client(2,"HASSAN"));
			set4.forEach(i-> System.out.println(i));
			
			//6
			Set<Client> set4 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
			set4.add(new Client(1,"OMAR"));
			set4.add(new Client(3,"SAID"));
			set4.add(new Client(2,"HASSAN"));
			set4.forEach(i-> System.out.println(i));
			@Override
			public boolean  equals(Object o) {
			Client client = (Client) o;
			return this.code==client.code && this.name.equals(client.name);
			}
			@Override
			public int hashCode() {
			return code;
			}
			
}
}