package com;

import java.util.Scanner;

public class BinaryCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number to convert");
		Scanner sc = new Scanner(System.in);
		int numToConvert = sc.nextInt();
		System.out.println(binaryReversal(numToConvert));
		sc.close();
	}
	public static int binaryReversal(int str) {
		// convert integer to binary
		String bin = Integer.toBinaryString(str);
		int num = Integer.parseInt(bin);
		// Pad the binary to N*8 bits
		String paddedNum = String.format("%08d", num);
		// Reverse the padded String
		String reversedString = new StringBuilder(paddedNum).reverse().toString();
		// convert to decimal
		int finalDecimal = Integer.parseInt(reversedString, 2);
		return finalDecimal;
		
	}
	

}
