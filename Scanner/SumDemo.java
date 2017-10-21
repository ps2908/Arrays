
import java.util.*;
import java.lang.*;
import java.io.*;

class SumDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNextInt()){
			int number = sc.nextInt();
			sum = sum + number;
			//counter++;
		}
		System.out.println("sum: "+sum);
	}
}