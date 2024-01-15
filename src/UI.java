

import java.util.Scanner;


public class UI {
    Scanner sc = new Scanner(System.in);
    int input;

    public int display(){
        System.out.println("\nWelcome to ToDoList: ");
        System.out.println("\nThese are the Instructions: \n");
        System.out.println(" 1) Create a Task");
        System.out.println(" 2) Delete a Task ");
        System.out.println(" 3) Update a Task ");
        System.out.print("\nPlease choose an option you want to perform : ");

         input = sc.nextInt();

        return input;
    }

    public void heading(){
        System.out.println("Task Name\t"+"Urgency");
    }

}
