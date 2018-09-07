package com.controlvalidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlValidation {
	Map<String,List<String>> featuerConfigMap = new HashMap();
	Map<String,Integer> outputControlMap = new HashMap<>();
	
	
	public boolean validate(List<FeatureControl> conrolList, List<ConfigCommitment> configCommitmentList) {
		//populate mapping
		populateMapping();
		//get feature and control
		for(ConfigCommitment commitment : configCommitmentList) {
			List<String> features = featuerConfigMap.get(commitment.getConfig());
			if(features != null) {
				for(String feature : features) {
					Integer totalControlCount = outputControlMap.get(feature) != null ? outputControlMap.get(feature)+commitment.getCommitmentCount() : commitment.getCommitmentCount();
					outputControlMap.put(feature, totalControlCount);
				}
			}
		}
		//validate if everything under control
		boolean valid = validateControl(conrolList, outputControlMap);
		return valid;
	}
private boolean validateControl(List<FeatureControl> conrolList, Map<String, Integer> outputControlMap2) {
		boolean valid = true;		
		for(FeatureControl featureControl : conrolList) {
			Integer totalControlCount = outputControlMap2.get(featureControl.getFeature());
			if(totalControlCount != null && totalControlCount > featureControl.getMaxCommitmentCount()) {
				System.out.println("Total output for "+featureControl.getFeature()+" and its control count "+totalControlCount);
				valid = false;
			}
		}
		return valid;
	}
private void populateMapping() {
	featuerConfigMap.put("YZSAB", Arrays.asList("SE#C3"));
	featuerConfigMap.put("YZSFG", Arrays.asList("SE#C3"));
}
}
