package Hashing;

import java.util.*;

public class Hashmap {
	public static void main(String args[]) {
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(16, "Virat");
		HM.put(1, "Rohit");
		HM.put(40, "MSD");
		HM.put(5, "SKY");
		HM.put(3, "Panth");
		HM.put(38, "Jadeja");
		System.out.println("Initial HashMap: " + HM);
		// remove function can be used to erase elements
		// key-based removal
		HM.remove(1); // removing element with key 1
		HM.remove(40);
		System.out.println("Updated HashMap: " + HM);

		// key-value pair based removal
		HM.remove(16, "Rahul");
		System.out.println("Updated HashMap: " + HM);
	}
}
