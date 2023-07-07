package access_specifier.singleinheritance;

public class Main {

	public static void main(String[] args) {
		//PARENT CLASS OBJECT CAN ONLY CALL ALL PARENT CLASS METHODS
		Parent obj_parent = new Parent();
		System.out.println("Using Parent Class Object");
		obj_parent.Display(); 
		
		//CHILD CLASS OBJECT CAN CALL ALL PARENT + CHILD CLASS METHODS
		Child obj_child = new Child();
		System.out.println("Using Child Class Object");
		obj_child.Display();
		obj_child.View();

	}

}
