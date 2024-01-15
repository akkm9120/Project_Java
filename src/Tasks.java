public class Tasks {
    private String taskName;
    private String  urgency;

    public Tasks(String taskName,String urgency){
        this.taskName=taskName;
        this.urgency= urgency;
    }


    public String getUrgency()
    {
        return urgency;
    }
    public String getTaskName(){
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

}
