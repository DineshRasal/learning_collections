

import java.util.*;

enum colors{red,green,blue,yellow,saffron}

enum days{Monday,Tuesday,Wensday,Thrusday,Friday,Saturday,Sunday}
enum city{Pune ,mumbai,delhi,nagpur}

public class EnumSetTest
{
	public static void main(String args[])
	{
	List<city> l1=List.of(city.Pune,city.mumbai);
		Set<colors> s1=EnumSet.allOf(colors.class);
		System.out.println("Name of Colors:"+s1);
		//Set<days> s2=EnumSet.Of(days.Monday,days.Friday,days.Sunday,days.Wensday);
		System.out.println("Name Of Days:"+s2);
		Set<colors> s3=EnumSet.noneOf(colors.class);
		System.out.println("Name of Colors:"+s3);
		Set<List> s4=EnumSet.copyOf(l1);
System.out.println("Name of Colors:"+s4);



	}


}