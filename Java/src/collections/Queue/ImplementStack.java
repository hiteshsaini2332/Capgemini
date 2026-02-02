package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStack {
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();

    public void push(int x)
    {
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
    }
    public int pop()
    {
        if(q1.isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.poll();
    }
    public int top()
    {
        if(q1.isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.peek();
    }
    public boolean isEmpty()
    {
        return q1.isEmpty();
    }

    static void main() {
        ImplementStack stack=new ImplementStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }

}
