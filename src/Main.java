import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        String response;
        Scanner scanner= new Scanner(System.in);
        toDoList tdl = new toDoList();

        do {
            int userInput = ui.display();

            switch (userInput) {
                case 1:
                    System.out.println("Option 1 selected");
                    System.out.print("Enter a Task Name : ");
                    String taskName = scanner.nextLine();
//                    System.out.println("\n");2
                    System.out.print("Enter task urgency : ");
                    String urgency = scanner.nextLine();

                    Tasks task = new Tasks(taskName,urgency);
                    tdl.addTask(task);

                    // Print out the TodoItems
                    for (Tasks item : tdl.getTasks()) {
                        ui.heading();
                        System.out.println(item.getTaskName()+"\t"+item.getUrgency());

                    }

                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    System.out.print("Enter the Task Name to delete: ");
                    String taskNameToDelete = scanner.nextLine();
                    Tasks taskToDelete = new Tasks(taskNameToDelete, "not urgent");
                    tdl.removeTask(taskToDelete);

                    break;
                case 3:
                    System.out.println("Option 3 selected");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("Y"));

        System.out.println("Exiting the program.");

        }


}

