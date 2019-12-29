
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Syntax #1 | Bracket Before
		int[] a1 = {10, 20, 30, 40, 50};

		// Syntax #2 | Bracket After
		int a2[] = {10, 20, 30, 40, 50};
		
		// Syntax #3 | Bracket Before with new
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		// new int[] -> if you don't add it in 
		// Syntax #1 and Syntax #2 it will be automatically appended by compiler
		
		// new int[] -> new is going to create array in the memory at run time
		//              it means when program is executed array will be created 
		// 				and that too in the heap region
		// with new, compiler will not write the memory allocation information in .class file
		// and hence will let this responsibility to be taken care by JVM.
		
		// Syntax #4 | Bracket After with new
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// Syntax #5 | With Size
		// we dont know what data to put in. So, we can create size and put data later.
		int[] a5 = new int[10]; // values will be 0 initially
		int a6[] = new int[6];  // values will be 0 initially
		
		// all values will be 0 in a5 or a6
		for(int i=0;i<a5.length;i++) {
			System.out.println(a5[i]);
		}
		
		System.out.println(">> Updating Data in Indexes of a5");
		
		a5[1] = 22;
		a5[8] = 99;
		
		for(int i=0;i<a5.length;i++) {
			System.out.println(a5[i]);
		}
		
		// Bracket Before and After

		int a7[], a8[]; // we need to put bracket again
		a7 = new int[3];
		a8 = new int[5];
		
		int[] a9, a10;  // we don't put brackets again and again
		a9 = new int[3];
		a10 = new int[5]; // indexes : 0 to 4 and size: 5
		
		System.out.println(">> a10[1] is: "+a10[1]); // 0
		
		// Error will be given by JVM and not Compiler
		// Hence, error at run time
		System.out.println(">> a10[11] is: "+a10[11]); // ArrayIndexOutOfBoundsException
		
		
	}

}
