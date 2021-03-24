package com;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to find its longest palindromic substring");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sLength = s.length();
		int maxLength = 1;
		if(s.length()<=1 || s == null) {
			System.out.println("The longest palindromic substring is "+s);
			System.exit(0);
		}
		boolean[][] table = new boolean[sLength][sLength];
		String palindromeLongSub = null;
		 for(int k=0;k<s.length();k++){
		        for(int i=0;i<sLength-k;i++){
		            int j= i+k;
		            if(s.charAt(i)==s.charAt(j)&&(j-i<=2||table[i+1][j-1])){
		                table[i][j]=true;
		                if(j-i+1>maxLength){
		                   maxLength = j-i+1; 
		                   palindromeLongSub = s.substring(i, j+1);
		                }
		            }
		        }
		    } 
		System.out.println(palindromeLongSub);
		sc.close();
	}	
}
