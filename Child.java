


	public class Child extends inheritanceparent
	{
		void add()
		{
			System.out.print(a+b);
		}
		Child (int a,int b)
		{
			super(a,b);
		}
		
		public static void main(String[] args) {
			Child C=new Child(10,20);
	C.add();
		}
		

}