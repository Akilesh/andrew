package project2;

public class Employee {
int Salary;
void display()
{
	System.out.print(Salary);
}
} 
class Program extends Employee
{
	int bonus;
	void display()
	{
		System.out.print(Salary+bonus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Program p=new Program();
p.Salary=15000;
p.bonus=15000;
p.display();
	}

}
