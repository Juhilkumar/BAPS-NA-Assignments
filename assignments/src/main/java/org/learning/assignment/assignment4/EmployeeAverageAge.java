package org.learning.assignment.assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// 3. Find an average for numbers stored as values in a map. Eg. Map with EmployeeID and Age etc
public class EmployeeAverageAge {
    public static void main(String[] args) {
        // Create a list of employees with their respective id, name and age
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Juhil", 25),
                new Employee(2, "Parth", 18),
                new Employee(3, "Nisarg", 46),
                new Employee(4, "Tilak", 65),
                new Employee(5, "Yogi", 34)
        );

        OptionalDouble sum = employeeList.stream()
                .mapToInt(emp -> emp.age) // Map the Employee object to employee's age
                .average(); // Calculate the average age of the employee

        System.out.println(sum.orElse(0));
    }
}
