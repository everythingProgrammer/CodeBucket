package mockVita;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


class ResortGuest {
	
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
		return this.dateOfBooking.substring(3, 6);
	}
	
	public double getBill() {
		return  this.totalBill;
	}
	public String getMealOption() {
		return this.mealOption;
	}
	public void getGuestId() {
		System.out.println(this.guestId);
	}
	public String getName() {
		return this.guestName;
	}
	
}

public class MyClass {
	public static int findNumberofRoomsBookedInMonth(ResortGuest []arr , String month) {
		/*total number of rooms booked for month */
//		HashMap<Integer, String > da = new HashMap<>();
//		da.put(0,"January");
//		da.put(1,"February");
//		da.put(2,"March");
//		da.put(3,"April");
//		da.put(4,"May");
//		da.put(5,"June");
//		da.put(6,"July");
//		da.put(7,"August");
//		da.put(8,"September");
//		da.put(9,"October");
//		da.put(10,"November");
//		da.put(11,"December");
		
		int count = 0;
		for(ResortGuest obj : arr) {
			if(obj.date().contains(month.toLowerCase())) {
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
		int maxpointer=0;
		int smaxpointer = 0;
		for(int i = 0; i<4; i++) {
			if(arr[i].getMealOption().equalsIgnoreCase(givenMealOption)) {
				if(arr[i].getBill() > max) {
					smax = max;
					smaxpointer= maxpointer;
					maxpointer = i;
					maxx2 = maxx;
					max = arr[i].getBill();
					maxx = arr[i];
				}
				else if (arr[i].getBill() > smax) {
					smax = arr[i].getBill();
					maxx2 = arr[i];
					smaxpointer = i;
				}
			}
		}
		
		return arr[smaxpointer];
	}
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		ResortGuest []arr = new ResortGuest[4];
		for(int i = 0 ; i<4 ; i++ ) {
			
			int id = sr.nextInt();
			sr.nextLine();
			String name = sr.nextLine();
			String date = sr.nextLine();
			int booked = sr.nextInt();
			sr.nextLine();
			String meal = sr.nextLine();
			int bill = sr.nextInt();
//			sr.next();
			arr[i] = new ResortGuest(id, name, date, booked, meal, bill);
			
		}
		
		
//		System.out.println("******************************");
//		for(ResortGuest abc : arr) {
//			System.out.print("Name "+abc.getName()+"  Bill "+abc.getBill()+" Meal Option "+abc.getMealOption()+" **");
//			abc.getGuestId();
//		}
		
		
		String month = sr.nextLine();
		
		String option = sr.nextLine();
		
		int number = findNumberofRoomsBookedInMonth(arr, month);
		if( number > 0) {
			System.out.println(number);
		}else {
			System.out.println("No rooms booked");
		}
		ResortGuest guest = searchResortGuestByMealOpted(arr, option);
		if(guest == null) {
			System.out.println("No such meal");
		}
		else {
			guest.getGuestId();
		}
	}
}
