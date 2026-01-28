package linkedlist.taskscheduler;

public class TaskList {
    private Task head=null;
    private Task tail=null;
    private Task current=null;
    public void insertAtBeginning(int taskId,String taskName,int priority,String dueDate)
    {
        Task newTask=new Task(taskId, taskName, priority, dueDate);

        if(head==null)
        {
            head=tail=newTask;
            newTask.next=head;
            current=head;
            return;
        }
        newTask.next=head;
        head=newTask;
        tail.next=newTask;
    }
    public void insertAtEnd(int taskId,String taskName,int priority,String dueDate)
    {
        Task newTask=new Task(taskId, taskName,priority,dueDate);
        if(head==null)
        {
            head=tail=newTask;
            newTask.next=head;
            current=head;
            return;
        }
        tail.next=newTask;
        newTask.next=head;
        tail=newTask;
    }
    public void insertAtPosition(int taskId,String taskName,int priority,String dueDate,int pos)
    {
        if(pos==1)
        {
            insertAtBeginning( taskId, taskName, priority, dueDate);
            return;
        }
        Task temp=head;
        for(int i=1;i<pos-1&&temp.next!=head;i++)
        {
            temp=temp.next;
        }
        Task newTask=new Task( taskId, taskName, priority, dueDate);
        newTask.next=temp.next;
        temp.next=newTask;

        if(temp==tail)
        {
            tail=newTask;
        }
    }
    public void removeTask(int taskId)
    {
        Task temp=head;
        if(head.getTaskId()==taskId)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        while (temp!=head)
        {
            if(temp.next.getTaskId()==taskId)
            {
                temp.next=temp.next.next;
                System.out.println("Task Removed");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Task Not Found");
    }
    public void displayTask()
    {
        Task temp=head;
        while(temp!=head)
        {
            System.out.println("Task Id: "+temp.getTaskId()+" ,Task Name: "+temp.getTaskName()+", Task Priority: "+temp.getPriority()+", Task DueDate: "+temp.getDueDate());
            temp=temp.next;
        }
    }
    public void searchTask(int priority)
    {
        Task temp=head;
        while (temp!=head)
        {
            if(temp.getPriority()==priority)
            {
                System.out.println("Task Id: "+temp.getTaskId()+" ,Task Name: "+temp.getTaskName()+", Task Priority: "+temp.getPriority()+", Task DueDate: "+temp.getDueDate());
                return;
            }
            temp=temp.next;
        }

    }
}
