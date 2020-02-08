import java.util.*;
import java.lang.*;
import java.io.*;
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
	 
	    List<Integer> arr= new ArrayList<>(n);
	    for(int i=0;i<n;i++)
	    {
	        arr.add(Integer.parseInt(str[i]));
	    }
	 Collections.sort(arr,new Comparator<Integer>() {
    @Override
    public int compare(Integer one, Integer two) {
        String a= one.toString()+two.toString();
	       String b= two.toString()+one.toString();
	       return Integer.parseInt(b)-Integer.parseInt(a);
    }
});
	    StringBuilder sb= new StringBuilder();
	    for(int i=0;i<n;i++)
	    sb.append(arr.get(i));
	    System.out.println(sb.toString());
	 }
	 }
}