import java.util.*;

class LinkedListDemo{


	public static void main(String args[]){
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anup");
		l1.add("Aniket");
		l1.add("Sagar");
		l1.add("Rushi");
		l1.add("Ram");
		l1.add("Shyam");//add element at last

		l1.addFirst("Bhaiyya Sheth");//add element at First
		l1.addLast("Santosh");//add element at Last
		l1.push("sachin");//add element at First
		System.out.println("LinkedList :"+l1);
		System.out.println("LinkedList :"+l1.get(3));
		System.out.println("LinkedList First Ement :"+l1.getFirst());
		System.out.println("LinkedList last Element :"+l1.getLast());
		System.out.println("LinkedList First Ement :"+l1.peek());
		System.out.println("LinkedList First Ement :"+l1.peekFirst()); //return first element and null if empty
		System.out.println("LinkedList last Element :"+l1.peekLast()); //return last element and null if empty
		System.out.println("LinkedList First Element Remove:"+l1.remove());
		System.out.println("LinkedList  Element At specific index :"+l1.remove(2));
		System.out.println("LinkedList remove First Element :"+l1.removeFirst());
		System.out.println("LinkedList remove last Element :"+l1.removeLast());

		System.out.println("LinkedList First Element Remove:"+l1.poll());
		System.out.println("LinkedList remove First Element :"+l1.pollFirst());
		System.out.println("LinkedList remove last Element :"+l1.pollLast());

		l1.offer("Suraj");
		l1.offer("Vivek");
		l1.offerFirst("Ashish");
		l1.offerLast("Rohit");

		System.out.println("Contain Method:"+l1.contains("Vivek"));
		System.out.println("Index Of specific Element"+l1.indexOf("Rohit"));
		System.out.println("It Returns Size of Number Elements Present"+l1.size());
		 
		Object[] arr=l1.toArray();
		System.out.println("LinkedList Elements Using toArray()");
		for(Object o:arr){
			System.out.println(o +" ");
		}
			System.out.println();
			
		LinkedList<String> copy=(LinkedList<String>) l1.clone();
		System.out.println("Cloned LinkedList"+copy);
			}
}