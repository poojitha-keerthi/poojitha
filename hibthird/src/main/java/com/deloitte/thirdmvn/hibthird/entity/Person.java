package com.deloitte.thirdmvn.hibthird.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Person 
{
	@Id
    String name;
    int age;
    String adress;
    @OneToOne
    @JoinColumn(name="aid")
    AadharCard acard;
    public Person(){}
    public Person(String name, int age, String adress, AadharCard acard) {
		super();
		this.name = name;
		this.age = age;
		this.adress=adress;
		this.acard=acard;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public AadharCard getAcard() {
		return acard;
	}
	public void setAcard(AadharCard acard) {
		this.acard = acard;
	}
}