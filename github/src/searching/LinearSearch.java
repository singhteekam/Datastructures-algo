package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter nos to be searched");
		int x=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Linear ob=new Linear();
		int result=ob.search(a, x);
		if(result==-1)
			System.out.println("not found");
		else
			System.out.println("found at" +result);
	}
}
class Linear
{
	public static int search(int a[],int x)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				return (i+1);
			}
		}
		return -1;
	}
}
