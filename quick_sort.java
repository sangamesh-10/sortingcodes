import java.util.*;

public class quick_sort{
	public static void Qsort(int arr[], int lb,int ub) {
		if(lb<ub){
			int pos = partition(arr,lb,ub);
			Qsort(arr, lb, pos-1);
			Qsort(arr, pos+1, ub);
		}
	}
	public static int partition(int arr[],int lb, int ub) {
		int i=lb;
		int j=ub;
		int pivot=arr[lb];
		while(i<j){
			while(arr[i]<=pivot && i<j){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		arr[lb]=arr[j];
		arr[j]=pivot;
		return j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Qsort(arr, 0, n-1);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}