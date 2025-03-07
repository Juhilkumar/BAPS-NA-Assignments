package org.learning.assignment.assignment4;

import java.util.List;
import java.util.stream.Stream;

//1. Write a program to get cube for numbers 1-10 and filter anything that is divisible by 5
public class CubeDivisibleByFive {
    public static void main(String[] args) {
        List<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(n -> n * n * n) // map the number to it's cube
                .filter(cube -> cube % 5 == 0) // filter the cube list and keep only the once that are divisible by 5
                .toList();

        System.out.println(nums);
    }
}
