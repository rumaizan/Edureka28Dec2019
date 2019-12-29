
public class Operators {

	public static void main(String[] args) {
		
		// Controller in Model View Controller
		// Controller : Process Data with some Logic
		//				1. Computation
		//				2. Condition Checks i.e. some rules
		//			    3. Iterative Process i.e. doing something repeatedly
		
		// Controller : Computation
		// Computation Statements
		
		// Operators
		// Arithmetic : Mathematical Operations
		//              +, -, *, /, %
		
		int n1 = 10;
		int n2 = 3;
		int n3 = 5;
//		int result = n1 / n2; // 3
		int result = n1 % n2; // remainder : 1
		System.out.println(">> result is: "+result); // 1
		
		// Increment the value of result by 1
		// Postfix
		result++; // result = result + 1
		// Prefix
		++result; // result = result + 1
		
		--result; // result-- // result = result - 1
		
		System.out.println(">> result is: "+result); // 2
		
		
		// Operators
		// Relational : Evaluate some conditions for us to either true or false
		// >, <, >=, <=, ==, !=
		System.out.println(">> Is n1 greater than n2? "+(n1 > n2));
		System.out.println(">> Is n1 is equal to n2? "+(n1 == n2));
		System.out.println(">> Is n1 is not equal to n2? "+(n1 != n2));
		
		// Conditional or Logical Operators
		// && , ||, !
		System.out.println(">> Is n1 greatest: "+ ( (n1 > n2) && (n1 > n3) ) );   // both true than give a true
		System.out.println(">> Is n3 is greater: "+ ( (n3 > n1) || (n3 > n2) ) ); // any one true than give a true

	}

}
