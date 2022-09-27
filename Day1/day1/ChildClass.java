package week3.day1;

public class ChildClass extends GrandParent
{
public void childhouse()
{
	System.out.println("childhouse");
}


	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.childhouse();
		obj.House1();
		obj.House2();
		
	

	}

}
