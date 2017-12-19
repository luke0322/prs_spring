package prs.domain.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import prs.domain.vendor.Vendor;

@Entity
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int vendorID;
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;
	
	public Product() {
		id = 0;
		vendorID = 0;
		partNumber = "";
		name = "";
		price = 0.0;
		unit = "";
		photoPath = "";
	}
	public Product(int id, int vendorID, String partNumber, String name, double price, String unit,
			String photoPath) {
		super();
		this.id = id;
		this.vendorID = vendorID;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.photoPath = photoPath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVendor() {
		return vendorID;
	}
	public void setVendor(int vendorID) {
		this.vendorID = vendorID;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
@Override
public String toString() {
	return "id = "+id+", Vendor ID = "+vendorID+", Part Number = "+partNumber+", "+
			"name = "+name+", price = "+price+", Unit ="+unit+","+"Photo Path= "
			+photoPath;
	}
}

