import java.util.*;

class TreeTest{

	public static void main(String args[])
{

	TreeSet<Integer> t1=new TreeSet<Integer>();

	
	t1.add(20);
	t1.add(10);
	t1.add(60);
	t1.add(100);
	t1.add(50);

	System.out.println("TreeSet"+t1);
	System.out.println("Higher"+t1.higher(60));
	System.out.println("Lower"+t1.lower(60));
	//t1.pollFirst();
	//t1.pollLast();
	System.out.println("TreeSet After Poll"+t1);
	System.out.println("Dscending set"+t1.descendingSet());
	System.out.println("HeadSet"+t1.headSet(10,true));
	System.out.println("TailSet"+t1.tailSet(100,true));
	System.out.println("SubSet"+t1.subSet(20,true,100,true));





}

}