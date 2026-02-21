package com.water.bean;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="BILL_TBL")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_gen")
    @SequenceGenerator(name="bill_gen", sequenceName="BILL_SEQ", allocationSize=1)
    
    @Column(name="BILL_ID")   // ✅ FIX
    private int billID;

    @Column(name="CONSUMER_ID")
    private String consumerID;

    @Column(name="BILLING_PERIOD_FROM")
    private Date billingPeriodFrom;

    @Column(name="BILLING_PERIOD_TO")
    private Date billingPeriodTo;

    @Column(name="UNITS_CONSUMED")   // ✅ FIX
    private double unitsConsumed;

    @Column(name="AMOUNT")
    private double amount;

    @Column(name="BILL_DATE")
    private Date billDate;

    @Column(name="STATUS")
    private String status;

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public String getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}

	public Date getBillingPeriodFrom() {
		return billingPeriodFrom;
	}

	public void setBillingPeriodFrom(Date billingPeriodFrom) {
		this.billingPeriodFrom = billingPeriodFrom;
	}

	public Date getBillingPeriodTo() {
		return billingPeriodTo;
	}

	public void setBillingPeriodTo(Date billingPeriodTo) {
		this.billingPeriodTo = billingPeriodTo;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bill [billID=" + billID + ", consumerID=" + consumerID + ", billingPeriodFrom=" + billingPeriodFrom
				+ ", billingPeriodTo=" + billingPeriodTo + ", unitsConsumed=" + unitsConsumed + ", amount=" + amount
				+ ", billDate=" + billDate + ", status=" + status + "]";
	}

}