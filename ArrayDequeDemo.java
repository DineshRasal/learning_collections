
import java.util.*;

class ArrayDequeDemo{
	
	public static void main(String args[])
	{
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();

		ad.add(101);
		ad.add(203);
		ad.add(99);
		ad.add(88);
		ad.add(230);
		ad.add(70);

	System.out.println("ArrayDeque:"+ad);
	ad.offer(33);
	System.out.println("ArrayDeque:"+ad);
	ad.offerFirst(66);
	System.out.println("OfferFirst:"+ad);
	ad.offerLast(22);
	System.out.println("OfferLast:"+ad);

	ad.remove();
	System.out.println("Remove from First:"+ad);
	
	ad.poll();
	System.out.println("Remove from First:"+ad);

	ad.pollLast();
	System.out.println("Delete from Last:"+ad);
	}


}