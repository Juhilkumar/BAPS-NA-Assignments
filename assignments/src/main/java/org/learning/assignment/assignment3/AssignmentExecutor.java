package org.learning.assignment.assignment3;

import java.util.List;
import java.util.concurrent.*;

// 2. Deep dive into various implementations of Executor Service.
public class AssignmentExecutor {

    // Method to execute only one task with the help of ExecutorService
    private static void executeSingleTask() throws ExecutionException, InterruptedException {
        // Define ExecutorService with only one thread
        ExecutorService assignmentExecutorService = Executors.newSingleThreadExecutor();

        // Expected output which will be returned after execution of the assignment task which will be printed afterward
        Future<String>  futureSuccessString = assignmentExecutorService.submit(new AssignmentTask("Java OOP Assignment - 1"));
        System.out.println(futureSuccessString.get());

       // Shutdown ExecutorService instance after the task is completed
        assignmentExecutorService.shutdown();
    }

    private static void executeMultipleTasks() throws ExecutionException, InterruptedException {
        // Define ExecutorService with 4 threads
        ExecutorService assignmentExecutorService = Executors.newFixedThreadPool(4);

        // List of each output which will be returned after execution of all assignment tasks
        List<Future<String>> futureSuccessStrings = assignmentExecutorService.invokeAll(getAllAssignments());

        // Print each success message after completion of all tasks
        for (Future<String> result : futureSuccessStrings) {
            System.out.println(result.get());
        }

        // Shutdown ExecutorService instance after the task is completed
        assignmentExecutorService.shutdown();
    }

    private static void executeAnyTask() throws InterruptedException, ExecutionException {
        // Define ExecutorService with 7 threads
        ExecutorService assignmentExecutorService = Executors.newFixedThreadPool(7);

        // Only one task will be executed successfully by the ExecutorService and the success message will be printed
        String result = assignmentExecutorService.invokeAny(getAllAssignments());
        System.out.println(result);

        // Shutdown ExecutorService instance after the task is completed
        assignmentExecutorService.shutdown();
    }

    private static List<AssignmentTask> getAllAssignments() {
        return List.of(
                new AssignmentTask("Java OOP Assignment - 1"),
                new AssignmentTask("Serverless Computing Assignment - 4"),
                new AssignmentTask("Cloud Computing Assignment - 6"),
                new AssignmentTask("Web Development - 2"),
                new AssignmentTask("Advanced Software Development Concepts - 3")
        );
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        executeSingleTask();

        System.out.println("-".repeat(50));

        executeMultipleTasks();

        System.out.println("-".repeat(50));

        executeAnyTask();
    }
}
