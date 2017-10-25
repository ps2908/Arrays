import java.io.*;
import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		int array[] = {1,2,3,4,5,6,7};
		int key = 7;
		int loc = search(array, key);
		System.out.println("index:" + loc);
	}
	
	static int search(int a[], int find){
		for (int i = 0; i< a.length; i++){
			if(a[i] == find)
				return i;
		}
			
			return -1;
	}
}