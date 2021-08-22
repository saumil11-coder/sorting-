package sorting;

import java.util.Scanner;

public class bubbleSorting {

	public static void main(String[] args) {
	int n,temp=0;
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number of elements you want to store");
	n=s.nextInt();
	int a[]=new int[100];
	System.out.println("the elements are");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)// compare (1st,2nd) (2nd,3rd) and so on;
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	}

}
