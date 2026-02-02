package collections.set;

import java.util.*;

public class SetToSortedList {
    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(9);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println(convertToSortedList(set));
    }
}
