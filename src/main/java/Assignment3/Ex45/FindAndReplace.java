package Assignment3.Ex45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAndReplace {
    public String Replace(){
        String FileName;
        Scanner myObj = new Scanner(System.in);
        try {
            //Finds file
            Path path = Paths.get("exercise45_input.txt");
            //Turns content into array
            Stream<String> lines = Files.lines(path);
            System.out.print( "Enter the First word to replace " );
            String Word1 = myObj.nextLine();
            System.out.print( "Enter the Second word to replace " );
            String word2 = myObj.nextLine();
            //Maps out and finds word by using map search and collect
            List<String> replaced = lines.map(line -> line.replaceAll(Word1, word2)).collect(Collectors.toList());
            System.out.print( "Enter the Output File Name " );
            FileName = myObj.nextLine();
            //Writes new content to output file
            Files.write(Path.of(FileName), replaced);

            lines.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "replacement done";
    }

}
