import java.util.ArrayList;

/**
 * paint representation
 * @author alireza karimi
 * @version 1.0.0
 */
public class Paint {
	private ArrayList<Triangle> triangles;
	private ArrayList<Circle> circles;
	private ArrayList<Rectangle> rectangles;
	
	/**
	 * creating a new paint
	 */
	public Paint(){
		triangles = new ArrayList<>();
		circles = new ArrayList<>();
		rectangles = new ArrayList<>();
	}
	
	/**
	 * adding a triangle to paint
	 * @param triangle
	 */
	public void addTriangle(Triangle triangle){
		triangles.add(triangle);
	}
	
	/**
	 * adding a circle to paint
	 * @param circle
	 */
	public void addCircle(Circle circle){
		circles.add(circle);
	}
	
	/**
	 * adding a rectangle to paint
	 * @param rectangle
	 */
	public void addRectangle(Rectangle rectangle){
		rectangles.add(rectangle);
	}
	
	/**
	 * drawing all objects (type, perimeter and area)
	 */
	public void drawAll(){
		for(Triangle triangle : triangles){
			triangle.draw();
		}
		
		for(Circle circle : circles){
			circle.draw();
		}
		
		for(Rectangle rectangle : rectangles){
			rectangle.draw();
		}
	}
	
	/**
	 * printing all objects (type and sides or radius)
	 */
	public void printAll(){
		for(Triangle triangle : triangles){
			System.out.println(triangle.toString());
		}
		
		for(Circle circle : circles){
			System.out.println(circle.toString());
		}
		
		for(Rectangle rectangle : rectangles){
			System.out.println(rectangle.toString());
		}
	}
}
