package com.array.practice.student;


public class Student {
	
	private int studentId;
	private	String studentName;
	private String addresss;
	private Batch batch;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public Student(int studentId, String studentName, String addresss, Batch batch) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.addresss = addresss;
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", addresss=" + addresss
				+ ", batch=" + batch + "]";
	}
	public Student() {
	}

}
