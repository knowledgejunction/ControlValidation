package com.controlvalidation;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<FeatureControl> controls = Arrays.asList(new FeatureControl("SE#C3", 5));
		List<ConfigCommitment> configs = Arrays.asList(new ConfigCommitment("YZSAB", 5),
				new ConfigCommitment("YZSDE", 5),
				new ConfigCommitment("YZSFG", 3));
		ControlValidation controlValidation = new ControlValidation();
		System.out.println("Control Validation : "+controlValidation.validate(controls, configs));

	}

}
