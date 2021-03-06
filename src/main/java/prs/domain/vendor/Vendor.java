package prs.domain.vendor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import prs.domain.product.Product;


@Entity
public class Vendor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	@Column(name= "ispreapproved")
	private boolean preapproved;
	
	
	public Vendor(String code, String name, String address, String city, String state, String zip, String phone,
			String email, boolean preapproved) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.preapproved = preapproved;
	}

	public Vendor() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPreapproved() {
		return preapproved;
	}
	public void setPreapproved(boolean preapproved) {
		this.preapproved = preapproved;
	}
	@Override
	public String toString() {
		return "User: id = "+id+", code = "+code+", name = "+name+", "+
				"address = "+address+", city = "+city+", State ="+state+","+"zip = "
				+zip+", phone = "+phone + ", email= " +email+", preapproved = "+preapproved;
	}
}
