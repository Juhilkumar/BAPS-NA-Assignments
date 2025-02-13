package org.learning.assignment.assignment2;

import java.util.*;

// 1.  Program to merge 2 sorted lists into 1 sorted list.
public class MergeSortedList {
    static List<Integer> mergeTwoSortedListsV1(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();

//      Create a minHeap using PriorityQueue to get the elements in a sorted manner after merging two or more lists
        Queue<Integer> minHeap = new PriorityQueue<>();

//      Add both lists in the minHeap
        minHeap.addAll(list1);
        minHeap.addAll(list2);

//      Remove elements one by one and store them in the result list
        while(!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }

    static List<Integer> mergeTwoSortedListsV2(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

//      Merge elements from two lists until one of the list gets to the last element
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

//      If list1 has any more elements, add the remaining elements in the result
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

//      If list2 has any more elements, add the remaining elements in the result
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4, 7, 10, 15);
        List<Integer> list2 = Arrays.asList(5, 8, 9, 18);

        System.out.println(mergeTwoSortedListsV1(list1, list2));
        System.out.println(mergeTwoSortedListsV2(list1, list2));
    }
}
