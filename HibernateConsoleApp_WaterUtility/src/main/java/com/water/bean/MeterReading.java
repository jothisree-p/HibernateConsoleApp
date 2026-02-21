package com.water.bean;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="METER_READING_TBL")
public class MeterReading {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reading_gen")
    @SequenceGenerator(name="reading_gen", sequenceName="READING_SEQ", allocationSize=1)

    @Column(name="READING_ID")
    private int readingID;

    @Column(name="CONSUMER_ID")
    private String consumerID;

    @Column(name="METER_NUMBER")
    private String meterNumber;

    @Column(name="READING_DATE")
    private Date readingDate;

    @Column(name="READING_VALUE")   // ✅ FIX
    private double readingValue;

    @Column(name="RECORDED_BY")
    private String recordedBy;

	public int getReadingID() {
		return readingID;
	}

	public void setReadingID(int readingID) {
		this.readingID = readingID;
	}

	public String getConsumerID() {
		return consumerID;
	}

	public void setConsumerID(String consumerID) {
		this.consumerID = consumerID;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public Date getReadingDate() {
		return readingDate;
	}

	public void setReadingDate(Date readingDate) {
		this.readingDate = readingDate;
	}

	public double getReadingValue() {
		return readingValue;
	}

	public void setReadingValue(double readingValue) {
		this.readingValue = readingValue;
	}

	public String getRecordedBy() {
		return recordedBy;
	}

	public void setRecordedBy(String recordedBy) {
		this.recordedBy = recordedBy;
		
	}

	@Override
	public String toString() {
		return "MeterReading [readingID=" + readingID + ", consumerID=" + consumerID + ", meterNumber=" + meterNumber
				+ ", readingDate=" + readingDate + ", readingValue=" + readingValue + ", recordedBy=" + recordedBy
				+ "]";
	}

}