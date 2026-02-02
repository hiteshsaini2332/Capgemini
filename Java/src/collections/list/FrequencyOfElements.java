package collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void findFrequency(ArrayList<String>arr)
    {
        Map<String,Integer>freq=new HashMap<>();
        for(String s:arr)
        {
            freq.put(s,freq.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer>entry: freq.entrySet())
        {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }

    static void main() {
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");
        arr.add("Apple");
        findFrequency(arr);
    }
}
