/*
 
Programming Language !!
is suppose to solve problems using a computer

Business -> Problems
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


Driver -> is the one who drives a vehicle
Computer -> is the one who performs computations !!

We must learn PL to solve the problems and Computer will run our program to do the task/job

In the world, we have n number of PL's
C/C++
	System Programming | OS Related things | OS eg Win, Mac, Lnx ...
Java
	Application Programming | Softwares that runs on OS
Python
	Statistical or AI based Research

Dart
Kotlin
Scala
Go
.
.
..
....


> Platform Indepedence
  Platform means Operating System i.e. OS or System 
  eg: Win, Mac, Lnx, Unx, Solaris . .....

We need to create an Application Software, we must write a program using a PL  

How Orange Juice is Prepared :)

Orange 		 -		Source (From where we will start)

Juicer		 -		Processing Oranges and will do conversion

Liquid Juice -		Result, Expected

Pack It 	 - 		Some Glass

\_/			 - 		Container with Liquid Juice is END RESULT for CUSTOMER -> Juice

What we do
We work on how oranges can be planted & harvested :)

What we dont do
1. Juicer is ready made for us, we dont create it
2. Packing is ready made for us, we dont create it

Application Software
C++

MyApp.cpp	-		Source Code | Program which we wrote in C++ | High Level Language

Compiler    -		Process Source Code

MyApp.obj	-		Object Code | OS Shall Understand	| Low Level Language

Pack it     -       Some Tool

MyApp.exe   -       Container conatining obj is END RESULT for CUSTOMER -> Application Software

Challenge : Packing the Software for different OS's and even we may need to change our source code for different OS's

MyApp.exe -> Allicaton Software but can run only on Windows
MyApp.dmg
MyApp.sh



MyApp.java 		-		Source Code

Compiler

MyApp.class 	-		Byte Code

Thats It

Tetra Pack


JVM or Java Virtual Machine will execute bytecodes for us !!
Since JVM is Pre-Installed by all the OS Vendors in their OS
Hence, Java becomes Platform Indepndent


Terms:
static
	when we know what to do 
dynamic
	When we dont know what will be done


JVM
	Java Virtual Machine
	To execute bytecodes
	Installation : Pre Installed, We need not to install
JDK
	Java Development Kit
	> to create programs. this is a toolkit like carpeneter have their toolkit we will have it as developers.
	> we need certain codes, which can be used to create software
	> give us tools
		compiler
	Installation: We need to download and install it !!	
	https://www.oracle.com/technetwork/java/javase/downloads/index.html
	JDK >=8 (Please Install It and setup the path in your system)

	Google up in case of any concerns or reach our edureka support team

JRE
	Java Runtime Environment
	To push the bytecode to JVM
	Installation : Automatically Installed alongwith JDK


IDE's
Integrated Development Environment
Software which we will use to cretate programs i.e. Softwares :)

Eclipse, Netbeans, IntelliJ	
Download and Install any 1 of them

We will officially be working with Eclipse :)

PS: IDE uses JDK so that we developers can develop in the IDE
1st Step -> Install JDK
2nd Step -> Install IDE


10 mins of break...
8:40 AM IST


	Java
		JSE
			Java Standard Edition
			Core Java
			Purpose: To Develop Desktop Apps
		JEE
			Java Enterprise Edition
			Advanced Java
			Purpose: To Develop Web Apps
		JME
			Java Mobile Edition
			Purpose: To Develop Mobile Apps for Feature Phones

 
 */

// This is a comment and is not executed as programming instruction
// MyApp is class
public class MyApp {

	// main is a method
	// we will write our instruction in this main method
	// whatever we will write in main will be executed automatically in a sequence
	public static void main(String[] args) {

		// System.out.println is an instruction and is a built in code
		// available from JDK Library for us
		System.out.println("Search the Candle, Rather than Cursing the Darkness !!");
		
		System.out.println("Welcome to Edureka App !!");
		
		System.out.println("Work Hard, Get Luckier !!");
		
	}

}

// Eclipse will automatically compile our code and generate .class files for us :)
