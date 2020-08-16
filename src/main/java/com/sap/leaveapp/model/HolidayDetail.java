package com.sap.leaveapp.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "T_HOLIDAY_DETAIL")
@NamedQuery(name = "HolidayDetail.findAll", query = "SELECT s FROM HolidayDetail s")
public class HolidayDetail implements Serializable {
	@Id
	@UuidGenerator(name = "dId")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "dId")
	@Column(name = "D_ID", length = 36)
	private String dId;

	@Column(name = "PH_ID")
	private String phId;

	@Column(name = "PH_DESCRIPTION")
	private String phDescription;

	@Column(name = "YEAR")
	private String year;

	@Column(name = "MONTH")
	private String month;

	@Column(name = "DATE")
	private String date;

	@Column(name = "DAY_WEEK")
	private String dayWeek;

	@CreatedBy
	@Column(name = "CREATED_BY")
	private String createdBy;

	@CreatedDate
	@Column(name = "CREATED_ON")
	private Timestamp createdOn;

	@LastModifiedBy
	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@LastModifiedDate
	@Column(name = "UPDATED_ON")
	private Timestamp updatedOn;
}
