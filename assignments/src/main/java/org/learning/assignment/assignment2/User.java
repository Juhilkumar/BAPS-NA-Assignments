package org.learning.assignment.assignment2;

// 3. A program that will handle a custom exception
// User class to create a user based on the username and password
public class User {
    static int MIN_USERNAME_LENGTH = 15;

//  Method to check the username length and throw the invalid username exception if length is smaller than required
    static void createUser(String username, String password) throws InvalidUsernameLengthException {
        if (username.length() < MIN_USERNAME_LENGTH) {
            String errorMessage = String.format("Username length is too small - It must be %d characters long", MIN_USERNAME_LENGTH);

//          Throws the custom exception as the MIN_USERNAME_LENGTH requirement is not satisfied
            throw new InvalidUsernameLengthException(errorMessage);
        } else {
//          Prints the success message
            System.out.println("User is created successfully");
        }
    }

    public static void main(String[] args) {
        try {
            createUser("Juhil Zalavadiya", "Juhil1234");
            createUser("Juhil", "Juhil123");
        } catch (InvalidUsernameLengthException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
