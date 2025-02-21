package org.learning.assignment.assignment3;

import java.util.concurrent.Callable;

// Assignments are defined with their names and steps to complete and a success message will be returned with the help of Callable
public class AssignmentTask implements Callable<String> {
    private final String taskName;

    public AssignmentTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        int totalStepsToCompleteAssignment = 4;

        System.out.println("Start " + taskName);

        for (int i = 1; i <= totalStepsToCompleteAssignment; i++) {
            // Mimics the time to finish the part of assignment
            Thread.sleep((long) (Math.random() * 300));

            // Prints the step which is executing for the current assignment
            System.out.println("Step " + i + " for " + taskName + " completed");
        }

        // Returns a success message after the task is completed
        return taskName + " Completed Successfully";
    }
}
