package com.springrest.springrest.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employe")
public class Employe {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int contact;
    private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employe(int id, String name, int contact, int sal) {
		
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.sal = sal;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
}