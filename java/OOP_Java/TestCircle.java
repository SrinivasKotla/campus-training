public class TestCircle{
	public static void main(String [] args){
		Circle c1 = new Circle();

		System.out.println("The area of circle with radius " + 
		c1.getRadius() + " is " + c1.getArea());
		System.out.println(c1.toString());
		Circle c2 = new Circle(2.0);

		System.out.println("The area of cirlce with radius " 
		+ c2.getRadius() + " is " + c2.getArea());
		System.out.println(c2);
		System.out.println("Operator '+' invokes toString too" + c2);
 		Circle c3 = new Circle(3.0,"Blue");

		System.out.println("The colour of the circle is: " + c3.getColour());

		Circle c4 = new Circle();
		c4.setRadius(4.0);
		System.out.println("The radius of cirlce c4: "+c4.getRadius());
		c4.setColour("orange");
		System.out.println("The colour of circle c4: "+c4.getColour());
	}
}
