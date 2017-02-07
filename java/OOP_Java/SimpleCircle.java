public class SimpleCircle{
	private double radius;

	public SimpleCircle()	{
		radius = 1.0;
	}

	public SimpleCircle(double radius)	{
		this.radius = radius;		
	}

	public void setRadius(double radius)	{
		this.radius = radius;
	}

	public double getRadius()	{
		return radius;
	}

	public double getArea()	{
		return radius*radius*Math.PI;
	}

	public double getCircumference()	{
		return 2*radius*Math.PI;
	}

	public String toString(){
		return "SimpleCircle[ radius = " + radius + "]";
	}
}
