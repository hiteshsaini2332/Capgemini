package array;

import java.util.ArrayList;

public class OddIndex {
    static void main() {
        int[] arr={10,20,30,40,50,60};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                list.add(arr[i]);
            }
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(!flag)
                {
                    arr[i]=list.getLast();
                    list.removeLast();
                    flag=true;
                }
                else{
                    arr[i]=list.getFirst();
                    list.removeFirst();
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
