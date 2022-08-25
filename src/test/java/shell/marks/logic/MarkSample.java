package shell.marks.logic;

public class MarkSample {
	String result;
	public String fail (int mark)
	{
		if(mark<=35)
			result="fail";
		return result;
	}
	public String thirdclass (int mark)
	{
		if(mark>=36 && mark<=50)
			result="3rd class";
		return result;
	}
	public String secondclass (int mark)
	{
		if(mark>=51 && mark<=75)
			result="2nd class";
		return result;
	}
	public String firstclass (int mark)
	{
		if(mark>=76 && mark<=100)
			result="1st class";
		return result;
	}

}
