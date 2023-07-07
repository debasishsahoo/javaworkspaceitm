package Hashing;

import java.util.*;

class HashTable {
	public static void main(String args[]) {

		Hashtable<Integer, String> HT = new Hashtable<Integer, String>();
		HT.put(16, "Virat");
		HT.put(1, "Rohit");
		HT.put(40, "MSD");
		HT.put(5, "SKY");
		HT.put(3, "Panth");
		HT.put(38, "Jadeja");
		for (Map.Entry m : HT.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
