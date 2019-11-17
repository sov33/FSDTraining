package com.ibm.fsd.capsule.backend.dto;

import com.ibm.fsd.capsule.backend.base.AuditModel;

public class PaymentDtls extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4190401732431914602L;

	private Long id;
	private String txnType;
	private Float amount;
	private String remarks;
	private Long mentorId;
	private String mentorName;
	private Long trainingId;
	private String skillName;
	private Float totalAmountToMentor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}

	@Override
	public String toString() {
		return "PaymentDtls [id=" + id + ", txnType=" + txnType + ", amount=" + amount + ", remarks=" + remarks
				+ ", mentorId=" + mentorId + ", mentorName=" + mentorName + ", trainingId=" + trainingId
				+ ", skillName=" + skillName + ", totalAmountToMentor=" + totalAmountToMentor + "]";
	}

}
