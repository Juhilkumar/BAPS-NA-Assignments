package org.learning.assignment.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubSetArrayList {
    // 2. Check weather an array list is subset of another array list
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,  4, 5, 6);

        System.out.println(new HashSet<>(list1).containsAll(list2));
    }
}
