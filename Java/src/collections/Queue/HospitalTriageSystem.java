package collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class  Pair{
    String string;
    int val;
    Pair(String string,int val)
    {
        this.string=string;
        this.val=val;
    }
}
public class HospitalTriageSystem {
    public static void sortByPriority(Queue<Pair> q)
    {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.val-a.val);
        pq.addAll(q);
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            System.out.print(p.string+" ");
        }
    }

    static void main() {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair("John",4));
        q.add(new Pair("Alice",7));
        q.add(new Pair("Sam",9));
        sortByPriority(q);
    }
}
