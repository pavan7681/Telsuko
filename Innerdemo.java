package telusko;
/*        inner classes
 *        -member class
 *        -static class
 *        -anonymous class
 */
class Outer
{
	public void display()
	{
		System.out.println("it is outer");
	}
	public class Inner
	{
		public void show()
		{
			System.out.println("it is inner");
		}
	}
}


public class Innerdemo {

	public static void main(String[] args) {
	
		Outer obj=new Outer();
		obj.display();
        Outer.Inner obj1=obj. new Inner();
        obj1.show();
	}

}
