package project2;

public class task{
void div(int a,int b) 
{		
int c=0;
c=a/b;
try {
		return;	
	}catch (Exception e)
		{
		System.out.print("Invalid operation");
		}
System.out.println(c);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
task a= new task();
a.div(6,2);
a.div(5,0);
a.div(8, 4);
	}
}
