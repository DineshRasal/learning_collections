import java.util.*;

class QueueDemo
{
	public static void main(String args[])
{
	PriorityQueue<String> pq=new PriorityQueue<String>();
	pq.add("Apple");
	pq.add("Banana");
	pq.add("Grapes");
	pq.add("Guva");

	pq.offer("Orange");

	System.out.println(pq);
	System.out.println("Head Of the Queue:"+pq.peek());
	System.out.println("Head Of the Queue:"+pq.element());

	pq.poll();
	System.out.println(pq);
	
	pq.remove();

	System.out.println(pq);
	}

}

