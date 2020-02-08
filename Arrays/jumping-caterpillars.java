import java.util.*;
import java.lang.*;
import java.io.*;
// can be solved in a more optimised way using lcm 
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code &&
	 int t,n,k;
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 t= Integer.parseInt(br.readLine());
	 while(t-->0)
	 {
	     	// n= Integer.parseInt(br.readLine().trim());
	    String[] str= br.readLine().trim().split("\\s+");
	     n= Integer.parseInt(str[0]);
	     k= Integer.parseInt(str[1]);
	    int[] arr= new int[k];
	    str= br.readLine().trim().split("\\s+");
	    for(int i=0;i<k;i++)
	    {
	        arr[i]= Integer.parseInt(str[i]);
	    }
	    boolean[] vis= new boolean[n+1];
	    Arrays.fill(vis,false);
	    for(int i=0;i<k;i++)
	    {
	       for(int j=arr[i];j<=n;j+=arr[i])
	       vis[j]=true;
	    }
	    int ans=0;
	    for(int i=1;i<=n;i++)
	    {
	        if(vis[i]==false)
	        ans++;
	    }
	    System.out.println(ans);
	 }
	 }
}