package javalab;

abstract class Shape{
	abstract void numberofsides();
}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side= side;
	}
	void numberofsides() {
		System.out.println("Iam Rectangle, Number of sides =" +side);
	}
}
class Triangle extends Shape {
	int side;
	Triangle(int side){
		this.side= side;
	}
void numberofsides() {
	System.out.println("Iam Triangle, Number of sides =" +side);
}
}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side= side;
	}
	void numberofsides() {
		System.out.println("Iam Hexagon,Number of sides =" +side);
	}
}
public class Abstractclass{
	public static void main(String args[]) {
		Rectangle rec = new Rectangle(4);
		Triangle tri = new Triangle(3);
		Hexagon hex = new Hexagon (6);
		rec.numberofsides();
		tri.numberofsides();
		hex.numberofsides();
	}	
}