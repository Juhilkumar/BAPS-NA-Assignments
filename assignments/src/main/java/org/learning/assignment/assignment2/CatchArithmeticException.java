package org.learning.assignment.assignment2;

// 2. A program to catch arithmetic exception while dividing 2 numbers and divisor is 0
public class CatchArithmeticException {

//  Method to perform division operation which can throw ArithmeticException if divisor is 0
    static int divisionOperation(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }

    public static void main(String[] args) {
//      Use try and catch mechanism to handle exception that was thrown by the divisionOperation method
        try {
            System.out.println("Division operation result : " + divisionOperation(9, 2));
            System.out.println("Division operation result : " + divisionOperation(5, 0));
        } catch (ArithmeticException e) {
//            ArithmeticException is handled by printing meaningful message
            System.out.println("Error : " + e.getMessage() + " - The number cannot be divided by zero");
        }
    }
}
