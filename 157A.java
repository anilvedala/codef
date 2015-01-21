import java.util.io;
public class 157A{
public static void main(String ar[]){
             Scanner sb=new Scanner(System.in);
			 String s=sb.nextLine();
			 int n=Integer.parseInt(s),i=0,c=0;
			 int a[]=new int[n];
			 int b[]=new int[n];
			 for(i=0;i<n;i++){
			        String s1=sb.nextLine();
					String s2[]=s1.split(" ");
					for(int j=0;j<n;j++){
					  a[i]=a[i]+(Integer.parseInt(s2[j]));
					  b[j]=b[j]+(Integer.parseInt(s2[j]));
					  }
					  }
			for(i=0;i<n;i++){
			      for(int k=0;k<n;k++){
			       if(a[i]<b[j]) c++;
				   }
              }
            system.out.print(c);			  }}