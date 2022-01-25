package Java_Basics;

public class Basics1 {

	public static void main(String[] args) {
		//Company.tcs();
		Company c = new Company();
		System.out.println(c.sector);
		c.tcs();
		
		Atos a = new Atos();
		a.id=100;
		System.out.println(a.id);
		a.fedex("workday", 45);
		
		
		
		
	}
}
class Company
{		
		String sector = "IT";
		
		public void tcs()
		{
			String name = "Manoj";
			int age = 24;
			int salary = 40;
			System.out.println("Name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Salary is "+salary);
			
		}
}
class Atos
{
	int id;
	static void fedex(String prjct, int membrs)
	{
		System.out.println("Project is "+prjct);
		System.out.println("No. of members in workday "+membrs);
	}
	
	private void sysout() {
		// TODO Auto-generated method stub
		System.out.println("Am in GIT hub Hurrrayyy..!!!!!!!!!!!!!!!");
		System.out.println("Am in GIT hub Hurrrayyy..!!!!!!!!!!!!!!!");
		
		System.out.println("Am in GIT hub Hurrrayyy..!!!!!!!!!!!!!!!");
		System.out.println("Am in GIT hub Hurrrayyy..!!!!!!!!!!!!!!!");
		
	}
}


