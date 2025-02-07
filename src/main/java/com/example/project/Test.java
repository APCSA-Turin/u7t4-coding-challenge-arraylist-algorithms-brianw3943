package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String args[]) {
        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        ArrayList<Integer> modes = Main.modes(intList18);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,5));
        System.out.println(modes);

        int[] intList19 = {1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7};
        ArrayList<Integer> modes2 = Main.modes(intList19);
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(6));
        System.out.println(modes2);

        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        ArrayList<Integer> modes3 = Main.modes(intList20);
        ArrayList<Integer> expected3 = new ArrayList<>(Arrays.asList(1));
        System.out.println(modes3);

        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        ArrayList<Integer> modes4 = Main.modes(intList21);
        ArrayList<Integer> expected4 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(modes4);

        // all numbers appear 1 time
        int[] intList22 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes5 = Main.modes(intList22);
        ArrayList<Integer> expected5 = new ArrayList<>();
        System.out.println(modes5);

        // all numbers appear 3 times
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes6 = Main.modes(intList23);
        ArrayList<Integer> expected6 = new ArrayList<>();
        System.out.println(modes6);

        // this one has an extra 7, so 1, 2, 3, 4, 5, and 6 are all modes!
        int[] intList24 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes7 = Main.modes(intList24);
        ArrayList<Integer> expected7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(modes7);
    }
}
