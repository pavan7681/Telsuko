package telusko;
//method overload means using same method with different parameters
public class Overloading {
	int n;
	int n2;
	int n3;
	public Overloading() {
		System.out.println("default constructor");
	}
	public Overloading(int k) {
		n=k;
		System.out.println(n);
	}
	public Overloading(int i,int j) {
		n2=i;
		n3=j;
		System.out.println(n2+n3);
	}
     
	void pavan() {
		System.out.println("i am pavan");
	}
	void pavan(int n1)
	{
		System.out.println(n1);
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading(8,9);
		obj.pavan();
		obj.pavan(5);
		

	}

}
