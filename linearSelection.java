package sorting;

import java.util.Scanner;

public class linearSelection {

	public static void main(String[] args) {
		int n=0;int temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements you want to store");
	n=s.nextInt();
	int a[]=new int[100];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	}

}
