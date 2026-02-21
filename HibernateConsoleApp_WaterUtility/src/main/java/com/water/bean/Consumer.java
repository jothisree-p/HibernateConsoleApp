package com.water.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CONSUMER_TBL")
public class Consumer {

    @Id
    @Column(name="CONSUMER_ID")
    private String consumerID;

    @Column(name="FULL_NAME")
    private String fullName;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="METER_NUMBER")
    private String meterNumber;

    @Column(name="CONNECTION_TYPE")
    private String connectionType;

    @Column(name="OUTSTANDING_BALANCE")
    private double outstandingBalance;

	public String getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
		
	}

	@Override
	public String toString() {
		return "Consumer [consumerID=" + consumerID + ", fullName=" + fullName + ", address=" + address
				+ ", meterNumber=" + meterNumber + ", connectionType=" + connectionType + ", outstandingBalance="
				+ outstandingBalance + "]";
	}
	
    
}