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
	@ManyToOne
	@JoinColumn(name = "UserID") 
	private User user; // User user, int userID
	private String description;
	private String justification;
	//////
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Timestamp dateNeeded;
	private String deliveryMode;
	@ManyToOne
	@JoinColumn(name="statusID")
	private Status status;
	private double total;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
	private Timestamp submittedDate;
	private boolean isActive;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//changed line 59 12-13-17 to uncomment
	@JoinColumn(name = "PurchaseRequestID")//lowercase
	private List<PurchaseRequestLineItem> prLineItems;


	public PurchaseRequest() {
		id = 0;
		description = "";
		status = null;
		total = 0.0;
		submittedDate = null;
		prLineItems = new ArrayList<>();
		justification = "";
		deliveryMode = "";
		dateNeeded = null;
		isActive = true;
	}

	public PurchaseRequest(int id,User user,String description, String justification, String deliveryMode, Status status,
			double total) { 
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.justification = justification;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		prLineItems = new ArrayList<PurchaseRequestLineItem>();
	}
	public PurchaseRequest(String description, String justification, String deliveryMode, Status status,
			double total) { 
		setDescription(description);
		setJustification(justification);
		setDeliveryMode(deliveryMode);
		setStatus(status);
		setTotal(total);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public List<PurchaseRequestLineItem> getPrLineItems() {
		return prLineItems;
	}

	public void setPrLineItems(List<PurchaseRequestLineItem> prLineItems) {
		this.prLineItems = prLineItems;
	}

	@Override
	public String toString() {
		return "\nUser: id = " + id + ", userID=" + user + ", description = " + description + ", justification = "
				+ justification + ", " + "dateNeeded = " + dateNeeded + ", deliveryMode = " + deliveryMode
				+ ", Status =" + status + "," + "total= " + total + ", submittedDate = " + submittedDate
				+ "\n, prLineItems=" + prLineItems + "]";

	}

}
