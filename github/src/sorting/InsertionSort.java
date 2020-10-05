package sorting;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) 
	{
				int n,i;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter size");
				n=sc.nextInt();
				int[] arr=new int[n];
				System.out.println("enter elements");
				for(i=0;i<n;i++)
				{
					arr[i]=sc.nextInt();
				}
				Insertion ob=new Insertion();
				ob.sort(arr);
				ob.print(arr);
	}

		}
		class Insertion
		{
			void sort(int arr[])
			{
				int i,j;
				int n=arr.length;
				for(j=1;j<n;j++)
				{
					int key=arr[j];
					i=j-1;
					while(i>=0 && arr[i]>key)
					{
						arr[i+1]=arr[i];
						i=i-1;
					}
					arr[i+1]=key;
				}
					
			}
			void print(int arr[])
			{
				int n=arr.length;
				int i;
				for(i=0;i<n;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
		}		
