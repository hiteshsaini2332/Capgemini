package CapgeminiQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        countFreq(string);
    }
    static void countFreq(String string)
    {
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char ch:string.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry: freq.entrySet())
        {
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }

    }
}
