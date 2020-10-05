package more;
import java.util.*;
import java.util.Scanner;
public class BinaryAdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers a and b");
		String a=sc.nextLine();
		String b=sc.nextLine();
		Addition ob=new Addition();
		String res=ob.Add(a,b);
		System.out.println("The result is"+res);
	}
}
class Addition
{
	 public static String Add(String a,String b)
	{
		int i,j;
		StringBuilder sb=new StringBuilder();
		i=a.length()-1;
		j=b.length()-1;
		int carry=0;
		
		while(i>=0 || j>=0)
		{	
			int sum=carry;
			sum+=((i>=0)?(a.charAt(i)-'0'):0);
			sum+=((j>=0)?(b.charAt(j)-'0'):0);
			sb.append(sum%2);
			carry=sum/2;
			i--;
			j--;
		}
		if(carry!=0)
		{
			sb.append(carry);
		}
		return(sb.reverse().toString());
	}
}
