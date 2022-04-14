package java;

public abstract class Person {
	protected String name;

	public abstract String  getName();
	public abstract void setName(String name);
	
	protected Person(String name){
        this.name = name;
    }
	
	
	
	
}
