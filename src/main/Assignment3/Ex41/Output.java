package Ex41;
import java.io.*;
import java.util.*;

public class Output {
    public static int CountNames(){
        int count = 0;

        try {
            // create a new file object
            File file = new File("exercise41_input.txt");

            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner(file);

            // read each line and
            // count number of lines
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }


            // close scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }


        return count;
    }
}


