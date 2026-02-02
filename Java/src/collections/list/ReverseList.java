package collections.list;

import java.util.ArrayList;

public class ReverseList {
    public static void reverse(ArrayList<Integer>arr)
    {
        int s=0;
        int e=arr.size()-1;
        while(s<e)
        {
            int temp=arr.get(s);
            arr.set(s,arr.get(e));
            arr.set(e,temp);
            s++;
            e--;
        }
    }

    static void main() {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverse(arr);
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
