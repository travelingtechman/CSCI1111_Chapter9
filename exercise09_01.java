package coursework;
/**
 * 
 * @author Ethan Hunt
 * 3/10/22
 */
public class exercise09_01{
	public static void main(String[] args) {		
		Rectangle rectangle1 = new Rectangle(4.0,40.0);
		System.out.println("The area of rectangle with a width of "+rectangle1.width+ " and a height of "
		+ rectangle1.height + " is "+ rectangle1.getArea() + "\nThe perimeter is " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		System.out.println("The area of rectangle with a width of " + rectangle2.width + " is "
		+ rectangle2.getArea() + "\nThe perimeter is " + rectangle2.getPerimeter());
	}
}
	class Rectangle {
		double width = 1;
		double height = 1;
	
	Rectangle(){
		
	}
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return (width*2)+(height*2);
	}
	void setWid (double newWidth ) {
		
		
		width = newWidth;
		
	}
	void setHei(double newHeight) {
		height = newHeight;
	}
	}
	
