package access_specifier.multilevelinheritance;

public class Main {

	public static void main(String[] args) {
		//GrandPARENT CLASS OBJECT CAN ONLY CALL ITS METHODS
				GrandParent obj_grandparent = new GrandParent();
				System.out.println("Using GrandParent Class Object");
				obj_grandparent.Display(); 
						
				//PARENT CLASS(Child of GrandParent) OBJECT CAN CALL ALL GRANDPARENT + IT's own METHODS
				Parent obj_parent = new Parent();
				System.out.println("Using PARENT CLASS(Child of GrandParent CLASS) Object");
				obj_parent.Display();
				obj_parent.View();
				
				Child obj_grandchild = new Child();
				System.out.println("Using GrandChild CLASS(Child of Parent CLASS & Grandchild of GrandParent Class) Object");
				System.out.println("\nCALL GRANDPARENT F1 + PARENT F2 + IT's OWN F3 METHODS");
				obj_grandchild.Display();
				obj_grandchild.View();
				obj_grandchild.Output();

	}

}
