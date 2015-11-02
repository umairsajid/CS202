import java.io.*;
import java.util.*;

public class CopyTextFile {

    public static void main(String args[]) {
        //... Get two file names from use.
        System.out.println("Enter a filepath to copy from, and one to copy to.");
        Scanner in = new Scanner(System.in);

        //... Create File objects.
        File inFile  = new File(in.next());  // File to read from.
        File outFile = new File(in.next());  // File to write to

        //... Enclose in try..catch because of possible io exceptions.
        try {
            copyFile(inFile, outFile);

        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    public static void copyFile(File fromFile, File toFile) throws IOException {
        Scanner freader = new Scanner(fromFile);
        BufferedWriter writer = new BufferedWriter(new FileWriter(toFile));

        //... Loop as long as there are input lines.
        String line = null;
        while (freader.hasNextLine()) {
            line = freader.nextLine();
            writer.write(line);
            writer.newLine();   
        }

        //... Close reader and writer.
        freader.close();  
        writer.close();  
    }
}
