package com;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to find its longest palindromic substring");
		Scanner sc = new Scanner(System.in);
		String _s_ = sc.next();
		int _s_Length = _s_.length();
		int maxLength = 1;
		if(_s_.length()<=1 || _s_ == null) {
			System.out.println("The longest palindromic substring is "+_s_);
			System.exit(0);
		}
		boolean[][] table = new boolean[_s_Length][_s_Length];
		String palindromeLongSub = null;
		 for(int k=0;k<_s_.length();k++){
		        for(int i=0;i<_s_Length-k;i++){
		            int j= i+k;
		            if(_s_.charAt(i)==_s_.charAt(j)&&(j-i<=2||table[i+1][j-1])){
		                table[i][j]=true;
		                if(j-i+1>maxLength){
		                   maxLength = j-i+1; 
		                   palindromeLongSub = _s_.substring(i, j+1);
		                }
		            }
		        }
		    } 
		System.out.println(palindromeLongSub);
		sc.close();
	}	
}
