import java.util.*;

class LinkedListDemo{


	public static void main(String args[]){


		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anup");
		l1.add("Rushi");
		l1.add("Male");
		l1.add("pune");//add element at last

		l1.addFirst("Bhaiyya Sheth");//add element at First
		l1.addLast("Santosh");//add element at Last
		l1.push("sachin");//add element at First
		
		System.out.println("LinkedList :"+l1);

		System.out.println("LinkedList :"+l1.get(3));
		System.out.println("LinkedList First Ement :"+l1.getFirst());
		System.out.println("LinkedList last Element :"+l1.getLast());

		System.out.println("LinkedList First Ement :"+l1.peek());

		System.out.println("LinkedList First Ement :"+l1.peekFirst());
		System.out.println("LinkedList last Element :"+l1.peekLast());


		
		
			}
}