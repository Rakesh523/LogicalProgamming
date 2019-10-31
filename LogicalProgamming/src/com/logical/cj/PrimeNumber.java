package com.logical.cj;

public class PrimeNumber {
	public static void isAPrimaryNumber(int num) {
		boolean flag=false;
		double numSqr = Math.sqrt(num);
		if (num==0 || num==1) {
			System.out.println("Given Number "+num+" Is Not A Prime Number");
		}
		else{
			for(int i=2;i<=numSqr;i++) {
				if (num%i == 0) {
					System.out.println("Given Number "+num+" Is Not A Prime Number");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("Given Number "+num+" Is A Prime Number");
			}
		}
	}

	public static void main(String[] args) {
		isAPrimaryNumber(97);
	}
}
