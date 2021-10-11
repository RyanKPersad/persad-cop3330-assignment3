package Ex44;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class ProductSearch{
    String input;
    int flag = 0;
    String Output;

    public String FindProduct() {

        //Create one json parser object
        JSONParser parser = new JSONParser();
        try {
            //Read json file using parser and store it in obj
            Object obj = parser.parse(new FileReader("exercise44_input.json"));
            //Create json object to read internal values
            JSONObject jsonObject = (JSONObject) obj;
            //Reading products array from  the file
            JSONArray subject = (JSONArray) jsonObject.get("products");
            //Create buffered reader object to take user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //Create string variable

            //Flag is used whether given string is present or not

            System.out.print("What is the product name? ");
            input = bufferedReader.readLine();
            //Create iterator for products array
            Iterator iterator = subject.iterator();
            //Loop through the iterator


            while (iterator.hasNext()) {

                //Create iterator for products array
                //Loop through the iterator
                JSONObject json = (JSONObject) iterator.next();
                //Get the name value

                String name = (String) json.get("name");
                //Compare it with given input

                if (input.equalsIgnoreCase(name)) {
                    Output = String.format("Name: %s\nPrice: %s\nQuantity: %s\s", name, json.get("price"), json.get("quantity"));
                    flag = 1;
                }



            }
            //If flag value is zero, then value is not found
            if(flag == 0){
                return "Sorry, that product was not found in our inventory";
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return Output;

    }

}
