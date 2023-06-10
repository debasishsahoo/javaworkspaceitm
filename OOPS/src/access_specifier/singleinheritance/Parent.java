package access_specifier.singleinheritance;

public class Parent {
	     //ACCESS SPECIFIER
		private int a = 101;
		        int b = 102; //default
		protected int c = 103; //Child class can use this variable
		public int d = 104; //Child class can use this variable
		
		public void Display()
		{
			System.out.println("INSIDE PARENT Display() METHOD" );
			System.out.println("Private - "+ a);
			System.out.println("Default - "+ b);
			System.out.println("Protected - "+ c);
			System.out.println("Public - "+ d);
			System.out.println();
		}
}
