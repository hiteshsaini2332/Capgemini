    package collections.Queue;

    import java.util.LinkedList;
    import java.util.Queue;

    public class ReverseQueue {
        public static void reverseQueue(Queue<Integer>q)
        {
            if (q.isEmpty()) return;

            int temp = q.poll();
            reverseQueue(q);
            q.add(temp);
        }

        static void main() {
            Queue<Integer>q=new LinkedList<>();
            q.add(10);
            q.add(20);
            q.add(30);
            reverseQueue(q);

            System.out.println("After Reversing Queue");
            while (!q.isEmpty() )
            {
                System.out.print(q.poll()+" ");
            }
        }
    }
