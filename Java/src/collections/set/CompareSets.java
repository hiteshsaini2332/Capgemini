package collections.set;

import java.util.HashSet;
import java.util.Set;

public class CompareSets {
    public static boolean compare(Set<Integer> s1, Set<Integer>s2)
    {
        return s1.equals(s2);
    }
    static void main() {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(2);
        s2.add(1);
        if(compare(s1,s2))
        {
            System.out.println("Sets are equal");
        }
        else{
            System.out.println("Sets are not equal");
        }
    }
}
