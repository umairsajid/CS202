import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		String nameOfFile = "input_stocks.csv";

		ArrayList<Stock> stockList = readStocks(nameOfFile);
		
		createStock(stockList);
		
		displayStocks(stockList);
		
		String nameOfStock = null;
		deleteStock(stockList, nameOfStock);
		displayStocks(stockList);
		
		Stock highestOpening = findHighestOpening(stockList);
		
		Stock lowestClosing = findLowestClosing(stockList);
		
		System.out.println("\nStock with Highest opening: \n" + highestOpening + "\nStock with Lowest closing: \n" + lowestClosing);
		
		double totalHighest = findTotalHighest(stockList);		
		System.out.println("The total of all the highest opening is: " + totalHighest);
		
		double averageOfLowest = findAverageLowest(stockList);
		System.out.println("The average of all the lowest opening is: " + averageOfLowest);
		
		
	}
	
	public static ArrayList<Stock> readStocks(String filename) throws FileNotFoundException{
		Scanner input = new Scanner(new File(filename));
		
		ArrayList<Stock> stockList = new ArrayList<Stock>();
		try {
	        File inFile  = new File(filename);  // File to read from.
			Scanner freader = new Scanner(inFile);
			 
			int numberOfObjects = 0;
			while(input.hasNext()){
				input.nextLine();
				numberOfObjects++;
			}
	
			for(int counter = 0; counter < numberOfObjects; counter++) {
				String line = freader.nextLine();
				
				String[] fields = line.split(",");
				
				String date = fields[0]; 
				String name = fields[1];
				double open = Double.parseDouble(fields[2]);
				double close = Double.parseDouble(fields[3]);
				double highest = Double.parseDouble(fields[4]);
				double lowest = Double.parseDouble(fields[5]);	
				
				stockList.add(new Stock(date, name, open, close, highest, lowest));
				Stock.incrementStocks();
			}
			freader.close(); 

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
		

		return stockList;
		
	}
	 
	public static void createStock(ArrayList<Stock> stocks){
		Scanner newStock = new Scanner(System.in);
		System.out.println("Please create a new Stock (Be sure to enter the following: date,name,opening price,closing price,highest price,lowestprice): ");
		
		for(int counter = 0; counter < 1; counter++) {
			String line = newStock.nextLine();
			
			String[] fields = line.split(",");
			
			String date = fields[0]; 
			String name = fields[1];
			double open = Double.parseDouble(fields[2]);
			double close = Double.parseDouble(fields[3]);
			double highest = Double.parseDouble(fields[4]);
			double lowest = Double.parseDouble(fields[5]);	
			
			stocks.add(new Stock(date, name, open, close, highest, lowest));
			Stock.incrementStocks();
		}
			
		
	}

	public static void deleteStock(ArrayList<Stock> stocks, String stockName){
		Scanner deleteStock = new Scanner(System.in);
		System.out.print("Type the name of the stock you would like to delete: " );
		stockName = deleteStock.next();
		
		int count = 0;
		int removeNum = 0;
		for(Stock i: stocks) {
			if(i.getName().equals(stockName)){
				//System.out.println("You chose to delete the stock: " + stockName);
				removeNum = count;
				Stock.decrementStocks();
				//break the loop because we are done 
				break;
			}
			count++;
		}
		stocks.remove(removeNum);
		
	}
	
	public static void displayStocks(ArrayList<Stock> stocks){
		for(Stock i: stocks) 
	         System.out.println(i.toString());
		
	}
	
	public static Stock findHighestOpening(ArrayList<Stock> stocks){
		double highest = Double.MIN_VALUE;
		String nameOfLowest = null;
		int countStocks = 0;
		int stockNum = 0;

		for(int i = 0; i < stocks.size(); i++){
			stocks.get(i).getOpen();
			countStocks++;
			if (stocks.get(i).getOpen() > highest) {				
				highest = stocks.get(i).getOpen();
				nameOfLowest = stocks.get(i).getName();
				stockNum = countStocks;
			}
		}
		
		return stocks.get(stockNum - 1);
	}
	
	public static Stock findLowestClosing(ArrayList<Stock> stocks){
		double lowest = Double.MAX_VALUE;
		String nameOfLowest = null;
		int countStocks = 0;
		int stockNum = 0;

		for(int i = 0; i < stocks.size(); i++){
			stocks.get(i).getClose();
			countStocks++;
			if (stocks.get(i).getClose() < lowest) {				
				lowest = stocks.get(i).getClose();
				nameOfLowest = stocks.get(i).getName();
				stockNum = countStocks;
			}
		}
		
		return stocks.get(stockNum - 1);

	}
	
	public static double findTotalHighest(ArrayList<Stock> stocks){
		double sumTotal = 0;
		
		for(int i = 0; i < stocks.size(); i++){
			sumTotal += stocks.get(i).getHighest();
		}
		
		return sumTotal;
	}
	
	public static double findAverageLowest(ArrayList<Stock> stocks){
		double averageOfLowest = 0;
		double sumTotal = 0;
		int count = 0;
		
		for(int i = 0; i < stocks.size(); i++){
			sumTotal += stocks.get(i).getLowest();
			count++;
		}
		
		averageOfLowest = sumTotal/count;
		
		return averageOfLowest;
	}
}


//new Stock(09/13/1994,ARI,120.11,984.95,999.99,120.10);