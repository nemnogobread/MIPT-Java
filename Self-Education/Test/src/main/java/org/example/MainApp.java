package org.example;

import org.apache.camel.main.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        int[] array = {1, 2, 3, 4};
        array[0] = 5;
        System.out.println(Arrays.toString(array));
    }

}

