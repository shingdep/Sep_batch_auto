package package_2_assign_1;

public class Student 
{
	
	int roll_no;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	
	public static void main(String[] args) 
	{
		Student pqr=new Student();
		pqr.display1();
		pqr.display2();
		
		pqr.roll_no=89;
		pqr.age=15;
		System.out.println(pqr.roll_no);
		System.out.println(pqr.age);
	
	}
				
}	
	
	


