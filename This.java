package telusko;
//this keyword is used to differentiate the instance and local variable
//mainly it is used when the instance and local variables are same.
public class This {
	 int num1;
	 int num2;
  
	 public This(int num1)
	 {
		 this.num1=num1;
		 
	 }
	 void major(int num2)
	 {
		 this.num2=num2;
	 }
	public static void main(String[] args) {
	This obj=new This(5);
	
	
	obj.num2=5;
	
		System.out.println(obj.num1);
        System.out.println(obj.num2);
	}

}
