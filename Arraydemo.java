package telusko;

public class Arraydemo {

	public static void main(String[] args) {
	//one - dimensional array
		int a[]= {8,4,3,2};
		//int a[]=new int[4];*another way of declaration
		
		int b[]= {6,7,8,9};
		int c[]= {8,9,6,5};
		int d[]= {7,1,6,5};
	//two - dimensional array	
		int e[][] = {
				{6,7,8,9},
				{8,9,6,5},
				{7,1,6,5}
				
							
		};
		System.out.println(e[0][2]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+e[i][j]);
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<4;i++)
		{
			System.out.print(" "+a[i]);
		}
		

   
}
}