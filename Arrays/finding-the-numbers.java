import java.util.*;
import java.lang.*;
import java.io.*;
// 2n+2 numbers are given, n numbers are repeated. Find the 2 numbers which are not repeated
// divide array into two sets based on any set bit of xor of all elemtnts of array, x lies in one and y lies in other 

/**
Question 2: You are given an array of n+2 elements. All elements of the array are in range 1 to n. And all elements occur once except two numbers which occur twice
 Sol1: Same logic can be used. or Use positive and negative logic.
Sol 2: Use the same array as hashset, by using mod n, /n.The idea is to store two informations at index i, the current element and 
the frequency of i. 

**/
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code &&
	 int t,n;
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 t= Integer.parseInt(br.readLine());
	 while(t-->0)
	 {
	     	 n= Integer.parseInt(br.readLine().trim());
	    String[] str= br.readLine().trim().split("\\s+");
	    n=2*n+2;
	    int[] arr= new int[n];
	    int xor=0;
	    
	    for(int i=0;i<n;i++)
	    {
	        arr[i]= Integer.parseInt(str[i]);
	        xor=xor^arr[i];
	    }
	    int x=0;
	    int y=0;
	    int setbit= xor&~(xor-1);
	    for(int i=0;i<n;i++)
	    {
	        if((arr[i]&setbit)>=1)
	        x=x^arr[i];
	        else
	        y=y^arr[i];
	    }
	    if(x<y)
	    System.out.println(x+" "+y);
	    else
	    System.out.println(y+" "+x);
	    
	 }
	 }
}