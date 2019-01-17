import java.util.Scanner;
public class caladd {
	public static void main(String args[]){
		float a,b,res;
		char choice,ch;
		Scanner scan=new Scanner(System.in);
		do {
		    System.out.println("1. Add Two Numbers\n");
		    System.out.println("2. Exit\n\n");
		    System.out.println("Enter your choice : \n");
		    choice=scan.next().charAt(0);
		    switch(choice){
			case '1' : System.out.println(" Enter Two Numbers: ");		
				   a=scan.nextFloat();
				   b=scan.nextFloat();
				   res=a+b;	
				   System.out.println("Result= "+res);
				   break;
			case '2' : System.exit(0);
				   break;
			default: System.out.println("Invalid Choice!!! ");
				 break;
		  }
			System.out.println("\n----------------------------------\n");

		}while(choice!=2);
}}
