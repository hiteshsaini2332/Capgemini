package collections.list;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class NthEleFromEnd {
    public static int findElement(Node head,int pos)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        temp=head;
        while(temp!=null&&pos>0)
        {
            temp=temp.next;
            pos--;
        }
        return temp.data;

    }

    static void main() {
        Node head =new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        int ans=findElement(head,3);
        System.out.println(ans);

    }
}
