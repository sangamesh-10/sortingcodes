public class heapSort {
	public static void swap(int arr[],int x,int y) {
		int t = arr[x];
		arr[x]=arr[y];
		arr[y]=t;
	}
	public static void heapify(int arr[],int r,int n) {
		int child = 2*r+1;
		boolean found = false;
		while(!found && child<n){
			if(child < n-1){
				if(arr[child]<arr[child+1]){
					child = child +1;
				}
			}
			if(arr[r]<arr[child]){
				swap(arr,r,child);
				r = child;
				child = 2*r+1;
			}
			else{
				found = true;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,9,6,1,5,2,8,4,7};
		int n = arr.length;
		for(int i = (n/2)-1;i>=0;i--){
			heapify(arr, i, n);
		}
		for(int i = n-1;i>=1;i--){
			swap(arr,0,i);
			heapify(arr, 0, i);
		}
		for(int elem:arr){
			System.out.print(elem+" ");
		}
	}
}
