
public class StorageContainers {

	// Whatever we will write in main method
	// it will be executed by main thread of our process in a sequence
	public static void main(String[] args) {
		
		// Programming Instructions
		
		// 1. Creational Statements : Where we try to create something in memory
		// 						      memory -> RAM -> stack structure :)
		
		// MODEL : Storage Container
		//         1. Single Value Container : eg: instagram user name 
		//				holds 1 value
		//		   2. Multi Value Container	 : eg: album
		//			    2.1 homogeneous  : holds lot of values but of same nature/type		 : collection of images
		//				2.2 hetrogeneous : holds lot of values but of different nature/type	 : collection of images and videos
		//        Is Shopping Cart on Amazon Single or Multi Value or Both ??
		//		  Dynamic Data Structure
		
		// Models can be created with Creational Statements
		
		// 1. Single Value Container
		int age = 10;
		// int is type of storage container or it is a storage container with a size of 32 bits
		// age is the name of storage container
		// 10 is literal or data in the storage container
		
		double taxes = 18.22;
		// double is type of storage container or it is a storage container with size of 64 bits
		// taxes is the name of storage container
		// 18.22 is literal or data in storage container
		
		// Prefer using storage containers as per data to save memory
		//byte johnsAge = 22;
		//byte johnsAge = 257; 		// error out of range
		byte johnsAge = (byte)257;  // down-casting : let the data be accommodated (data rotates in a cycle) | -128 to 0 to 127
		System.out.println(">> john's Age is: "+johnsAge);
		
		System.out.println(">> age intially is: "+age);		 // 10
		System.out.println(">> taxes intially is: "+taxes);  // 18.22
		
		// 2. Update Statements : Where we try to update data in memory i.e. in storage container
		age = 11; 		// new value of age now becomes 11
		taxes = 10.55;

		// 3. Read/Print Statements : Will display the data in Storage Container
		System.out.println(">> age now is: "+age);		// 11
		System.out.println(">> taxes now is: "+taxes);  // 10.55
		
		// 4. Delete Statements : In Java we do not delete containers. They are automatically deleted for us !! :)
		
	} // when main finishes, program terminates i.e. process is finished and hence associated RAM is deleted :)

	// As in when program is compiler, compiler will write information in the .class file regarding memory requirements
	// Memory Allocation happening at compile time
	// static memory allocation i.e. memory is pre known to us i.e. compiler :)
}

/*
 	byte is a storage container which shall take 8 bits in memory
 	2 power 8 as data which can be accommodated
 	256
 	256/2 -> 128
 	Range : -128 to 0 to 127
 	
 */

