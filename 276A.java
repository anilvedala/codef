import java.util.Scanner;
public class Rabbit{
public static void main(String ae[]){
      Scanner sb=new Scanner(System.in);
      String p= sb.nextLine();
      String q[]=p.split(" ");
int n=Integer.parseInt(q[0]);
int k=Integer.parseInt(q[1]);
int f[]=new int[n];
int t[]=new int[n];
int max=0;
     for(int i=0;i<n;i++) { 
	        String h= sb.nextLine();
            String w[]=h.split(" ");
           f[i]=Integer.parseInt(w[0]);
		   t[i]=Integer.parseInt(w[1]);
int joy=0;
		   if(t[i]>k) {
		           joy=f[i]-(t[i]-k);
                   }
           else    {
                   joy=f[i];
                   }
           if(joy>max)  {
                  max=joy;
                   }
			else if ((max==0)&(joy<0)) { max=joy;}
           else   continue;
           }
System.out.println(max);
}
}	   