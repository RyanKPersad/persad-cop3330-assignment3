/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Persad
 */
package Assignment3.Ex43;
import java.io.File;
import java.util.Scanner;
public class Base {
    public static void main(String[] args) {

        //Input
        Scanner newScan = new Scanner(System.in);

        String siteName;
        String author;
        String wantCSS;
        String wantJS;

        System.out.print("Site name: ");
        siteName = newScan.nextLine();
        System.out.print("Author: ");
        author = newScan.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        wantJS = newScan.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        wantCSS = newScan.nextLine();


        //Create a website generator
        Generate newWebsite = new Generate();

        //Set the attributes for the website
        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = "src/main/java/ex43/";

        //Create the website and the HTML file
        System.out.println("Created " + newWebsite.createWebsite());
        System.out.println("Created " + newWebsite.createHTMl());



        //If user wants to create a JS and CSS folder
        if(wantJS.equals("y"))
            System.out.println("Created " + newWebsite.createJSFolder());

        if(wantCSS.equals("y"))
            System.out.println("Created " + newWebsite.createCSSFolder());

    }

}



