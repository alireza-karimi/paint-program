/**
 * performing some tests
 * @author alireza karimi
 * @version 1.0.0 
 */
public class Main{
	
	/**
	 * main method
	 * @param args parameters of main method
	 */
	public static void main(String[] args){
		
		
		//false - we can not take a circle as reference to shape because not every shape is a circle - perform casting
		//Circle circle1 = new Shape(19);
		
		//true - we can take a shape as reference to circle because every circle is a shape
		Shape circle2 = new Circle(3);
		
		//false - obviously we can not take a rectangle as reference to triangle! :))))
		//Rectangle rect1 = new Triangle(1,4,1);
		
		//true - we can take a polygon as a reference to rectangle because every rectangle is a polygon
		Polygon rect2 = new Rectangle(8,5,8,5);
		
		//false - we can not take a rectangle as a reference to shape because not every shape is a rectangle - perform casting
		//Rectangle rect3 = new Shape(6,6,6,6);
		
		//true - every triangle is a polygon
		Polygon tri1 = new Triangle(2,2,2);
		
		//true
		Triangle tri2 = new Triangle(4,4,6);
		
		//true - every triangle is a shape
		Shape tri3 = new Triangle(2,2,2);
		
		//false - circle2 is a shape reference. circle1 is a circle reference. we can not take a circle as a reference to shape 
		//circle1 = circle2;
		
		//true because every rectangle is a polygon and we can take polygon as a reference to rectangle
		//rect2 = rect3;	//commented cause there are some problems in rect3
		
		//false - tri1 is a polygon reference. tir3 is a shape reference. not every shape is a polygon
		//tri1 = tri3;
		
		//true both circle2 and tri3 are shape reference. we can make them point to the same object (tri3 which is a triangle)
		circle2 = tri3;
		
		//true - every triangle is a shape
		tri3 = tri2;
		
		//false - not every shape is a rectangle
		//rect3 = new Shape(2,3,2);
		
		//true if there is not problem with rect3 
		//System.out.println(rect3.toString());
		
		
		//below are some examples to check performance of code
		/*
		Circle circle1 = new Circle(19);
		Circle circle2 = new Circle(3);
		Rectangle rect1 = new Rectangle(1,4,1,4);
		Rectangle rect2 = new Rectangle(8,5,8,5);
		Rectangle rect3 = new Rectangle(6,6,6,6);
		Triangle tri1 = new Triangle(2,2,2);
		Triangle tri2 = new Triangle(4,4,6);
		Paint paint = new Paint();
		paint.addShape(circle1);
		paint.addShape(circle2);
		paint.addShape(rect1);
		paint.addShape(rect2);
		paint.addShape(rect3);
		paint.addShape(tri1);
		paint.addShape(tri2);
		paint.drawAll();
		paint.printAll();
		*/

	}

}
