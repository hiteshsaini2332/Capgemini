package collections.set;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static Set<Integer>union(Set<Integer>s1,Set<Integer>s2)
    {
        Set<Integer>ans=new HashSet<>();
        ans.addAll(s1);
        ans.addAll(s2);
        return ans;
    }
    public static Set<Integer>intersection(Set<Integer>s1,Set<Integer>s2)
    {
        Set<Integer>ans=new HashSet<>();
        for(int n:s1)
        {
            if(s2.contains(n))ans.add(n);
        }
        return ans;
    }

    static void main() {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s2.add(5);
        s2.add(6);
        s2.add(7);
        s2.add(4);
        Set<Integer>ans=new HashSet<>();
        ans=union(s1,s2);
        System.out.println("Union of Sets: ");
        for(int n:ans)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        ans=intersection(s1,s2);
        System.out.println("Intersection of Sets");
        for(int n:ans)
        {
            System.out.print(n+" ");
        }
    }
}
