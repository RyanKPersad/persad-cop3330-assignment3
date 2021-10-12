/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment3.Ex41;
import java.io.*;
import java.io.FileWriter;
import java.util.*;


public class NameSort {
    // Initializes class output
    static Output out = new Output();
    // Call main
    public static void main(String[] args) throws IOException
    {
        System.out.println(Sorting());
    }

    public static FileWriter Sorting() throws IOException{
          //passes in input file
        BufferedReader reader = new BufferedReader(new FileReader("exercise41_input.txt"));
        //converts to array
        ArrayList<String> str = new ArrayList<>();
        String line = "";
        while((line=reader.readLine())!=null){
            str.add(line);
        }
        reader.close();
        // Sorts contents of file
        Collections.sort(str);
        // creates output file
        FileWriter writer = new FileWriter("exercise41_output.txt");
        //calls CountNames which will count the number of names in file
        int num = out.CountNames();
        String op = String.format("There are %s names",num);
        writer.write(op+"\n");
        writer.write("-------------\n");
        for(String s: str){
            writer.write(s);
            writer.write("\r\n");
        }
        writer.close();

        return null;
    }

}

