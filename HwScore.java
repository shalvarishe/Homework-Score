
public class HwScore {
	private static double A = 0.9;
	private static double B = 0.8;
	private static double C = 0.7;
	private static double D = 0.6;
	private static double totalEarnedPoints = 0;
	private static double totalPossiblePoints = 0;
	double earnedPoints;
	double possiblePoints;
	public HwScore(double earned, double possible)
	{
		earnedPoints = earned;
		possiblePoints = possible;
		this.addPoints();
	}
	private void addPoints()
	{
		totalEarnedPoints += this.earnedPoints;
		totalPossiblePoints += this.possiblePoints;
	}
	private static String findLetterGrade(double percentGrade)
	{
		String letterGrade;
		if (percentGrade >= A)
		{
			letterGrade = "A";
		}
		else if (percentGrade >= B)
		{
			letterGrade = "B";
		}
		else if (percentGrade >= C)
		{
			letterGrade = "C";
		}
		else if (percentGrade >= D)
		{
			letterGrade = "D";
		}
		else
		{
			letterGrade = "F";
		}
		return letterGrade;
	}
	public void printGrade()
	{
		double percentGrade = this.earnedPoints/this.possiblePoints;
		String letterGrade = findLetterGrade(percentGrade);
		System.out.println("On this homework, you earned "+this.earnedPoints+" out of "+this.possiblePoints+" possible points: "+letterGrade);
		
	}
	public static void printOverallGrade()
	{
		double finalGrade = totalEarnedPoints/totalPossiblePoints;
		String letterGrade = findLetterGrade(finalGrade);
		System.out.println("On all homework, you earned "+totalEarnedPoints+ " out of "+totalPossiblePoints+" possible points: "+letterGrade);
	}
}
