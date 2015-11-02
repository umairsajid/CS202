import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class EllipsoidTester {

	public static void main(String[] args) throws FileNotFoundException {
		String nameOfFile1 = "lab3input1.csv";
		String nameOfFile2 = "lab3input2.csv";
		String nameOfFile3 = "lab3input3.csv";
		
		ArrayList<Ellipsoid> Ellip1a = readFile(nameOfFile1);
		ArrayList<Ellipsoid> Ellip1b = readFile(nameOfFile1);
		ArrayList<Ellipsoid> Ellip2a = readFile(nameOfFile2);
		ArrayList<Ellipsoid> Ellip2b = readFile(nameOfFile2);
		ArrayList<Ellipsoid> Ellip3a = readFile(nameOfFile3);
		ArrayList<Ellipsoid> Ellip3b = readFile(nameOfFile3);
		
		System.out.println();
		System.out.println("Input 1 Result: ");
		sort1(Ellip1a);
		System.out.println();	
		sort2(Ellip1b);
		
		System.out.println();
		System.out.println("Input 2 Result: ");
		sort1(Ellip2a);
		System.out.println();	
		sort2(Ellip2b);
		
		System.out.println();		
		System.out.println("Input 3 Result: ");
		sort1(Ellip3a);
		System.out.println();	
		sort2(Ellip3b);
		

	}
	
	public static ArrayList<Ellipsoid> readFile(String filename) throws FileNotFoundException{
		Scanner input = new Scanner(new File(filename));
		
		ArrayList<Ellipsoid> ellip = new ArrayList<Ellipsoid>();
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
				
				double radius1 = Double.parseDouble(fields[0]);
				double radius2 = Double.parseDouble(fields[1]);
				double radius3 = Double.parseDouble(fields[2]);	
				
				ellip.add(new Ellipsoid(radius1, radius2, radius3));
			}
			freader.close(); 

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
		return ellip;
	}

	public static void sort1(ArrayList<Ellipsoid> list){
double[] area = new double[list.size()];
		
		for(int i = 0; i < list.size(); i++){
			area[i] = list.get(i).getArea();
		}
		
		int comparisonCount = 0;
		int swapCount = 0;
		boolean stop = false;
		int k = list.size() - 1;
		
		while(stop == false){
			double min = Double.MAX_VALUE;
			
			for(int i = 0; i <= k; i++){
				if(area[i] < min){
					min = area[i];
					comparisonCount++;
				}
				
				if(area[k] > min && area[i] == min){
					double temp;
					temp = area[k];
					area[k] = area[i];
					area[i] = temp;
					swapCount++;
				}
			}
			
			stop = checkDescending(area);
			k--;
		}
		
		System.out.println("\tFirst Sorting Algorithm: ");
		System.out.println("\t\t# of Swaps: " + swapCount);
		System.out.println("\t\t# of Comparisons: " + comparisonCount);
		if(list.size() > 10 == false){
			System.out.println("\t\tArea = " + area[0]);
			System.out.println("\t\tArea = " + area[1]);
			System.out.println("\t\tArea = " + area[2]);
			System.out.println("\t\tArea = " + area[3]);
			System.out.println("\t\tArea = " + area[4]);
			System.out.println("\t\tArea = " + area[5]);
			System.out.println("\t\tArea = " + area[6]);
			System.out.println("\t\tArea = " + area[7]);
			System.out.println("\t\tArea = " + area[8]);
			System.out.println("\t\tArea = " + area[9]);
		}
	}
	
	public static void sort2(ArrayList<Ellipsoid> list){
		double[] area = new double[list.size()];
		
		for(int i = 0; i < list.size(); i++){
			area[i] = list.get(i).getArea();
		}
		
		boolean stop = false;
		int swapCount = 0;
		int comparisonCount = 0;
		
		while(stop == false){			
			for(int i = 9; i >= 1; i--){			
				if(area[i - 1] < area[i]){
					comparisonCount++;
					double temp = area[i];
					area[i] = area[i - 1];
					area[i - 1] = temp;
					swapCount++;
				}
				else{
					comparisonCount++;
				}
			}

			stop = checkDescending(area);
		}
		
		System.out.println("\tSecond Sorting Algorithm: ");
		System.out.println("\t\t# of Swaps: " + swapCount);
		System.out.println("\t\t# of Comparisons: " + comparisonCount);
		if(list.size() > 10 == false){
			System.out.println("\t\tArea = " + area[0]);
			System.out.println("\t\tArea = " + area[1]);
			System.out.println("\t\tArea = " + area[2]);
			System.out.println("\t\tArea = " + area[3]);
			System.out.println("\t\tArea = " + area[4]);
			System.out.println("\t\tArea = " + area[5]);
			System.out.println("\t\tArea = " + area[6]);
			System.out.println("\t\tArea = " + area[7]);
			System.out.println("\t\tArea = " + area[8]);
			System.out.println("\t\tArea = " + area[9]);
		}

	}
	
	public static boolean checkDescending(double[] area){
		for (int i = 0; i < area.length-1; i++) {
		    if (area[i] < area[i+1]) {
		        return false;
		    }
		}
		
		return true;
	}
	
}


