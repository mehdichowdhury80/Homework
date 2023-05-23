package hw3JavaVariables;

import java.util.jar.Attributes.Name;

import hw2JavaBasics.MyCar;

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
	
public static void main(String[] args) {
AboutMe aboutMe = new AboutMe();
System.out.println(aboutMe.myName);
System.out.println(aboutMe.iAmFromBangladesh);
	}
	
	
	
	

}
