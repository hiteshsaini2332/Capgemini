package sorting;

public class SortBookPrices {
    public static void mergeSort(int l,int r,int[]arr)
    {
        int mid=l+(r-l)/2;
        if(l<r)
        {
            mergeSort(l,mid,arr);
            mergeSort(mid+1,r,arr);
            merge(l,mid,r,arr);
        }
    }
    public static void merge(int l,int mid,int r,int[]arr)
    {
        int[] a1=new int[mid-l+1];
        int [] a2=new int[r-mid];
        int ind1=mid-l+1;
        int ind2=r-mid;

        for (int i=0;i<ind1;i++)
        {
            a1[i]=arr[l+i];
        }
        for (int i=0;i<ind2;i++)
        {
            a2[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=l;
        while(i<ind1&&j<ind2)
        {
            if(a1[i]<=a2[j])
            {
                arr[k++]=a1[i++];
            }
            else{
                arr[k++]=a2[j++];
            }
        }
        while(i<ind1)
        {
            arr[k++]=a1[i++];
        }
        while(j<ind2)
        {
            arr[k++]=a2[j++];
        }
    }

    static void main() {
        int[]arr={450, 299, 1200, 650, 199, 899};
        mergeSort(0, arr.length -1,arr);
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
