class Escape
{
	public static void main (String[] args)
	{
	
	//Declarations
	String	header,
		forecast;



	//Initialisations

	header = "\n\tNEW YORK 3-DAY FORECAST:\n";
	header += "\n\tDay\t\tHigh\tLow\tConditions\n";
	header += "\t---\t\t----\t---\t----------\n";

	forecast = "\tSunday\t\t68F\t48F\tSunny\n";
	forecast += "\tMonday\t\t69F\t57F\tSunny\n";
	forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";



	//Actions
	System.out.println(header +
			forecast);

	}
}
