package com.controlvalidation;

public class FeatureControl {
	String feature;
	Integer maxCommitmentCount;
	
	
	public FeatureControl(String feature, Integer maxCommitmentCount) {
		super();
		this.feature = feature;
		this.maxCommitmentCount = maxCommitmentCount;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public Integer getMaxCommitmentCount() {
		return maxCommitmentCount;
	}
	public void setMaxCommitmentCount(Integer maxCommitmentCount) {
		this.maxCommitmentCount = maxCommitmentCount;
	}

}
