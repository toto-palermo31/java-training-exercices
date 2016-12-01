package io.robusta.people;

/**
 * Created by Robusta Code
 */
public class User /* extends Object */{

    public String name;
    String email;
    private int age;
    Address adress;
    

    public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

    
    
	public User(String name, String email, int age, Address adress) {
		super();
		this.name = name;
		this.email = email;
		this.setAge(age);
		this.adress = adress;
	}



	@Override // override Object.toString()
    public String toString() {
        return this.name+" is "+getAge()+" years old";
    }



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

}
