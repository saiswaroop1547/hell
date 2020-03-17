package beanpostprocessor;

public class Employee 
{
private String name,dept;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}
public void init()
{
	System.out.println("init in emp");
}
public void display()
{
	System.out.println("Employee name:"  +name +   "Department name:"+dept);
}
}
