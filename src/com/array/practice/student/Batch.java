package com.array.practice.student;

public class Batch {
	
	int batchId;
	
	String batchName;

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Batch(int batchId, String batchName) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
	}
	
	

}
