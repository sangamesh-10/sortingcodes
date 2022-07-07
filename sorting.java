import java.util.*;
public class Sorting{
    public static void bSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
    }
    public static void iSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int [] arr;
        System.out.print("Enter the no of elements : ");
        int n=sr.nextInt();
      
        arr = new int[n];
        
        System.out.print("\nenter the array elements to sort---->");
        for(int i=0;i<n;i++){
           arr[i]= sr.nextInt();
        }
     System.out.print("\n Select a sorting algorithm :");
     System.out.print("\n 1.Bubble Sort   ");
     System.out.println("\n 2.Insertion Sort   ");
     int ch=sr.nextInt();
     switch(ch){
         case 1:
             bSort(arr);
             break;
        case 2:
            iSort(arr);
            break;
        default:
        System.out.print("select the correct option...");
     }
    
       System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            sr.close();
        }
    }
}
