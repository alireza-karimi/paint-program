import java.util.ArrayList;

/**
 * Paint class represents a simple paint program
 * @author alireza karimi
 * @version 1.0.0
 */
public class Paint{
	
	//this arrayList will store all shapes
	private ArrayList<Shape> shapes;
	
	/**
	 * creating a new paint
	 */
	public Paint(){
		shapes = new ArrayList<>();
	}
	
	/**
	 * adding a new shape to paint
	 * @param shape new shape
	 */
	public void addShape(Shape shape){
		shapes.add(shape);
	}
	
	/**
	 * drawing all shapes (their type, perimeter and area)
	 */
	public void drawAll(){
		for(Shape shape : shapes){
			shape.draw();
		}
	}
	
	/**
	 * printing all shapes (their type, radius or sides size)
	 */
	public void printAll(){
		for(Shape shape : shapes){
			System.out.println(shape.toString());
		}
	}
	
	/**
	 * iterating on all shapes and print them (print toString) if they were equilateral or square
	 */
	public void describeEqualSides(){
		for(Shape shape : shapes){
			
			if(shape instanceof Triangle){
				if(((Triangle) shape).isEquilateral()){
					System.out.println(shape.toString());
				}
			}
			
			if(shape instanceof Rectangle){
				if(((Rectangle) shape).isSquare()){
					System.out.println(shape.toString());
				}
			}
		}
	}
	
	
}
