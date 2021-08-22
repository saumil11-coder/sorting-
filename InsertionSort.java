package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		int n,key=0;
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number of elements you want to store");
		n=s.nextInt();
		int a[]=new int[100];
		System.out.println("the elements are");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			key=a[i];
			 int j=i-1;
			 while(j>=0&&a[j]>key)
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
