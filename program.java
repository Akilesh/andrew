
public class program {
		int x,y;
		void add(int a,int b)
		{
			System.out.println(a+b);
		}
	void add()
	{
		System.out.println(x+y);
	}
	void add (int x,int y,int z)
	{
	System.out.println(x+y-z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			program p=new program();
			p.x=10;
			p.y=20;
			p.add(30,40);
			p.add(50,60,70);
			
			p.add();
		}
	}
}
