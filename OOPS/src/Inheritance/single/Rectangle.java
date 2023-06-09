package Inheritance.single;

//Inheriting Shape member using extends keyword
class Rectangle extends Shape {

 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle();  // creating object of child class
     System.out.println("Area of rectangle :: "+ rectangle.calculateArea(10,5)); // calcualateArea method accessible to rectangle class
 }

}