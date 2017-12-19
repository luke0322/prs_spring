package prs.domain.lineitem;

import java.io.Serializable;

import javax.persistence.Column;

//import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import prs.domain.purchase.PurchaseRequest;

@Entity
public class PurchaseRequestLineItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int quantity;
	private int purchaseRequestID; //changed to int 12-13-17
	private int productID;

	public PurchaseRequestLineItem() {
		id = 0;
		productID = 0;
		quantity = 0;
		purchaseRequestID = 0;
	}

	public PurchaseRequestLineItem(int quantity, int id, int purchaseRequestID, int productID) {
		this.quantity = quantity;
		this.id = id;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
	}
	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "\npurchaseRequestLineItem [id=" + id + ", purchaseRequestID=" + purchaseRequestID + ", productID="
				+ productID + ", quantity=" + quantity + "]";
	}
}
