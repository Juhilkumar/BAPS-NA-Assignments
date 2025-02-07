package org.learning.assignment.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToArray {
    // Copy string array to list and back to array
    public static void main(String[] args) {
        String[] names = new String[]{"Juhil", "Mayank", "Parth", "Lakshya", "Parth", "Fenil"};

        List<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println("The list representation of array of String for names : " + nameList);

        String[] namesConvertedBackToArray = nameList.toArray(new String[]{});
        System.out.println("The array representation of list of String for names : " + Arrays.toString(namesConvertedBackToArray));
    }
}
