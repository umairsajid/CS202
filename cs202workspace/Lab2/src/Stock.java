
public class Stock {
	
	private int month;
	private int day;
	private int year;
	private String name;
	private double open;
	private double close;
	private double highest;
	private double lowest;
	private static int numberOfStocks;
	
	public Stock(String date, String name, double open, double close, double highest, double lowest){
		getNumberOfStocks();
		//incrementStocks();
		String[] pDate = date.split("/");
		month = Integer.parseInt(pDate[0]);
		day = Integer.parseInt(pDate[1]);
		year = Integer.parseInt(pDate[2]);
		
		this.name = name;
		this.open = open;
		this.close = close;
		this.highest = highest;
		this.lowest =lowest;
		//numberOfStocks = 0;
		//getNumberOfStocks();
		//incrementStocks();
		//numberOfStocks++;
	}
	
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public double getOpen(){
		return open;
	} 
	public void setOpen(double open){
		this.open = open;
	}
	
	public double getClose(){
		return close;
	} 
	public void setClose(double close){
		this.close = close;
	}
	
	public double getHighest(){
		return highest;
	} 
	public void setHighest(double highest){
		this.highest = highest;
	}
	
	public double getLowest(){
		return open;
	} 
	public void setLowest(double lowest){
		this.lowest = lowest;
	}

	public int getNumberOfStocks(){
		//numberOfStocks = 0;
		return numberOfStocks;
	}
	
	public static int incrementStocks(){
		numberOfStocks++;
		return numberOfStocks;
	}
	
	
	public static int decrementStocks(){
		numberOfStocks--;
		return numberOfStocks;
	}
	
	public String toString(){
		return "Stock Name: " + name + 
				"\nDate: " + month + "/" + day + "/" + year + 
			    "\nOpening: " + open +
			    "\nClosing: " + close +
			    "\nHighest: " + highest +
			    "\nLowest: " + lowest +
			    "\nNumber of Stocks: " + numberOfStocks + "\n";
	}
}