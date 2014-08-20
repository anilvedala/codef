import java.util.Scanner;
class Karray {
public static void main(String ar[]){
int count=0;
int count1=0;
String l,p;
Scanner sb=new Scanner(System.in);
l= sb.nextLine();
String kr[]=l.split(" ");
int n=Integer.parseInt(kr[0]);
int k=Integer.parseInt(kr[1]);
p=sb.nextLine();
String er[]=p.split(" ");
int a[] =new int[er.length];
for(int i=0;i<n;i++){ 
						        a[i]=Integer.parseInt(er[i]);
                                }
int n1=n/k;
int c[]=new int[n1];
for(int y=1;y<n1;y++){
 for(int j=0;j<k;j++){if (a[j]==a[j+y*k])
     continue;
      else
     count1=count1+1;
     }
     }
	 if(count >n1)
count=n1;
for(int q=1;q<n1;q++)
{int t[]=new int[k];
for(int fu=0;fu<k;fu++){
t[fu]=a[fu];
a[fu]=a[fu+q*k];
a[fu+q*k]=t[fu];
}
for(int y=1;y<n1;y++){
 for(int j=0;j<k;j++){if (a[j]==a[j+y*k])
     continue;
      else
     c[q]=c[q]+1;
     }
     }
	 if(c[q]>n1)
	 c[q]=n1;
	 }
	 c[0]=count1;
	int min=c[0];
	 for(int w=1;w<n1;w++)
	 {
	 if(c[w]<min)
	 min=c[w];
	 }
System.out.println("minimum number of elements to be changed are " +min);}
}

