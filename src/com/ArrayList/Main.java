package com.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Simple<String> strings = new SimpleArray<>();


        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        List<String> list = new ArrayList<>();




        //strings.delete(1);
        //strings.update(1,"Update");

        //System.out.println(strings.get(1));
        //System.out.println(strings.size());

        for (String s : strings) {
            System.out.println(s);
        }


    }
}
