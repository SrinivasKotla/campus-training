public class TestCylinder{
	public static void main(String [] args){
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder c1:["
			+"radius = "+c1.getRadius()
			+" height = "+c1.getHeight()
			+" BaseArea = "+c1.getArea()
			+" Volume = "+c1.getVolume()+"]");
		System.out.println(c1);

		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder c2:["
			+"radius = "+c2.getRadius()
			+" height = "+c2.getHeight()
			+" BaseArea = "+c2.getArea()
			+" Volume = "+c2.getVolume()+"]");

		Cylinder c3 = new Cylinder(2.0,10.0);
		System.out.println("Cylinder c3:["
			+"radius = "+c3.getRadius()
			+" height = "+c3.getHeight()
			+" BaseArea = "+c3.getArea()
			+" Volume = "+c3.getVolume()+"]");
	}
}
