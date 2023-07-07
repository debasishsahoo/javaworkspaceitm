package problams;
/**
 * The Point class models a 2D point at (x, y).
 */
public class Point {
	 // The private instance variables
	   private int x, y;

	   // The constructors (overloaded)
	   /** Construct a Point instance with the default values */
	   public Point() {  // The default constructor
	      this.x = 0;
	      this.y = 0;
	   }
	   /** Construct a Point instance with the given x and y values */
	   public Point(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   // The public getters and setters
	   /** Returns the value of x */
	   public int getX() {
	      return this.x;
	   }
	   /** Sets the value of x */
	   public void setX(int x) {
	      this.x = x;
	   }
	   /** Returns the value of y */
	   public int getY() {
	      return this.y;
	   }
	   /** Sets the value of y */
	   public void setY(int y) {
	      this.y = y;
	   }

	   /** Returns a self-descriptive string in the form of "(x,y)" */
	   public String toString() {
	      return "(" + this.x + "," + this.y + ")";
	   }

	   /** Returns a 2-element int array containing x and y */
	   public int[] getXY() {
	      int[] results = new int[2];
	      results[0] = this.x;
	      results[1] = this.y;
	      return results;
	   }

	   /** Sets both x and y */
	   public void setXY(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   /** Return the distance from this instance to the given point at (x,y). Invoke via p1.distance(1,2) */
	   public double distance(int x, int y) {
	      int xDiff = this.x - x;
	      int yDiff = this.y - y;
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
	   /** Returns the distance from this instance to the given Point instance. Invoke via p1.distance(p2) */
	   public double distance(Point another) {
	      int xDiff = this.x - another.x;
	      int yDiff = this.y - another.y;
	      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	   }
	   /** Returns the distance from this instance to (0,0). Invoke via p1.distance() */
	   public double distance() {
	      return Math.sqrt(this.x*this.x + this.y*this.y);
	   }
}
