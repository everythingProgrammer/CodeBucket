package trash;

public class Student {
	int age;
	Student(){
		this(20);
	}
	Student(int age){
		this.age = age;
	}
	
	public static void main(String args[]) {
		String[] s= {"10","20","30","40"};
		for(String result: s) {
			if(result.contains("30")) {
				continue;
			}
			System.out.println(result);
		}
	}
	
	
}
