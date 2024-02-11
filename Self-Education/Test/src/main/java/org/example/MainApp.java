package org.example;

import org.apache.camel.main.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
public class MainApp {

    public static void main(String... args) throws Exception {
        int[] nums = {0, 1, 2, 3};
        int middle = nums.length / 2;
        int[] copy = new int[middle];
        System.arraycopy(nums, 0, copy, 0, middle);
        System.out.println(Arrays.toString(copy));
    }
}

