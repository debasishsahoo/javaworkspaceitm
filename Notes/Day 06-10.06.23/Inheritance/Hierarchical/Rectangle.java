package Inheritance.Hierarchical;

class Rectangle extends Shape {

long calculateArea(long l, long b) {
return l * b;
}

public static void main(String[] args) {
long area;
Square squareObj = new Square();
Rectangle rectangleObj = new Rectangle();
area = squareObj.calculateArea(3);
squareObj.printArea(area);
area = rectangleObj.calculateArea(3, 2);
rectangleObj.printArea(area);

}
}