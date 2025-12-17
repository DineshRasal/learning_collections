import java.util.*;

class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> s1=new Stack<Integer>();
		
		
		Boolean res=s1.empty();

		if(res==true){

			System.out.println("Insert The Data");
		s1.push(10);
		s1.push(20);
		s1.push(255);
		s1.push(30);
		s1.push(80);
		s1.push(60);
		System.out.println("Stack Elements:"+s1);
		System.out.println("Stack peek:"+s1.peek());
		s1.pop();
		s1.pop();
		System.out.println("Stack peek:"+s1.peek());

		System.out.println("Stack element index:"+s1.search(255));
		System.out.println("Stack element not present:"+s1.search(265));

		}
		else{

			System.out.println("Stack is not empty no need To insert data");
		}

		
	}

}