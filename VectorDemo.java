import java.util.*;

class VectorDemo
{
	public static void main(String args[]){
		
	Vector<String> v1=new Vector<String>();
	
	v1.add("TATA");
	v1.add("KIA");
	v1.add("TOYOTA");
	v1.add("FERARI");
	v1.add("FERARI");
	
	v1.addElement("SIERRA");

	System.out.println(v1);
	System.out.println(v1.lastElement());
	System.out.println(v1.firstElement());
	System.out.println(v1.elements());
	System.out.println(v1.elementAt(4));

	 System.out.println("Capacity: " + v1.capacity());
	System.out.println("Size: " + v1.size());
	System.out.println("Index of FERARI: " + v1.indexOf("FERARI"));
	System.out.println("Element at index 2: " + v1.get(2));
        System.out.println("Before set(): " + v1.set(1, "HONDA"));
	System.out.println("After set(): " + v1);
        System.out.println("Before remove(): " + v1.remove(3));
	System.out.println("After remove(): " + v1);
	System.out.println("Is Vector empty? " + v1.isEmpty());
	
	Vector<String> copy=(Vector<String>) v1.clone();
	System.out.println("Cloned Vector: " + copy);
	
	System.out.println("SubList from (1 to 3): " + v1.subList(1, 3));

	System.out.println("toArray Method");
	Object[] arr = v1.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");

}
}

}