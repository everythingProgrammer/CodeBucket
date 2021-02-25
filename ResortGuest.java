import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ResortGuest {
	
	private int guestId; 
	private String guestName;
	private String dateOfBooking; 
	private int noOfRoomsBooked; 
	private String mealOption;
	private double totalBill;
	
	ResortGuest(int guestId, String guestName , String date , int booked, String meal ,double bill){
		this.guestId = guestId;
		this.guestName = guestName;
		this.noOfRoomsBooked = booked;
		this.dateOfBooking = date;
		this.mealOption = meal;
		this.totalBill = bill;
		
	}
	/*getter and setters requeired*/
	
	public String date() {
		return this.dateOfBooking;
	}
	
	public double getBill() {
		return  this.totalBill;
	}
	public String getMealOption() {
		return this.mealOption;
	}
	
}


class MyClass{
	public static int findNumberofRoomsBookedInMonth(ResortGuest []arr , String month) {
		/*total number of rooms booked for month */
		HashMap<Integer, String > da = new HashMap<>();
		da.put(0,"January");
		da.put(1,"February");
		da.put(2,"March");
		da.put(3,"April");
		da.put(4,"May");
		da.put(5,"June");
		da.put(6,"July");
		da.put(7,"August");
		da.put(8,"September");
		da.put(9,"October");
		da.put(10,"November");
		da.put(11,"December");
		
		int count = 0;
		for(ResortGuest obj : arr) {
			if(da.get(obj.date()).equals(month)) {
				count++;
			}
		}
		
		
		return count;
		
	}
	
	public static ResortGuest searchResortGuestByMealOpted (ResortGuest []arr , String givenMealOption) {
		/*return  resortguest object with second highest totalbill in givenMealOption*/
		double max = Integer.MIN_VALUE;
		double smax = Integer.MIN_VALUE;
		ResortGuest maxx = null;
		ResortGuest maxx2 = null;
		
		for(ResortGuest obj: arr) {
			if(obj.getMealOption().equalsIgnoreCase(givenMealOption)) {
				if(obj.getBill() > max) {
					smax = max;
					maxx2 = maxx;
					max = obj.getBill();
					maxx = obj;
				}
				else if (obj.getBill() > smax) {
					smax = obj.getBill();
					maxx2 = obj;
				}
			}
		}
		
		return maxx2;
		
	}
	
	
}