package com.logical.cj;

import java.util.Scanner;

public class ArraySortingNumber {
	private static final Scanner scanner=new Scanner(System.in);

	public static void shortingOfNumber(int arrNum[]) {
		int temp=0;
		System.out.print("Inserted Array Is As Follow :: ");
		for(int i=0;i<arrNum.length;i++) {
			System.out.print(arrNum[i]+" ");
		}
		System.out.println("");
		System.out.print("*Shorted Array Is As Follow :: ");
		for(int i=0;i<arrNum.length;i++) {
			for(int j=i+1;j<arrNum.length;j++) {
				if(arrNum[i]>arrNum[j]) {
					temp=arrNum[j];
					arrNum[j]=arrNum[i];
					arrNum[i]=temp;
				}
			}
		}
		for(int i=0;i<arrNum.length-1;i++) {
			System.out.print(arrNum[i]+" ");
		}
		System.out.print(arrNum[arrNum.length-1]);	
	}

	public static void main(String[] args) {
		int n=0;
		System.out.println("Please Enter The Number Of Eelement In Array :: ");
		n=scanner.nextInt();
		int unsortedArray[]=new int[n];
		System.out.println("Please Enter The Elements Of Array :: ");
		for(int i=0;i<n;i++) {
			unsortedArray[i]=scanner.nextInt();
		}
		shortingOfNumber(unsortedArray);
	}
}
