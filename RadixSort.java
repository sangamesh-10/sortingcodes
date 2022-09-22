import java.lang.Math;
import java.util.Scanner;
public class RadixSort {
	public static int extDigit(int elem,int j) {
		return ((int)(elem/Math.pow(10, j-1)))%10;
	}
	public static int getNoPasses(Node F){
		int max = Integer.MIN_VALUE,count = 0;
		Node itr = F;
		while(itr!=null){
			if(max<itr.data){
				max = itr.data;				
			}
			itr = itr.next;
		}
			int num = max;
			while(num!=0){
				num = num/10;
				count++;
			}
		
		return count;
	}
	public static void display(Node F) {
		Node itr = F;
		while(itr!=null){
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	public static Node rSort(Node F,int m) {
		Node t[] = new Node[10];
		Node b[] = new Node[10];
		for(int j = 1;j<=m;j++){
			for(int i = 0;i<10;i++){
				t[i]=b[i]=null;
			}
			Node itr = F;
			while(itr!=null){
				int elem = itr.data;
				Node n = itr.next;
				itr.next = null;				
				int d = extDigit(elem, j);
				if(t[d]==null){
					t[d]=b[d]=itr;
				}
				else{
					
					t[d].next = itr;
					t[d]= itr;
				}
				itr = n;
			}
			int p = 0;
			while(b[p]==null){
				p++;
			}
			F = b[p];			
			for(int i = p+1;i<10;i++){
				Node prev = t[i-1];
				if(t[i]==null){
					t[i]= prev;
				}
				else{
					prev.next = b[i];
				}
			}
		}
		return F;
	}
	
	public static void main(String[] args) {
		Scanner Sc  = new Scanner(System.in);
		SingleLL ll = new SingleLL();
		System.out.println("Enter the no  of elements to insert: ");
		int n = Sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i = 1;i<=n;i++){
			ll.insert(Sc.nextInt());
		}
		int passes = getNoPasses(ll.head);// finds largest num and returns no of digits
		Node F = rSort(ll.head, passes);
		ll.head = F;// to point the head to new sorted list;
		display(F);
		Sc.close();
	}
}
class Node{
	int data;
	Node next;
	Node(int elem){
		this.data = elem;
		this.next = null;
	}
}
class SingleLL{
	Node head = null;
	Node tail = null;
	
	public void insert(int data) {
		Node t = new Node(data);
		if(head == null){
			head  = t;
			tail = t;
		}
		else{
			tail.next = t;
			tail = t;
		}
	}
	public void delete(int key){
		if(head == null){
			System.out.println("the list is empty...");

		}
		if(head.data == key){
			if(head==tail){
				head = tail = null;
				System.out.println("the list is now empty...");
				return;
			}
			else{
				head = head.next;
				Node ptr=head;
		while(ptr!=null){
			System.out.println(ptr.data + " ");
			ptr =ptr.next;
		}
		return;
			}
		}
		Node itr = head;
		while(itr!=tail && itr.next.data!=key){
			itr=itr.next;
		}
		if(itr==tail){
			System.out.println("element not found to delete...");

		}
		itr.next = itr.next.next;
		itr=head;
		while(itr!=null){
			System.out.println(itr.data + " ");
			itr =itr.next;
		}
	}
}
