package project2;

public class inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=19;
int s=0;
while(n>0)
{
	int r=n%10;
	s=s+(r*r);
	n=n/10;
	if(n==0 && s>9)
	{
		n=s;
		s=0;
		
	}
}
if(s==1)
{
	System.out.println(s+" is happy");
}
else
{
	System.out.println(s+" is not happy");
}
	
	}}
	
