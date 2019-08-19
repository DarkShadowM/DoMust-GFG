package com.MD.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9
*/

public class MissingNoInArray {

	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases=Integer.parseInt(br.readLine());
		int i=0;
		while(i<testCases){
		int n=Integer.parseInt(br.readLine());
		String s = br.readLine();
		String arr[]=s.split(" ");
		if(arr.length>0) {
		int total=0;
		for(int j=0;j<n-1;j++) {
			total=total+Integer.parseInt(arr[j]);
		}		
		System.out.println(n*(n+1)/2-total);
	
		}
		else {
		System.out.println("Invalid Array");	
		}
		i++;
		}
			
	}
}
