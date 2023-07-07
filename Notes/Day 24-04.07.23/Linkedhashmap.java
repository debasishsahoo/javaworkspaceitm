package Hashing;

import java.util.*;

public class Linkedhashmap {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();

		LHM.put(16, "Virat");
		LHM.put(1, "Rohit");
		LHM.put(40, "MSD");
		LHM.put(5, "SKY");
		LHM.put(3, "Panth");
		LHM.put(38, "Jadeja");

		System.out.println("Does it mentain insertion order? ....");

		for (Map.Entry m : LHM.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
