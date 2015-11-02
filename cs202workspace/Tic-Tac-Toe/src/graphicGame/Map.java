package graphicGame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map {


	public static void main(String[] args) {
		String fileName = "currExRates.txt";
		
		
		SortedMap<String, Double> sMap = new TreeMap<String, Double>();
		try {
			Scanner scanner = new Scanner(new File(fileName));
			
			File inFile  = new File(fileName);  // File to read from.
			Scanner freader = new Scanner(inFile);
			
			int numberOfCountries = 0;
			while(scanner.hasNext()){
				scanner.nextLine();
				numberOfCountries++;
			}
			
			for(int i = 0; i < numberOfCountries; i++){
				String line = freader.nextLine();
				String regex = "(\\s)+";
				
				String[] fields = line.split(regex);
				
				String currSymbol = fields[0];
				String USDperUnit = fields[1];
				double unitsPerUSD = Double.parseDouble(fields[2]);
				String nameOfCurr = fields[3];
				
				sMap.put(currSymbol, unitsPerUSD);
			}
			freader.close(); 

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }

		System.out.println(sMap);
		
	}
	

}
