package prs.domain.purchase;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import prs.domain.lineitem.PurchaseRequestLineItem;
import prs.domain.status.Status;
import prs.domain.user.User;

@Entity
@Table(name="purchaserequest")
public class PurchaseRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //it is managing the table IDENTITY
	private int id;
	private int userID; // User user, int userID
	private String description;
	private String justification;
	//////
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Timestamp dateNeeded;
	private String deliveryMode;
	private int statusID;
	private double total;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Timestamp submittedDate;


	public PurchaseRequest() {
		id = 0;
		description = "";
		statusID = 0;
		total = 0.0;
		submittedDate = null;
		justification = "";
		deliveryMode = "";
		dateNeeded = null;
	}

	public PurchaseRequest(int id,int userID,String description, String justification, String deliveryMode, int statusID,
			double total) { 
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.deliveryMode = deliveryMode;
		this.statusID = statusID;
		this.total = total;
	}
	public PurchaseRequest(String description, String justification, String deliveryMode, int statusID,
			double total) { 
		setDescription(description);
		setJustification(justification);
		setDeliveryMode(deliveryMode);
		setStatusID(statusID);
		setTotal(total);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser() {
		return userID;
	}

	public void setUser(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public Timestamp getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(Timestamp dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Timestamp getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Timestamp submittedDate) {
		this.submittedDate = submittedDate;
	}

	@Override
	public String toString() {
		return "\nUser: id = " + id + ", userID=" + userID + ", description = " + description + ", justification = "
				+ justification + ", " + "dateNeeded = " + dateNeeded + ", deliveryMode = " + deliveryMode
				+ ", Status =" + statusID + "," + "total= " + total + ", submittedDate = " + submittedDate
				+ "\n, prLineItems=" + "]";

	}

}
