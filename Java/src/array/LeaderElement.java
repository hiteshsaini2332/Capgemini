package array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderElement {
    static void main() {
        int[]arr={16,17,4,3,5,2};

        ArrayList<Integer> list=new ArrayList<>();
        int maxELe=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>maxELe){
                list.add(arr[i]);
                maxELe=arr[i];
            }
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
