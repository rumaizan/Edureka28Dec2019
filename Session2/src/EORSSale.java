
public class EORSSale {

	public static void main(String[] args) {
		
		// Taking Prices of 5 different products as in single value containers
		// Creational Statements
		double product1 = 1200.23;
		double product2 = 1000.11;
		double product3 = 1350.45;
		double product4 = 1980.56;
		double product5 = 2140.12;
		
		System.out.println(">> product1 price before EORS was: "+product1);
		System.out.println(">> product2 price before EORS was: "+product2);
		System.out.println(">> product3 price before EORS was: "+product3);
		System.out.println(">> product4 price before EORS was: "+product4);
		System.out.println(">> product5 price before EORS was: "+product5);
		
		System.out.println("=====EORS====");
		
		// We need to put up a sale of flat 40% OFF on all the products
		// Update + Computation Statements
		product1  = product1 - (0.4 * product1);
		product2  = product2 - (0.4 * product2);
		product3  = product3 - (0.4 * product3);
		product4  = product4 - (0.4 * product4);
		product5  = product5 - (0.4 * product5);
		
		System.out.println(">> product1 price after EORS was: "+product1);
		System.out.println(">> product2 price after EORS was: "+product2);
		System.out.println(">> product3 price after EORS was: "+product3);
		System.out.println(">> product4 price after EORS was: "+product4);
		System.out.println(">> product5 price after EORS was: "+product5);
		
		// Static Memory Allocation
		// If 1 double container takes 8 bytes of memory
		//    5 * 8 = 40 bytes of data
		//    is already known to compiler at compile time and shall be written in the .class file
		//    so whenever we will execute our java program i.e. .class file which will be executed by JVM
		//    JVM will know how much RAM allocation to be down to accommodate data containers

		
		// Challenge in EORSSale Program
		// We are kind of writing same statements again and again :)
		// It means if we have n products we as developer will end up writing n lines of code :)
	}

}
