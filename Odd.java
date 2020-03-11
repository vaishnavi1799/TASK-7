import java.util.*;
public class Odd{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(A[j]%2!=0)
			{
				System.out.print(A[j]+" ");
				if(A[j]<10 && A[j]>0)
				{
				System.out.println(A[j]+"*"+"1"+"="+A[j]);
				
				}
				else if(A[j]<100)
				{
					int r=A[j]/10;
					int q=A[j]%10;
					System.out.println(r+"*"+q+"="+r*q+" ");
				}
				else if(A[j]<1000)
				{
					int t=A[j]/100;
					int p=(A[j]%100)/10;
					int q=(A[j]%100)%10;
					System.out.println(t+"*"+p+"*"+q+"="+t*p*q+" ");
				}
				else if(A[j]<10000)
				{
					int s1=A[j]/1000;
					int m=(A[j]%1000)/100;
					int n1=((A[j]%1000)%100)/10;
					int l=((A[j]%1000)%100)%10;
					System.out.println(s1+"*"+m+"*"+n1+"*"+l+"="+s1*m*n1*l+" ");
				}
		}
	}
}
}		

				