
import java.util.*;
import java.lang.*;
import java.io.*;

class ScannerDemo
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in); //predifined object
		//get char input
		char a = scan.next().charAt(0);
		// get integer input
		int value = scan.nextInt();
		// get long input
		long val = scan.nextLong();
		//get string input
		String name = scan.nextLine();
		
		//Printing all values
		System.out.println(value);
		System.out.println(val);
		System.out.println(name);
		System.out.println(a);
	}
}