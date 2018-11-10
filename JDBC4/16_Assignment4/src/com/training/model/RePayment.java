package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="RePayment")
public class RePayment {
	@Id
	private int rePaymentId;
	private double rePayAmount;
	private int inatllementNum;
	public int getRePaymentId() {
		return rePaymentId;
	}
	public void setRePaymentId(int rePaymentId) {
		this.rePaymentId = rePaymentId;
	}
	public double getRePayAmount() {
		return rePayAmount;
	}
	public void setRePayAmount(double rePayAmount) {
		this.rePayAmount = rePayAmount;
	}
	public int getInatllementNum() {
		return inatllementNum;
	}
	public void setInatllementNum(int inatllementNum) {
		this.inatllementNum = inatllementNum;
	}
	@Override
	public String toString() {
		return "RePayment [rePaymentId=" + rePaymentId + ", rePayAmount="
				+ rePayAmount + ", inatllementNum=" + inatllementNum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rePaymentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RePayment other = (RePayment) obj;
		if (rePaymentId != other.rePaymentId)
			return false;
		return true;
	}
	public RePayment(int rePaymentId, double rePayAmount, int inatllementNum) {
		super();
		this.rePaymentId = rePaymentId;
		this.rePayAmount = rePayAmount;
		this.inatllementNum = inatllementNum;
	}
	public RePayment() {
		super();
	}
	

}
