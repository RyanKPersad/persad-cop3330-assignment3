package Assignment3.Ex46;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import java.util.Scanner;


public class WordFrequency {
    //counts the frequency of each word in the text file and print histogram
    static void countWordsFrequency(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();

        // Splitting to find the word
        String arr[]=str.split(" ");

        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.print(entry.getKey()+
                    " : ");
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print("*");
            }

            System.out.print("\n\n");
        }
    }

    //read text file into a single string
    public static String readFileIntoString(String path, Charset encoding) throws IOException
    {
        String content;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            content = scanner.useDelimiter("\\A").next();
        }

        return content;
    }
}
