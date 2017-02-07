public class LineSub extends Point{
	Point end;

	public LineSub(Point begin, Point end){
		super(begin.getX(),begin.getY());
		this.end = end;
	}

	public LineSub(int beginX, int beginY, int endX, int endY){
		super(beginX, beginY);
		end = new Point(endX, endY);
	}

	public String toString(){
		return "Line: (begin "+super.toString()+" end "+end+")";
	}

	public Point getBegin(){
		return this;
	}

	public Point getEnd(){
		return end;
	}

}
