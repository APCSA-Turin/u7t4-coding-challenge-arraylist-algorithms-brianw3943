package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,3,1,4);
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected,1,3,4,1);
        Main.fix34(list);
        System.out.println(list);
        list.clear();expected.clear();

        Collections.addAll(list,1, 3, 1, 4, 4, 3, 1);
        Collections.addAll(expected,1, 3, 4, 1, 1, 3, 4);
        Main.fix34(list);
        System.out.println(list);
        list.clear();expected.clear();

        Collections.addAll(list,3,2,2,4);
        Collections.addAll(expected,3,4,2,2);
        Main.fix34(list);
        System.out.println(list);
    }
}
