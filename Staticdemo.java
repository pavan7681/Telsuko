package telusko;
class Emp
{
	int eid;
	int ems;
	 static String ceo;
	static {
		ceo="venkat";
	}
	
	public void show() {
		
		System.out.println(eid + ":" + ems +":" + ceo);
		
	}
}

public class Staticdemo {

	public static void main(String[] args) {
          Emp pavan=new Emp();
          Emp mohan=new Emp();

          pavan.eid=81;
          pavan.ems=81000;
        //  pavan.ceo="venkat";
          
          mohan.eid=81;
          mohan.ems=81000;
          //mohan.ceo="venkat";
          

	}

}
