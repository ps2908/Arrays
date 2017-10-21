import java.util.*;
import java.lang.*;

class ArrayRotate{
	public static void main(String[] args){
	//ArrayRotate ar = new ArrayRotate();
	int array[] = {1,2,3,4,5};
	int temp, i;
	int n = array.length;
	System.out.println(n);
	temp = array[0];
	for( i=0; i < n-1; i++){
		
		array[i] = array[i+1];
		
	}
	array[n-1] = temp;
	for( i = 0; i< n; i++)
	System.out.println(" " + array[i]);
	}
}