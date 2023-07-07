package Inheritance.has_a.Aggregation;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		  //Create three Sportsperson objects
		  SportPerson macculum = new SportPerson("Mccullum");
		  SportPerson dhoni = new SportPerson("Dhoni");
		  SportPerson kohli = new SportPerson("Kohli");
		  //Create a country
		  Country india = new Country("India");
		  //Create a arraylist and add the sportspersons
		  List<SportPerson> listOfSportPersons = new ArrayList<SportPerson>();
		  
		  sportPersons.add(macculum);
		  sportPersons.add(dhoni);
		  sportPersons.add(kohli);
		 
		  //now add this list to Country Class
		  india.setSportPersons(listOfSportPersons);
		  //Outputting the Has-a association between Country and Sportsperson
		  System.out.println("The sports people from country " + india.getName() + " are " + india.getSportPersons());
		  
		}
}
