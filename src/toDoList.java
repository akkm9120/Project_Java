import java.util.ArrayList;

public class toDoList {
    private static  ArrayList<Tasks> tasks ;



    public toDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Tasks task){
        tasks.add(task);
    }

    public void removeTask(Tasks task){
        tasks.remove(task);
    }

    public ArrayList<Tasks> getTasks(){
        return tasks;
    }
}
