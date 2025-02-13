package org.learning.assignment.assignment2;

// Define custom exception to handle invalid username length
public class InvalidUsernameLengthException extends Exception{
//    Define the constructor which will show the appropriate exception message
    public InvalidUsernameLengthException(String str) {
        super(str);
    }
}
