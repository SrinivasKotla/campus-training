public class Square extends Rectangle{
	public Square(){
		super(1.0,1.0);
	}

	public Square(double side){
		super(side,side);	
	}

	public Square(double side, String color, boolean filled){
		this.length = side;
		this.width = side;
		this.color = color;
		this.filled = filled;
	}

	public double getSide(){
		return length;
	}

	public void setSide(double side){
		this.length = side;
		this.width = side;
	}
	
	@Override
	public void setLength(double side){
		this.length = side;
		this.width = side;
	}

	@Override
	public void setWidth(double side){
		this.length = side;
		this.width = side;
	}

	@Override
	public String toString(){
		return "Square: [ side: " +this.length+" color: " +this.color+" isFilled: "+this.filled+"]";
	}
}
