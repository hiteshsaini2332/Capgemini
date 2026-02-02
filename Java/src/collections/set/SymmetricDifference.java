package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static HashSet<Integer>difference(Set<Integer>s1,Set<Integer>s2)
    {
        HashSet<Integer>ans=new HashSet<>();
        for(int n:s1)
        {
            if(!s2.contains(n))
            {
                ans.add(n);
            }
        }
        for(int n:s2)
        {
            if(!s1.contains(n))
            {
                ans.add(n);
            }
        }
        return ans;
    }

    static void main() {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        s2.add(5);

        HashSet<Integer>ans=difference(s1,s2);
        System.out.println("Symmetric difference of set is");
        for(int n:ans)
        {
            System.out.print(n+" ");
        }

    }
}
