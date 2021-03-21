package tcs;
import java.util.*;
class Package{
	private int invoiceNumber; 
	private String formCity;
	private String toCity;
	private String orderDate;
	private String deliveryDate;
	double price;
	
	Package(int InvoiceNumber,String fromCity,String toCity, String orderDate, String deliveryDate, double price){
		this.invoiceNumber= InvoiceNumber;
		this.toCity = toCity;
		this.formCity=fromCity;
		this.orderDate=orderDate;
		this.deliveryDate=deliveryDate;
		this.price=price;
	}
	public int getInvoice() {
		return this.invoiceNumber;
	}
	public String getOrderDate() {
		return this.orderDate;
	}
	public String getDeliveryDate() {
		return this.deliveryDate;
	}
	public String gettoCity() {
		return this.toCity;
	}
	public double getPrice() {
		return this.price;
	}
	
	
}
public class Feb25_CPASecondShiftMuseum {
	public static void main(String args[]) {
		Package[] p=new Package[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<p.length;i++) {
			int iN=sc.nextInt();
			sc.nextLine();
			String fromCity=sc.nextLine();
			String toCity=sc.nextLine();
			String orderDate = sc.nextLine();
			String deliveryDate = sc.nextLine();
			double price=sc.nextDouble();
			
			p[i]=new Package(iN,fromCity,toCity,orderDate,deliveryDate,price);
		}
		sc.nextLine();
		String toCity=sc.nextLine(); /*for 2nd function*/
		String fromCity=sc.nextLine();/*for 1st function*/
		int ordersdelivered = countOrdersDeliveredInAWeek(p, fromCity);
		if(ordersdelivered == 0) {
			System.out.println("No Packages Delivered withing a week from given city");
		}
		else 
			System.out.println(ordersdelivered);
		Package result=getSecondOldMuseumBasedOnRating(p,toCity);
		if(result == null) {
			System.out.println("No Package was sent to the specified city");
			
		}else {
			System.out.println(result.getInvoice());
			System.out.println(result.getPrice());
		}
	}

	static int countOrdersDeliveredInAWeek(Package arr[] , String City)  {
		int countDeliveredPackages = 0;
		for(Package p : arr) {
				
				int start = Integer.parseInt(p.getOrderDate().substring(0 ,2));
				int end = Integer.parseInt(p.getDeliveryDate().substring(0,2));
				if(end - start <= 7)
					countDeliveredPackages++;
			}
		
		return countDeliveredPackages;
	}
	
	public static Package getSecondOldMuseumBasedOnRating(Package[] m, String toCity) {
		Package[] temp=new Package[0];
		for(int i=0;i<m.length;i++) {
			if(m[i].gettoCity().equalsIgnoreCase(toCity)) {
				temp=Arrays.copyOf(temp,temp.length+1);
				temp[temp.length-1]=m[i];
			}
		}
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp.length-i-1;j++) {
				if(temp[j].getPrice()>temp[j+1].getPrice()) {
					Package t=temp[j+1];
					temp[j+1]=temp[j];
					temp[j]=t;
				}
			}	
		}
		if(temp.length>=2) {
			return temp[1];
		}
		else {
			return null;
		}
		
	}

}
