package telusko;

public class Selectiondemo2 {

	public static void main(String[] args) {
	 
		int i=8;
		
		int j=0;
		/*
		if(i>6)
		{
			j=2;
		}
		else
		{
			j=8;
		}
		*/
		//instead of writing this code we can write a single code by using terenary operator
		//?: -> condition?exp1:exp2(syntax of terenary)
		j = i>6?2:8;
		System.out.print(j);

	}

}
