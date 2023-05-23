package hw4JavaVariables;

public class AboutMe {
	public String schoolName;// here variable is declared
	public String myName = "Mehdi";// here variable is initialized
	public byte myAge = 43;
	public short myBrother = 2;
	public int mySister = 0;
	public long myCousin = 10l;
	public float mySalary = 1.111111f;
	public double myIncome = 1.11111111111;
	public char mySelf = 'M';
	public boolean iAmFromBangladesh = true;
	public String myFriend = "My friend Alex";
	public byte AlexAge = 40;
	public short alexBrother = 5;
	public int alexSister = 9;
	public long alexCousine = 2;
	public float alexSalary = 1.1111f;
	public double alexIncome = 1.1111111;
	public char alexSex = 'M';
	public boolean alexIsUsCitizen = true;

	public AboutMe() {
		System.out.println("This is all about us"); // constructor is declared

	}

	public void aboutMe() {
		System.out.println("My name:" + myName + "\nMy age:" + myAge + "\nMy Btother:" + myBrother + "\nMysister:"
				+ mySister + "\nMy Cousin:" + myCousin + "\nMy Salary:" + mySalary + "\nMy income" + myIncome
				+ "\nMy self" + mySelf + "i m from Bangladesh" + iAmFromBangladesh);
		System.out.println("My Friend Name:" + myFriend + "\nAlex age is:" + AlexAge + "\nAlex Brother:" + alexBrother
				+ "\nAlex Sister:" + alexSister + "\nAlex Cousin:" + alexCousine + "\nAlex Salary:" + alexSalary
				+ "\nAlex Sex:" + alexSex + "\nAlex is us Citizin:" + alexIsUsCitizen);

	}

}
