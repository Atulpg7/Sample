package opps.packages.model;


public class Student {
	
	private String name;
	
	public Student(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	
	private String getPassword()
	{
		return "abcd";
	}
}
