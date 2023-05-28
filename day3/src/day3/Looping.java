package day3;
import java.util.*;
public class Looping {

	public static void main(String[] args) {
		int n,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		System.out.println("the total digits are :"+c);
	}

}
