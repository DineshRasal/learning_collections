import java.util.*;

class Student1{


	public static void main(String args[]){


		

		ArrayList l1=new ArrayList();
		l1.add(101);
		l1.add("Rushi");
		l1.add("Male");
		l1.add("pune");
		
		ArrayList l2=new ArrayList();
		l2.add(102);
		l2.add("Nikita");
		l2.add("female");
		l2.add("pune");

		l1.addAll(l2);
		l1.set(3,"Rambhau");
		System.out.println(l1);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext()){
		

			System.out.println(itr.next());
		}
	}
}