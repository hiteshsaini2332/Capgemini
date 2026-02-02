package collections.list;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void removeDuplicates(ArrayList<Integer>arr)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int n:arr)
        {
            if(!set.contains(n))
            {
                ans.add(n);
            }
            set.add(n);
        }
        arr.clear();
        arr.addAll(ans);
    }

    static void main() {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        removeDuplicates(arr);
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
