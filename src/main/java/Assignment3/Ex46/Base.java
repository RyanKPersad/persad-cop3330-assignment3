package Assignment3.Ex46;
import java.io.IOException;

import java.nio.charset.StandardCharsets;


public class Base {

    public static void main(String[] args) {
        String File = "exercise46_input.txt";
        String InFile = null;
        try {
            InFile = WordFrequency.readFileIntoString(File, StandardCharsets.UTF_8);
            int n = 0;
            InFile = InFile.replaceAll("(\\r|\\n|\\t)", " ");
            InFile= InFile.replaceAll("\\s+"," ").trim();
            int b=0;
        } catch (IOException e) {
            e.printStackTrace();
        }
          WordFrequency.countWordsFrequency(InFile);

    }

}

