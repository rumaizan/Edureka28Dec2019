/* A Multi Line Comment
 
 	Software Design Architecture
  		> Model View Controller
  		
  	Uber i.e. Cab Booking App
  	
  	Model : Data
  		    eg: Source Location
  		    	Destination Location
  		    	Type Of Cab
  		    	
  	View : UI (User Interface)
  		    eg: Beautiful Rectangular Screens in Phones
  		    We take data from User
  		    We show data to User
  		    
  	Controller: Logic
  				how to process data
  		        1. Finding Shortest Distance
  		        2. Least Traffic
  		        3. Nearest Driver to be Linked
  		        
  		        Logic
  		        1. Computation
  		        2. Conditions or Rules on Data
  		        3. Iterate i.e. Loop Around on Data (Searching the cab till it is not found)
  		        
  
  	Business has Problems
	Telecom Company -> Sells 4G Data Pack | Price: 315.67 | Profit: 12.97
	Day1 : 1764
	Day2 : 3256
	Day3 : 9087
	
	Calculate Profit for Telecom Company in 3 Days !!
	
	1764 * 12.97 + 3256 * 12.97 + 9087 * 12.97
	
	( 1764 + 3256 + 9087 ) * 12.97
	Is above use case a problem !! YES !!
	
	If we as human will start doing these computation, we will have 2 Challeneges !!
	1. Time : For a complex computation we may spend more time
	2. Accuracy : We need to validate our computation couple of times i.e. like auditing

	        
  
 
 */

public class Problem {

	public static void main(String[] args) {
		
		// Model View Controller
		
		// 1. Model : Data
		
		// int is a storage container to store integers
		int day1Sales = 1764;
		int day2Sales = 3256;
		int day3Sales = 9087;
		
		// double is a storage container to store decimal values
		double packPrice = 315.67;
		double profit = 12.97;
		
		// character data is stored in single quote
		char ch = '₹';
		
		//3. Controller
		//   Defining Logic for Us.
		//   Computation
		double totalSales = ( day1Sales + day2Sales + day3Sales ) * packPrice;
		
		// 2. View or UI
		// print ">> Total Sales in 3 Days is: first and thereafter print data in totalSales
		System.out.println(">> Total Sales in 3 Days is: " + ch + totalSales);

		double totalProfits = ( day1Sales + day2Sales + day3Sales ) * profit;
		System.out.println(">> Total Profit in 3 Days is: "+ ch + totalProfits);
		
		// To represent data with state as true false
		boolean isTargetAchieved = true; // false
		
	}

}
