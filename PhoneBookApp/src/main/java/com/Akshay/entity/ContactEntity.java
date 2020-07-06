package com.Akshay.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_DTLS")
public class ContactEntity implements Serializable 
{
	@Id
	@Column(name="CONTACT_ID")
	@SequenceGenerator(
			name="cid_seq_gen",
	        sequenceName = "CONTACT_ID_SEQ",
	        allocationSize = 1
	        )
	@GeneratedValue(
			generator="cid_seq_gen",
	        strategy = GenerationType.SEQUENCE
	        )
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE )
	private Date createdDate;
	
	@UpdateTimestamp
	private Date updatedDate;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


}
