import java.util.*;
import java.lang.*;

class SetOperation{

public static void main(String[] args){
	Set<Integer> a = new HashSet<Integer>();
	Set<Integer> b = new HashSet<Integer>();
	
	a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
	b.addAll(Arrays.asList(new Integer[] {1,2,3}));
	
	//union
	
	Set<Integer> union = new HashSet<Integer>(a);
	union.addAll(b);
	
	System.out.println("union "+ union);
	
	// intersection
	Set<Integer> intersection = new HashSet<Integer>(a);
	intersection.retainAll(b);
	
	System.out.println("intersection "+ intersection);
	
	// difference
	Set<Integer> diff = new HashSet<Integer>(a);
	diff.removeAll(b);
	System.out.println("difference "+ diff);
	

}
}