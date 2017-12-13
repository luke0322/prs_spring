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
@Table(name="purchaserequestlineitem")
public class PurchaseRequestLineItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int quantity;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "purchaserequestid")
	@JsonIgnore //added to ignore display of purchase request
	private PurchaseRequest purchaseRequest;
	@Column(name="productid")
	private int productID;

	public PurchaseRequestLineItem() {
		id = 0;
		productID = 0;
		quantity = 0;
	}

	public PurchaseRequestLineItem(int quantity, int id, PurchaseRequest purchaseRequest, int productID) {
		this.quantity = quantity;
		this.id = id;
		this.purchaseRequest = purchaseRequest;
		this.productID = productID;
	}
	public PurchaseRequest getPurchaseRequest() {
		return purchaseRequest;
	}

	public void setPurchaseRequest(PurchaseRequest purchaseRequest) {
		this.purchaseRequest = purchaseRequest;
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

	public PurchaseRequest getPurchaserequest() {
		return purchaseRequest;
	}

	public void setPurchaserequest(PurchaseRequest purchaseRequest) {
		this.purchaseRequest = purchaseRequest;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "\npurchaseRequestLineItem [id=" + id + ", purchaseRequestID=" + purchaseRequest + ", productID="
				+ productID + ", quantity=" + quantity + "]";
	}
}
