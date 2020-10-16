import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
//2

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Stack stack=new Stack(n);
		
		int sequenceToMake[]=new int[n];
		int a[]=new int[n];
		int idx=0;
		ArrayList <String>answer=new ArrayList<String>();
		boolean valid=true;
		
		for(int i=0;i<sequenceToMake.length;i++) {
			sequenceToMake[i]=sc.nextInt();
			a[i]=i+1;
		}

		if(stack.top==-1) {
			while(sequenceToMake[0]!=a[idx]) {
				stack.push(a[idx]);
				//System.out.println("+");
				answer.add("+");
				idx++;
			}
			stack.push(a[idx]);
			//System.out.println("+");
			answer.add("+");
			idx++;
			stack.pop();
			//System.out.println("-");
			answer.add("-");
		}
		
		for(int i=1;i<sequenceToMake.length;i++) {
			
			if(sequenceToMake[i]>sequenceToMake[i-1]) {
				while(sequenceToMake[i]!=a[idx]) {
					stack.push(a[idx]);
					//System.out.println("+");
					answer.add("+");
					idx++;
				}
				stack.push(a[idx]);
				//System.out.println("+");
				answer.add("+");
				idx++;
				stack.pop();
				//System.out.println("-");
				answer.add("-");
			}
			
			if(sequenceToMake[i]<sequenceToMake[i-1]) {
				if(sequenceToMake[i]==stack.top()) {
					stack.pop();
					//System.out.println("-");
					answer.add("-");
				}
				else {
					//System.out.println("NO");
					valid=false;
					break;
				}
			}	
		}
		
		if(valid) {
			for(int i=0;i<answer.size();i++) {
				System.out.println(answer.get(i));
			}
		}else {
			System.out.println("NO");
		}
		
		
		
		
		
		
	}
}

class Stack{
	int data[]; 
	int top;
	
	Stack(int n){
		data=new int[n];
		top=-1;
	}
	
	public void push(int num) {
		data[++top]=num;
	}
	
	public void pop() {		
		top--;
	}
	
	public int top() {
		return data[top];
	}
}