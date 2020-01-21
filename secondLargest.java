package Ques;
import java.util.Scanner;
public class SecondLargest {
	

	public static void findSecondLargest(int[] arr,int n) {
		for(int i=0;i<n;i++)
		{
			int temp=0;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j+1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Largest-"+arr[0]);
		System.out.println("Second-"+arr[1]);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		findSecondLargest(arr,n);

	}

	
		
	

}
