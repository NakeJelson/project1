package com.company;

import java.util.*;
import java.util.ArrayList;
public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<String>();
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("Please select an option: " +
                "\n(1) Add a task" +
                "\n(2) Remove a task" +
                "\n(3) Update a task" +
                "\n(4) List all tasks" +
                "\n(0) Exit");

        int selection = input.nextInt();

        switch (selection) {
            case 1:
                addTask(tasks);
                break;
            case 2:
                removeTask(tasks);
                break;
            case 3:
                updateTask(tasks);
                break;
            case 4:
                System.out.println(tasks);
                menu();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
    static ArrayList<String> addTask(ArrayList tasks){
        System.out.println("Please enter the task you would like to add: ");
        String task = input.next();
        tasks.add(task);
        menu();
        return tasks;
    }
    static ArrayList<String> removeTask(ArrayList tasks){
        System.out.println(tasks);
        System.out.println("Please enter the number of the task you would like to remove: ");
        int delete = input.nextInt();
        System.out.println("I have removed " + tasks.get(delete-1));
        tasks.remove(delete-1);
        menu();
        return tasks;
    }
    static ArrayList<String> updateTask(ArrayList tasks){
        System.out.println(tasks);
        System.out.println("Please enter the number of the task you would like to update: ");
        int pick = input.nextInt();
        input.nextLine();
        System.out.println("What would you like to change the task to?: ");
        String newTask = input.nextLine();
        tasks.set(pick-1, newTask);
        System.out.println(tasks);
        menu();
        return tasks;
    }
}
//Jake Nelson 2-2-22 project1
