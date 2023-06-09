package problams;

public class Triangle {
	
	public int a,b,c;
	
	public double getArea() {
		double s = (a+b+c)/2.0;
	    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	};
	
	public double getPerameter() {
		double s = (a+b+c)/2.0;
		return s;
	}
	; 
	
	

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.a=4;
		t.b=5;
		t.c=6;

	}

}
