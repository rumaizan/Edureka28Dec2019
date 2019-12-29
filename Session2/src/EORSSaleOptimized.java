// Optimization of Code is done and not of memory :)
public class EORSSaleOptimized {

	public static void main(String[] args) {
	
		// Single Value Container
		double product1 = 1200.23;
		
		// When we have lot of data -> prefer MVC like Array
		// Multi Value Container | Homogeneous  i.e. data is same nature/type
		// Array of Doubles
		// Creational Statement
		// size for products container will be 5 since we have put 5 values in it
		// memory size shall be 5 * 8 = 40 bytes
		double[] products = {1200.23, 1000.11, 1350.45, 1980.56, 2140.12};
		System.out.println("Length of Products is: "+products.length);
		
		
		// product1 gives the value
		System.out.println(">> product1 is: "+product1); // 1200.23
		
		// products gives the HashCode
		// Hence, we say products is a REFERENCE VARIABLE
		System.out.println(">> products is: "+products); // HashCode
		
		//System.out.println(">> products[0] is: "+products[0]); // 1200.23
		//System.out.println(">> products[3] is: "+products[3]); // 1980.56
		
		// Programming Construct : For Loop (Iteration)
		
		System.out.println("==BEFORE EORS Sale==");
		
		// For Loop
		// Begins from i value 0, goes till 4 with i incrementing by 1
		for(int i=0;i<products.length;i++) {
			//System.out.println(">> i is: "+i);
			System.out.println(">> [BEFORE] products["+i+"] is: "+products[i]);
			
			// Update Statement
			products[i] = products[i] - (0.4*products[i]);
		}
		
		System.out.println("==AFTER EORS Sale==");
		
		for(int i=0;i<5;i++) {
			System.out.println(">> [AFTER] products["+i+"] is: "+products[i]);
		}

	}

}
