import java.util.ArrayList;

/**
 * polygon represent a polygon with some number of sides
 * @author alireza karimi
 * @version 1.0.0
 */
public class Polygon extends Shape{
	
	//this arraylist will hold sides and their size
	private ArrayList<Double> sides;
	
	/**
	 * creating a new polygon
	 * @param args some doubles which show the sides' size
	 */
	public Polygon(double... args){
		super();
		sides = new ArrayList<>();
		
		for(double arg : args){
			sides.add(arg);
		}
	}
	
	/**
	 * calculating the perimeter of polygon
	 * @return perimeter of polygon
	 */
	@Override
	public double calculatePerimeter(){
		double perimeter = 0;
		
		for(double side : sides){
			perimeter += side;
		}
		
		return perimeter;
	}
	
	/**
	 * getting sides' size of polygon
	 * @return sides' size of polygon
	 */
	public ArrayList<Double> getSides(){
		return sides;
	}
	
	/**
	 * performing toString on polygon
	 * @return String containing polygon type and sides' size
	 */
	@Override
	public String toString(){
		
		String string = new String();
		
		for(int i = 0; i < sides.size() - 1; i++){
			
			string = string.concat("side" + (i + 1) + ":" + sides.get(i) + ", ");
		}
	
		string = string.concat("side" + sides.size() + ":" + sides.get(sides.size() - 1));
		
		return string;
	}

}
