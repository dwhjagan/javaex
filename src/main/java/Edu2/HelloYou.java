package Edu2;

/**
 * Created by janaidu on 19/12/2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloYou {

    public static void main(String[] args) {
        System.out.print("What's your name? ");

        /*
         * Set up so that we can do line-oriented character reads
         * from the standard input stream.
         */

        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in) );

        try {
            String name = input.readLine();
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}