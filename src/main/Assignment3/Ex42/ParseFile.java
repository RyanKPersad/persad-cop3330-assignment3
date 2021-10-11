package Ex42;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;

public class ParseFile {
    public void Details(String FileName){
        // create a reader
        try (BufferedReader br = Files.newBufferedReader(Paths.get(FileName))) {

            // CSV file delimiter
            String DELIMITER = ",";
            // read the file line by line
            String line;

            while ((line = br.readLine()) != null) {
                // convert line into columns
                String[] columns = line.split(DELIMITER);

                // print all columns
                System.out.printf("%-17s%-17s%-17s\n", columns[0], columns[1], columns[2]);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ParseFile pf = new ParseFile();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("------------------------------------------");
        pf.Details("exercise42_input.txt");
    }

}

