import java.util.Scanner;

public class ins_sort{
	private static void i_Sort (int arr[],int n) {
		for(int itr = 1;itr<n;itr++){
			int cur =arr[itr];
			int itr2= itr-1;
			while(itr2>=0 && cur<arr[itr2]){
				arr[itr2+1]=arr[itr2];
				itr2--;
			}
			arr[itr2+1]=cur;
		}
	}
    public static void main(String[] args) {
		System.out.print("enter the size of array --->");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements of array ||||");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		i_Sort(arr, size);
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}