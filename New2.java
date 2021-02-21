import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int original, rem,rev=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the value of integer");
	     
	    for(int i=0;i<5;i++)
	    {
	         original = sc.nextInt();
	         rem=0;
	         rev=0;
	         while(original!=0)
	            {
	               rem= original % 10;
	                rev=rev*10 + rem;
	                original= original /10;
	            }
		System.out.println("Reverse of the number is" + rev);
		System.out.println();
	    }
	    
	   
	}
}
