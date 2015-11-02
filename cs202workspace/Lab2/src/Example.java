import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Example {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner input = new Scanner(new File("inputstocks.txt"));
		
		ArrayList<Stock> stockList = new ArrayList<Stock>();
		
		try {
	        File inFile  = new File("input_stocks.csv");  // File to read from.
			Scanner freader = new Scanner(inFile);
	
			for(int counter =0; counter < 7; counter++) {
				String line = freader.nextLine();
				
				String[] fields = line.split(",");
				
				String date = fields[0]; 
				String name = fields[1];
				double open = Double.parseDouble(fields[2]);
				double close = Double.parseDouble(fields[3]);
				double highest = Double.parseDouble(fields[4]);
				double lowest = Double.parseDouble(fields[5]);	
				
				stockList.add(new Stock(date, name, open, close, highest, lowest));
			}
			freader.close(); 

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
		
//		while(input.hasNext()) {
//			String row = input.nextLine();
//			String[] fields = row.split(",");
//			
//			String date = fields[0]; 
//			String name = fields[1];
//			
//			double open = Double.parseDouble(fields[2]);
//			double close = Double.parseDouble(fields[3]);
//			double highest = Double.parseDouble(fields[4]);
//			double lowest = Double.parseDouble(fields[5]);	
//			
//			stockList.add(row);
//		}
//		Stock test = new Stock("09/13/1994","ARI",120.11,984.95,999.99,120.10);
//		System.out.println(test);

		//}
		
		
		for(Stock i: stockList) {
	         System.out.println(i.toString());
		}
		
		//... Get two file names from use.
        System.out.print("Enter a filepath to write to: ");
        Scanner input = new Scanner(System.in);

        //... Create File objects.
        File outFile = new File(input.next());  // File to write to

		
		try {
            writeToFile(outFile, stockList);

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
		
		input.close();
		
		//System.out.println(stockList.size());
	}
	
	
	public static void writeToFile(File toFile, ArrayList<Stock> stockList) throws IOException {
//        Scanner freader = new Scanner(fromFile);
        BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

        //... Loop as long as there are input lines.
        for(Stock i: stockList) {
        	writer.write(i.toString());
            writer.newLine(); 
		}
        
        
//        String line = null;
//        while (freader.hasNextLine()) {
//            line = freader.nextLine();
//            writer.write(line);
//            writer.newLine();   
//        }

        //... Close reader and writer.
//        freader.close();  
        writer.close();  
    }
}
