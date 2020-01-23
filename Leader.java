package Ques;

import java.util.Scanner;
public class Leader {

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
		
	int large=arr[0];
	int newarr[]=new int[100];
	int j=0;
	for(int i=0;i<n;i++)
	{
		if(large<=arr[i])
		{
			large=arr[i];
			newarr[j]=large;
			j++;
		}
	}
	newarr[j]=arr[n-1];
	j++;
	for(int i=0;i<j;i++)
	{
		System.out.println(newarr[i]);
	}
	
	}

}
