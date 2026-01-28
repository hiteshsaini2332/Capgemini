package linkedlist.studentrecord;

public class StudentList {
    private Student head;

    public void insertAtBeginning(int rollNumber,String name,int age,char grade)
    {
        Student newNode=new Student(rollNumber,name,age,grade);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int rollNumber,String name,int age,char grade)
    {
        Student newNode=new  Student(rollNumber,name,age,grade);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        Student temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int rollNumber,String name,int age,char grade,int position)
    {
        if(position==1)insertAtBeginning( rollNumber, name, age,grade);

        Student temp=head;

        for(int i=1;i<position-1&&temp!=null;i++)
        {
            temp=temp.next;

            if(temp==null){
                System.out.println("Invalid Position");
                return ;
            }
        }
        Student newNode=new Student(rollNumber,name,age,grade);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteByRollNo(int rollNumber)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        if(head.getRollNumber()==rollNumber)
        {
            head=head.next;
            System.out.println("Student Record Deleted");
            return;
        }
        Student temp=head;
        while (temp.next!=null && temp.next.getRollNumber()!=rollNumber)
        {
            temp=temp.next;

            if(temp.next==null) {
                System.out.println("Student Not Found");
                return;
            }
        }
        temp=temp.next.next;
        System.out.println("Student Record Deleted");
    }

    public void search(int rollNumber)
    {
        Student temp=head;
        while(temp!=null)
        {
            if(temp.getRollNumber()==rollNumber)
            {
                System.out.println("Roll: "+temp.getRollNumber()+ ", Name: " + temp.getName() +
                        ", Age: " + temp.getAge() +
                        ", Grade: " + temp.getGrade());
                return;
            }
            temp=temp.next;
        }
    }
    public void updateGrade(int rollNumber,char grade)
    {
        Student temp=head;
        while(temp!=null)
        {
            if(temp.getRollNumber()==rollNumber)
            {
                temp.setGrade(grade);
                System.out.println("Student Grade Updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student Not Found");
    }
    public void displayRecord()
    {
        Student temp=head;
        while(temp!=null)
        {
            System.out.println("Roll: "+temp.getRollNumber()+ ", Name: " + temp.getName() +
                    ", Age: " + temp.getAge() +
                    ", Grade: " + temp.getGrade());
            temp=temp.next;
        }
    }
}
