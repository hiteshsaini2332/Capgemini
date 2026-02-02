package collections.list;

import java.util.ArrayList;

public class RotateList {
    public static void rotateList(ArrayList<Integer>arr,int k)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.size();
        k=k%n;

        for(int i=k;i<n;i++)
        {
            ans.add(arr.get(i));
        }
        for(int i=0;i<k;i++)
        {
            ans.add(arr.get(i));
        }

        for (int i = 0; i < n; i++) {
            arr.set(i,ans.get(i));
        }
    }

    static void main() {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        rotateList(arr,2);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
