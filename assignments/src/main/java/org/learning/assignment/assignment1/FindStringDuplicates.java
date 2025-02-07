package org.learning.assignment.assignment1;

import java.util.HashSet;
import java.util.Set;

public class FindStringDuplicates {
    // check if string array has duplicates using hashsets
    boolean isDuplicateNameFound(String[] names) {
        Set<String> nameSet = new HashSet<>();
        for (String name : names) {
            if (nameSet.contains(name)) {
                return true;
            } else {
                nameSet.add(name);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Juhil", "Mayank", "Parth", "Lakshya", "Parth", "Fenil"};
        String[] names2 = new String[]{"Juhil", "Mayank", "Parth", "Lakshya"};
        FindStringDuplicates find = new FindStringDuplicates();
        System.out.println(find.isDuplicateNameFound(names1));
        System.out.println(find.isDuplicateNameFound(names2));
    }
}
