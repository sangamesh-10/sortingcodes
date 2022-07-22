import java.util.Scanner;

public class bub_sort {
	public static void b_sort(int arr[],int n) {
		for(int pass=1;pass<n;pass++){
			for(int i=0;i<n-pass;i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of array--> ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("\nEnter the no of elements of array--> ");
		for(int itr=0;itr<size;itr++){
			arr[itr] = sc.nextInt();
		}
		b_sort(arr, size);
		System.out.print("\n");
		for(int itr=0;itr<size;itr++){
			System.out.print(arr[itr]+" ");
		}
		sc.close();
	}
}
