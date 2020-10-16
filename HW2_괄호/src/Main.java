import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//2
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int top;
		String a[]=new String[n];
		
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			
			top=-1;
			
			for(int j=0;j<s[i].length();j++) {
				if(s[i].charAt(j)=='(') top++;
				if(s[i].charAt(j)==')') top--;
				if(top<-1) a[i]="NO";
			}
			if((a[i]!="NO")&&(top==-1)) a[i]="YES";
			else a[i]="NO";
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
}
