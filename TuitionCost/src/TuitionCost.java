import java.lang.Math;

public class TuitionCost 
{
	//instance variables
	private double initTuitCost;
	private double interest;
	
	public TuitionCost()
	{
		initTuitCost=0;
		interest=0;
	}
	public TuitionCost(double initTuitCost, double interest)
	{
		this.initTuitCost = initTuitCost;
		this.interest = interest / 100;
	}
	public double calcTuitionCost()
	{
		double currentTuit = initTuitCost;
		double tuitCost = 0;
		for(int i = 1; i <= 4; i++)
		{
			tuitCost += currentTuit;
			currentTuit = currentTuit + (currentTuit * interest);
		}
		return Math.round(tuitCost*100)/100.0d;
	}
}
