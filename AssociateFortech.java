import java.util.Arrays;
import java.util.Scanner;

class Associate{
	int id;
	String name;
	String technology;
	int experienceInYears;
	Associate(int id,String name,String technology,int experienceInYears){
		this.id=id;
		this.name=name;
		this.technology=technology;
		this.experienceInYears=experienceInYears;
	}
	public void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	public void setTechnology(String technology) {
		this.technology=technology;
	}
	String getTechnology() {
		return technology;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears=experienceInYears;
	}
	int getExperienceInYears() {
		return experienceInYears;
	}
}
public class AssociateFortech {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Associate as[]=new Associate[5];
		for(int i=0;i<as.length;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String technology=sc.nextLine();
			int experienceInYears=sc.nextInt();
			as[i]=new Associate(id,name,technology,experienceInYears);
		}
		for(int i=0;i<as.length;i++) {
			System.out.println(as[i].getId()+ "  :  " + as[i].getName()+"    :    "+as[i].getTechnology() +"  : "+as[i].getExperienceInYears());
		}
		sc.nextLine();
		String tech=sc.nextLine();
//		sc.nextLine();
//		int number=sc.nextInt();
		System.out.println("TECHHH ENTERED  : "+tech+"");
		Associate[] temp=associatesForGivenTechnology(as,tech);
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i].getId());
	}
}
	public static Associate[] associatesForGivenTechnology(Associate[] associate, String tech) {
		Associate[] res=new Associate[0];
		for(int i=0;i<associate.length;i++) {
			if(associate[i].getTechnology().equalsIgnoreCase(tech) && associate[i].getExperienceInYears()%5 == 0) {
				res=Arrays.copyOf(res, res.length+1);
				res[res.length-1]=associate[i];
				
			}
		}
		return res;
	}

}