package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnLIst {

	public static void main(String[] args) {
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(29);
		lst.add(98);
		lst.add(54);
		lst.add(10);
		lst.add(2, 100);
		System.out.println(lst);
		
		//remove the data
		lst.remove(2);
		System.out.println(lst);
		
		//check the data
		lst.contains(100);
		System.out.println(lst.contains(100));
		
		//clear the list
		lst.clear();
		System.out.println(lst);
		
		
	}

}
