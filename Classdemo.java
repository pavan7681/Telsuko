package telusko;
//class is nothing but a blue print of a object.
class Calc
{
    int num1,num2,result;
    
   public void perform()
    {
    	result=num1+num2;
    }
}
public class Classdemo {

	public static void main(String[] args) {
		
		Calc obj=new Calc();
		obj.num1=23;
		obj.num2=35;
		
		obj.perform();
		 
		System.out.println(obj.result);
        
	}

}
