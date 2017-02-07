public class Line{
	private Point begin;
	private Point end;

	public Line(Point begin, Point end){
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY){
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	public String toString(){
		return "Line:(Begin "+begin+" End "+end+")";
	}

	public Point getBegin(){
		return begin;
	}

	public Point getEnd(){
		return end;
	}

	public void setBegin(Point begin){
		this.begin = begin;
	}

	public void setEnd(Point end){
		this.end = end;
	}
}
