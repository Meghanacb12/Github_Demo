package DemoPackage;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int evensum=0,oddsum=0,evenavg=0,oddavg=0,evencount=0,oddcount=0;
		
		Scanner scan=new Scanner(System.in);
		//create a scanner object for input
		System.out.println("enter the size" );
	   int size=scan.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();		
		}
		//----------sum--------
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				evensum=evensum+arr[i];
				evencount++;
			}
			else {
				oddsum=oddsum+arr[i];
				oddcount++;
			}
			
		}
		System.out.println("sum of even numbers are: " +evensum);
		System.out.println("sum of odd numbers are: " +oddsum);
		
		//---------average-----------
		evenavg=evensum/evencount;
		oddavg=oddsum/oddcount;
		System.out.println("Average of even numbers are: " +evenavg);
		System.out.println("Average of odd numbers are: " +oddavg);
		
	}
}
