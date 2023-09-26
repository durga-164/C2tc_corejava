package com.java.kavin;
import java.util.*;

public class MultilevelFeedbackQueues {
    List<Process> processes = new ArrayList<>();
    processes.add(new Process(1, 10, 1));
    processes.add(new Process(2, 5, 2));
    processes.add(new Process(3, 8, 3));
    processes.add(new Process(4, 3, 1));
    processes.add(new Process(5, 6, 2));

    // Implement the multilevel feedback queues algorithm
    // TODO: Add your code here

    // Print the scheduling order
    System.out.println("Scheduling Order:");
    for (Process process : processes) {
        System.out.println("Process " + process.pid);
    }
}


