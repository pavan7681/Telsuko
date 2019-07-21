package telusko;

public class Iterationstatement {

	public static void main(String[] args) {
		int n = 6;
		/*
		while(n<=5)
		{
			System.out.println("hello");
			n++;
		}
        */
		//so we have seen the while loop execution,it executes only if the condition is true.
		//if the condition is false but u want it to be executed once then we must use do-while loop.
		do
		{
			System.out.println("hello");
		}while(n<=5);//here the condition is not satisfying but it will be executed once.
	}

}
