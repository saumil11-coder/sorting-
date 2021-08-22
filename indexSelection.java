package sorting;

import java.util.Scanner;

public class indexSelection {

	public static void main(String[] args) {
		int n,temp=0;
Scanner s= new Scanner(System.in);
System.out.println("enter the number of elements ");
n=s.nextInt();
int a[]=new int[100];
System.out.println("the elements are:");
for(int i=0;i<n;i++) {
a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++)
{
	int min=a[i];
	int p=i;
	for(int j=i+1;j<n;j++)// we will get the minimum and get it on the top after swapping 
	{
		if(a[j]<min)
		{
			min=a[j];
			p=j;
		}
	}
	temp=a[i];// then start swapping 
	a[i]=a[p];
	a[p]=temp;
}
System.out.println("the sorted array is");
for(int i=0;i<n;i++)
{
	System.out.println(a[i]);
}
	}

}
