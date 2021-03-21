package tcs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

class Package1{
	private int invoiceNumber; 
	private String formCity;
	private String toCity;
	private String orderDate;
	private String deliveryDate;
	double price;
	public String getOrderDate() {
		return this.orderDate;
	}
	public String getDeliveryDate() {
		return this.deliveryDate;
	}
	public String getCity() {
		return this.formCity;
	}
	
}

public class Myclass {
	
	public static double getDifferenceinDays(String start, String end) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	    Date firstDate = sdf.parse("24/06/2017");
	    Date secondDate = sdf.parse("30/09/2017");
	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    return diff;
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
	public static void main(String args[]) {
		
	}
	
}
