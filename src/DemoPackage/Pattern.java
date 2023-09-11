package DemoPackage;

public class Pattern {
	public static void main(String[] args) {
		//----------for loop-----------
				System.out.println("using for loop");
				for(int i=0; i<5; i++)
				{   
					for(int j=0; j<=i; j++)   
					{   
						System.out.print("*");   
					}   
				System.out.println();   
				
				}
				
			//------------while loop-------------
				System.out.println("using while loop");
				 int i=1;

			        while(i<=5)
			        {
			            int j=1;
			            while(j<=i)
			            {
			                System.out.print("*");
			                j++;
			            }
			            System.out.println();
			            i++;

			        }
			        
			  //-------------do-while loop---------------
			        System.out.println("using do-while loop");
			        int a=1;
			        do {
			        	int b=1;
			        	while(b<=5) {
			        	System.out.print("*");
			        	b++;
			        	}
			        	System.out.println();
			        	 a++;
			        }while(a<=5);
			    
				
			}
		
}
