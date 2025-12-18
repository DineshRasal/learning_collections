import java.util.*;

class SetDemo
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wensday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");
		hs.add(null);
		
		System.out.println("HashSet:"+hs);
							   System.out.println("Size:"+hs.size());
		System.out.println("Contains :"+hs.contains("Sunday"));
		System.out.println("HashSet:"+hs);
		System.out.println("Is Empty:"+hs.isEmpty());
		hs.remove("null");
		System.out.println("After Removing null"+hs);


		LinkedHashSet<String> hs1=new LinkedHashSet<String>();
		hs1.add("Monday");
		hs1.add("Tuesday");
		hs1.add("Wensday");
		hs1.add("Thursday");
		hs1.add("Friday");
		hs1.add("Saturday");
		hs1.add("Sunday");
		hs1.add(null);
		System.out.println("LinkedHashSet:"+hs1);
		

		
		
		TreeSet<String> hs2=new TreeSet<String>();
		hs2.add("Monday");
		hs2.add("Tuesday");
		hs2.add("Wensday");
		hs2.add("Thursday");
		hs2.add("Friday");
		hs2.add("Saturday");
		hs2.add("Sunday");
		//hs2.add(null);
		System.out.println("TreeSet:"+hs2);
		hs2.clear();
		System.out.println("TreeSet:"+hs2);
	}

}