package access_specifier.multilevelinheritance;

public class Parent extends GrandParent {
	public void View()
	{
		System.out.println("INSIDE CHILD View() METHOD" );
		System.out.println("Private - "+ a);//Can't Access GrandParent PRIVATE MEMBER 
		System.out.println("Can't Access Parent PRIVATE MEMBER");
		System.out.println("Default - "+ b);
		System.out.println("Protected - "+ c);
		System.out.println("Public - "+ d);
		System.out.println();
	}
}
