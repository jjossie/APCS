
public class Time implements Comparable
{
	private int hour;
	private int minute;

	/*
	 * Sets the default time to 12:00.
	 */
	public Time ()
	{
		this(12, 0);
	}

	/*
	 * Sets hour to h and minute to m.
	 */
	public Time (int h, int m)
	{
		hour = 0;
		minute = 0;
		if (h >=1 && h <= 23)
			hour = h;
		if (m >= 1 && m <= 59)
			minute = m;

	}

	/*
	 * Returns the time as a String of length 4 in the format: 0819.
	 */
	public String toString ()
	{

		String h = "";
		String m = "";
		if ( hour <10)
			h +="0";
		if (minute <10)
			m +="0";
		h += hour;
		m+=minute;

		return "" + h + "" + m;
	}
	public int compareTo(Object obj){
		Time t = (Time) obj;
		int x = 0;
		if (this.hour < t.hour){
			x = -1;
		}else if (this.hour > t.hour){
			x = 1;
		}else {
			if (this.minute<t.minute){
				x = -1;
			}
			else if (this.minute>t.minute){
				x = 1;
			}else
				x = 0;
		}
		return x;
	}
	public Time difference(Time t){
		Time x = t;
		if (this.compareTo(t) == -1){
			x.hour = t.hour-this.hour;
			x.minute = t.minute-this.minute;
		}
		else if (this.compareTo(t) == 1){
			x.hour = this.hour-t.hour;
			x.minute = this.minute-t.minute;
		}else {
			x.hour = 0;
		}
		return x;
	}

}