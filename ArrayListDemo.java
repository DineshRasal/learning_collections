import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList l1=new ArrayList();

		l1.add(10);
		l1.add(60);
		l1.add(30);
		l1.add(40);

		System.out.println("Original List:"+l1);
		Collections.sort(l1);
		System.out.println("Sorted output:"+l1);
		
		System.out.println("index of:"+l1.indexOf(60));

		//System.out.println("This Element is Available Or Not:"+l1.contain(40));

		//System.out.println("Element At l1.get(2):"+l1.get(2));


		ArrayList l2=new ArrayList();

		l2.add("Dinesh");
		l2.add("Rushi");
		l2.add("Vivek");
		l2.add("Omkar");

		System.out.println("Original List:\n"+l2);
		Collections.sort(l2);
		System.out.println("Sorted output:\n"+l2);
		System.out.println("Element At l2.get(2):"+l2.get(2));
		l2.remove("Omkar");
		System.out.println("After Removing output:\n"+l2);

		l1.addAll(l2);
		System.out.println("merge List:\n"+l1);
		l1.removeAll(l2);
		System.out.println("Newly added removing:\n"+l1);

		l2.clear();
		System.out.println("Delete:"+l2);
		
	}

}