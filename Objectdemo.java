package telusko;
class Calc
{
	int num1;
	int num2;
	int result;

public Calc()
{
	num1=5;
	num2=5;
	System.out.println("in constructor");
}
}
public class Objectdemo {

	public static void main(String[] args) {
		Calc obj= new Calc();
		System.out.println(obj.num1);
	}
}	

