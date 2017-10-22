import java.util.*;
import java.lang.*;
class SetDemo{
	public static void main(String[] args){
		
		// Sets does not allow duplicates
		//Set can be implemented using hashset, linkedset, treeset
		// tree set sorts the values
		
		Set<String> hs = new HashSet<String>();
		hs.add("New");
		hs.add("set");
		hs.add("example!");
		hs.add("New"); //duplicate value, will not be stored
		System.out.println("value in hash set "+ hs );
		
		// TREE SET
		
		Set<String>  ts = new TreeSet<String>(hs);
		System.out.println("value in hash set "+ ts );
	}
}