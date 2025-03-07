package org.learning.assignment.assignment4;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 2. For a given String count the times each letter is repeated. For eg. given "Jay Swaminarayan"
// count for J is 1, Count for a is 4, count for y is 2, etc...
public class CountCharFrequency {
    public static void main(String[] args) {
        String greetings = "Jay Swaminarayan";

        Map<Character, Long> charMap = greetings
                .toLowerCase().chars() // convert the string to lowercase letters to avoid any duplication of characters
                .filter(Character::isLetter) //filter out all the letters
                .mapToObj(c -> (char) c) // convert each character code to character obj
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // group the characters by their counts

        System.out.println(charMap);
    }
}
