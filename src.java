import java.util.*;
class Task{
    private int id;
    private String desp;
    private String isDone;
    
    Task(int id,String desp,String isDone){
        this.id=id;
        this.desp=desp;
        this.isDone=isDone;
    }
    
    public void setid(int id){
        this.id=id;
    }
    
    public void setdesp(String desp){
        this.desp=desp;
    }
    
    public void setisDone(String isDone){
        this.isDone=isDone;
    }
    
    public int getid(){
        return id;
    }
    public String getdesp(){
        return desp;
    }
    public String getisDone(){
        return isDone;
    }
    public String toString(){
        return "---------------------------------------------------------"+
               "| ID: |"+id+"| Description: |"+desp+"| Status: |"+isDone+
               "---------------------------------------------------------";
    }
    
}
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        ArrayList<Task> task =new ArrayList<>();
        
        int choice;
        
        do{
            System.out.println("-------------------");
            System.out.println("-Todo Application-");
            System.out.println("-------------------");
            System.out.println("1.Add task");
            System.out.println("2.View task");
            System.out.println("3.Mark task as done");
            System.out.println("4.Delete task");
            System.out.println("5.Exit");
            System.out.println("-------------------");
            
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter task id");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter task Description");
                    String desp=sc.nextLine();
                    task.add(new Task(id,desp,"Pending"));
                    System.out.println("New task Added!");
                    
                    break;
                case 2:
                    if(task.isEmpty()){
                        System.out.println("No tasks Available");
                    }else{
                    System.out.println("All Available tasks");
                    for(Task t:task){
                        System.out.println(t.toString());
                    }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter id to mark task");
                    id=sc.nextInt();
                    for(Task t:task){
                        if(t.getid()==id){
                            t.setisDone("Done");
                        }
                    }
                    break;
                    
                
                case 4:
                    System.out.println("Deleting task");
                    System.out.println("Enter id to delete:");
                    id=sc.nextInt();
                    Iterator<Task> iterator=task.iterator();
                    while(iterator.hasNext()){
                        Task t=iterator.next();
                        if(t.getid()==id){
                            iterator.remove();
                        System.out.println("Task Deleted");
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting Application");
                    return;
                    
                default:
                    System.out.println("Invalid! Enter valid choice");
            }
            
        }while(choice!=5);
        
    }
}
