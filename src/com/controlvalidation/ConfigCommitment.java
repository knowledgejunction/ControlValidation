package com.controlvalidation;

public class ConfigCommitment {
	String config;
	Integer commitmentCount;
	
	
	
	public ConfigCommitment(String config, Integer commitmentCount) {
		super();
		this.config = config;
		this.commitmentCount = commitmentCount;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public Integer getCommitmentCount() {
		return commitmentCount;
	}
	public void setCommitmentCount(Integer commitmentCount) {
		this.commitmentCount = commitmentCount;
	}
	

}
