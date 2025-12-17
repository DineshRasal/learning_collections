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
	System.out.println(v1.elements());
	System.out.println(v1.elementsAt(4));
	

	
}

}