package guiDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDumper {
    
    public void readFileToSystemOut(File f){	
        Scanner reader;
		try {
			System.out.println(f.getName());
			reader = new Scanner(f);
	        //... Loop as long as there are input lines.
	        String line = null;
	        while (reader.hasNextLine()) {
	            line = reader.nextLine();
	            System.out.println(line);
	        }

	        //... Close reader
	        reader.close();  
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}

