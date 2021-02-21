/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Windows_94
 */
public class User 
{
	//Attributes
	String fName, lName, email;
	int age;
	
	//Constructor
	public User (String fName, String lName, String email, int age)
	{
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.age = age;
	}
	
	//Getters
	public String getFName()
	{ return fName; }
	
	public String getLName()
	{ return lName; }
	
	public String getEmail()
	{ return email; }
	
	public int getAge()
	{ return age; }
	
	//Setters
	public void setFName(String input)
	{ this.fName = input; }
	
	public void setLName(String input)
	{ this.lName = input; }
	
	public void setEmail(String input)
	{ this.email = input; }
	
	public void setAge(int input)
	{ this.age = input; }
	
	//Methods
	@Override 
	public String toString()
	{
		//TODO
		return "";
	}
}
