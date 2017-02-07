public class MyTime{
	private int hour;
	private int minute;
	private int second;

	public MyTime(){
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second){
		if(hour<=24)
			this.hour = hour;
		if(minute<=60)
			this.minute = minute;
		if(second<=60)
			this.second = second;
	}

	public String toString(){
		String hr;
		String min;
		String sec;

		if(hour<10)
			hr = "0"+hour;
		else
			hr = Integer.toString(hour);

		if(minute<10)
			min = "0"+minute;
		else
			min = Integer.toString(minute);

		if(second<10)
			sec = "0"+second;
		else
			sec = Integer.toString(second);

		return hr+":"+min+":"+sec;

	}	
}
