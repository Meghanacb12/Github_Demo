package DemoPackage;

public class RightTrianglePattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----------for loop-----------
				System.out.println("using for loop");
				 int i,j,n=5;
				  
			        // outer loop to handle rows
			        for (i = n; i >= 1; i--) {
			  
			            // inner loop to print spaces.
			            for (j = 1; j < i; j++) {
			                System.out.print(" ");
			            }
			  
			            // inner loop to print stars.
			            for (j = 0; j <= n - i; j++) {
			                System.out.print("*");
			            }
			  
			            // printing new line for each row
			            System.out.println();
			        }
		//-----------while loop------------
			        System.out.println("using while loop");
			       	int  i1=1,j1;
			    	while(i1<=n)
			                   {
			                         j1=0;
			                          while(j1++<(n-i1))
			                    
			                           {
			                                   System.out.print(" "); 
			                           }
			    	       j1=0;
			                         while(j1<i1)
			                           {
			                                   System.out.print("*");
			                                   j1++;
			                           }
			                         System.out.println();
			                         i1++;
			                   } 

		}
}

