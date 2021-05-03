import java.util.*;
class Details { 
	int id;
	String name;
	public Details(int id  , String name) {
		this.id = id;
		this.name = name;
	}
}
class SortbyId implements Comparator<Details>{
	public int compare(Details a, Details b) {
		return a.id - b.id;
	}
}
public class Q5 {
	public static void main(String args[]) {
		ArrayList<Details> abc = new ArrayList<>();
		abc.add(new Details(4,"abc"));
		abc.add(new Details(10,"ab1"));
		abc.add(new Details(5,"abc3"));
		abc.add(new Details(6,"abc5"));
		Collections.sort(abc,new SortbyId());
		for(int i = 0 ; i<abc.size() ; i++) {
			System.out.println(abc.get(i).id +" "+ abc.get(i).name);
		}
	}
}
