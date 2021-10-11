package Assignment3.Ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTest {
    //Test to make sure createWebsite works.
    @Test
    void createWebsite_works() {

//Use the function and save the return value.
        Generate g = new Generate();

        g.path = "src/main/java/ex43/";
        g.siteName = "testwebsite.com";
        g.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com";
        String actual = g.createWebsite();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createJSFolder works.
    @Test
    void createJSFolder_works() {

//Use the function and save the return value.
        Generate g = new Generate();

        g.path = "src/main/java/ex43/";
        g.siteName = "testwebsite.com";
        g.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/js";
        String actual = g.createJSFolder();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createCSFolder works.
    @Test
    void createCSSFolder_works() {

        //Use the function and save the return value.
        Generate g = new Generate();

        g.path = "src/main/java/ex43/";
        g.siteName = "testwebsite.com";
        g.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/css";
        String actual = g.createCSSFolder();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createHTML works.
    @Test
    void createHTMl_works() {

//Use the function and save the return value.
        Generate g = new Generate();

        g.path = "src/main/java/ex43/";
        g.siteName = "testwebsite.com";
        g.author = "Jose Valencia";

        String expected = "src/main/java/ex43/testwebsite.com/index.html";
        String actual = g.createHTMl();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }
}