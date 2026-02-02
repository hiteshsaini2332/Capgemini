package collections.set;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static boolean checkSubsets(Set<Integer>s1,Set<Integer>s2)
    {
        Set<Integer>ans=new HashSet<>();
        return s2.containsAll(s1);
    }
    static void main() {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(1);
        s2.add(2);
        s2.add(6);
        s2.add(3);
        s2.add(4);
        s2.add(5);
        if(checkSubsets(s1,s2))
        {
            System.out.println("Set1 is subset of Set2");
        }
        else{
            System.out.println("Set1 is not subset of Set2");
        }

    }
}
