package com.cg.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.NamedQuery;


@Entity
@Table(name="Mobiles")
/*@NamedQueries(                                    /// <--------------------NAMEDQUERY
		@NamedQuery(name="getMobiles",
		query="SELECT m FROM Mobile m WHERE m.quantity>:qty")
)*/
public class Mobile {
	@Id
	@SequenceGenerator(name="myseq", sequenceName="seq_mobiles",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="myseq")
	
	@Column(name="mobileid")
	private int mobileId;
	
	@Column(name="NAME")
	private String mobileName;
	
	@Column(name="price")
	private double pice;
	
	@Column(name="quantity")
	private int quantity;
	
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName
				+ ", pice=" + pice + ", quantity=" + quantity + "]";
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getPice() {
		return pice;
	}
	public void setPice(double pice) {
		this.pice = pice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileId, String mobileName, double pice, int quantity) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.pice = pice;
		this.quantity = quantity;
	}

}
