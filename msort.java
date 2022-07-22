import java.util.*;
public class msort{
    public static void mergesort(int arr[],int lb,int ub){
        if(lb < ub){
            int mid = (lb+ub)/2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid+1, ub);
            merge(arr,lb,mid,ub);

        }
    }
    public static void merge(int arr[],int lb, int mid, int ub) {   
        int n = ub-lb+1;
        int tarr[]= new int[n];
        int i=lb;
        int j =mid+1;
        int k=0;
        while(i<=mid && j<=ub){
            if(arr[i]<arr[j]){
                tarr[k] = arr[i];
                i++;
                k++;
            }
            else{
                tarr[k] = arr[j];
                j++;
                k++;
            }

        }
        while(i<=mid){
            tarr[k] = arr[i];
                i++;
                k++; 
        }
        while(j<=ub){
            tarr[k] = arr[j];
                j++;
                k++;
        }
        for(int p=0,itr = lb;p<n;itr++,p++){
            arr[itr]=tarr[p];
        }
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int size = sc.nextInt();
          int arr[]=new int[size];
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
           }
          mergesort(arr,0,size-1);
           for(int i=0;i<size;i++){
           System.out.print(arr[i]+" ");
           }
           sc.close();
    }

  
}